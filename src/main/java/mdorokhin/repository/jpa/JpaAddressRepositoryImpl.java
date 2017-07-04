package mdorokhin.repository.jpa;

import mdorokhin.model.Address;
import mdorokhin.repository.AddressRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Repository
@Transactional(readOnly = true)
public class JpaAddressRepositoryImpl implements AddressRepository {


    @Override
    public Address save(Address address) {
        return null;
    }

    @Override
    public boolean remove(Integer id) {
        return false;
    }

    @Override
    public Address getById(Integer id) {
        return null;
    }

    @Override
    public List<Address> getAll() {
        return null;
    }
}
