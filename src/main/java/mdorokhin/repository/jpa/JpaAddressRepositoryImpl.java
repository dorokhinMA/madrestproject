package mdorokhin.repository.jpa;

import mdorokhin.model.Address;
import mdorokhin.repository.AddressRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Repository
@Transactional(readOnly = true)
public class JpaAddressRepositoryImpl implements AddressRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public Address save(Address address) {

        if (address.isNew()) {
            em.persist(address);
        } else {
            em.merge(address);
        }
        return address;
    }

    @Override
    @Transactional
    public boolean remove(Integer id) {
        return em.createNamedQuery(Address.REMOVE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Address getById(Integer id) {
        return em.find(Address.class, id);
    }

    @Override
    public List<Address> getAll() {
        List<Address> resultList = em.createNamedQuery(Address.ALL, Address.class).getResultList();
        return resultList;
    }

}
