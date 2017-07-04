package mdorokhin.repository.jpa;

import mdorokhin.model.Address;
import mdorokhin.model.Person;
import mdorokhin.model.Phone;
import mdorokhin.repository.PersonRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Repository
@Transactional(readOnly = true)
public class JpaPersonRepositoryImpl implements PersonRepository {


    @Override
    public Person save(Person person) {
        return null;
    }

    @Override
    public boolean remove(Integer id) {
        return false;
    }

    @Override
    public Person getById(Integer id) {
        return null;
    }

    @Override
    public Person getByPhoneNumber(Phone phone) {
        return null;
    }

    @Override
    public Person getByFio(String fio) {
        return null;
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public List<Address> getAll() {
        return null;
    }
}
