package mdorokhin.service;

import mdorokhin.model.Person;
import mdorokhin.model.Phone;
import mdorokhin.repository.PersonRepository;
import mdorokhin.utils.exeption.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person save(Person person) {
        personRepository.save(person);
        return person;
    }

    @Override
    public void remove(Integer id) throws AppException {

        if (!personRepository.remove(id)) {

            throw new AppException("Can't remove person with ID == " + id);
        }
    }

    @Override
    public Person getById(Integer id) throws AppException {

        Person person = personRepository.getById(id);

        if (person == null) {

            throw new AppException("Person with ID == " + id + " not found");
        }
        return person;
    }

    @Override
    public Person getByPhoneNumber(Phone phone) throws AppException {

        Person person = personRepository.getByPhoneNumber(phone);

        if (person == null) {

            throw new AppException("Person with phone == " + phone + " not found");
        }

        return person;
    }

    @Override
    public Person getByFio(String fio) throws AppException {

        Person  person = personRepository.getByFio(fio);

        if (person == null) {

            throw new AppException("Person with Fio == " + fio + " not found");
        }

        return person;
    }

    @Override
    public Person update(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getAll() {
        return personRepository.getAll();
    }
}
