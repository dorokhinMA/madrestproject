package mdorokhin.service;

import mdorokhin.model.Person;
import mdorokhin.model.Phone;
import mdorokhin.repository.PersonRepository;
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
    public void remove(Integer id) {
        personRepository.remove(id);
    }

    @Override
    public Person getById(Integer id) {
        return personRepository.getById(id);
    }

    @Override
    public Person getByPhoneNumber(Phone phone) {
        return personRepository.getByPhoneNumber(phone);
    }

    @Override
    public Person getByFio(String fio) {
        return personRepository.getByFio(fio);
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
