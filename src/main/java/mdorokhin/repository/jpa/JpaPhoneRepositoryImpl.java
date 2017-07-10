package mdorokhin.repository.jpa;

import mdorokhin.model.Address;
import mdorokhin.model.Phone;
import mdorokhin.repository.PhoneRepository;
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
public class JpaPhoneRepositoryImpl implements PhoneRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public Phone save(Phone phone) {

        if (phone.isNew()) {
            em.persist(phone);
        } else {
            em.merge(phone);
        }
        return phone;
    }

    @Override
    @Transactional
    public boolean remove(Integer id) {
        return em.createNamedQuery(Phone.REMOVE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Phone getById(Integer id) {
        return em.find(Phone.class, id);
    }

    @Override
    public Phone getByNumber(String number) {
        return null;
    }

    @Override
    public List<Phone> getAll() {
        return em.createNamedQuery(Phone.ALL, Phone.class).getResultList();
    }
}
