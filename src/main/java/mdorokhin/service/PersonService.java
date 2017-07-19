package mdorokhin.service;

import mdorokhin.model.Person;
import mdorokhin.model.Phone;
import mdorokhin.utils.exeption.AppException;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public interface PersonService {

    Person save(Person person) throws AppException;

    void remove(Integer id) throws AppException;

    Person getById(Integer id) throws AppException;

    Person getByPhone(Integer phone) throws AppException;

    Person getByFio(String fio) throws AppException;

    Person update(Person person) throws AppException;

    List<Person> getAll();
}
