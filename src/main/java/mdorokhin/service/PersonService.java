package mdorokhin.service;

import mdorokhin.model.Person;
import mdorokhin.model.Phone;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public interface PersonService {

    Person save(Person person);

    void remove(Integer id);

    Person getById(Integer id);

    Person getByPhoneNumber(Phone phone);

    Person getByFio(String fio);

    Person update(Person person);

    List<Person> getAll();
}
