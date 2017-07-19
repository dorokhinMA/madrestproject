package mdorokhin.repository;

import mdorokhin.model.Person;
import mdorokhin.model.Phone;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public interface PersonRepository {

    Person save(Person person);

    boolean remove(Integer id);

    Person getById(Integer id);

    Person getByPhone(Integer phoneId);

    Person getByFio(String fio);

    List<Person> getAll();
}

