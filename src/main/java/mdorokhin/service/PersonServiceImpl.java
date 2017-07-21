package mdorokhin.service;

import mdorokhin.model.Person;
import mdorokhin.model.Phone;
import mdorokhin.repository.PersonRepository;
import mdorokhin.utils.exeption.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
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
    public Person save(Person person) throws AppException {

        Person personByFio = personRepository.getByFio(person.getFio());

        if(personByFio != null){

            throw new AppException(Response.Status.CONFLICT.getStatusCode(), //409
                    409,
                    "Person with fio already existing in the database with the id " + person.getId());
        }

        personRepository.save(person);
        return person;
    }

    @Override
    public void remove(Integer id) throws AppException {

        final boolean remove = personRepository.remove(id);

        if (!remove) {

            throw new AppException(Response.Status.NOT_FOUND.getStatusCode(), //404
                    404,
                    "The person you requested with id " + id + " was not found in the database");
        }
    }

    @Override
    public Person getById(Integer id) throws AppException {

        Person person = personRepository.getById(id);

        if (person == null) {

            throw new AppException(Response.Status.NOT_FOUND.getStatusCode(), //404
                    404,
                    "The person you requested with id " + id + " was not found in the database");
        }
        return person;
    }

    @Override
    public Person getByPhone(Integer phone) throws AppException {

        Person person = personRepository.getByPhone(phone);

        if (person == null) {

            throw new AppException(Response.Status.NOT_FOUND.getStatusCode(), //404
                    404,
                    "The person you requested with phone " + phone + " was not found in the database");
        }

        return person;
    }

    @Override
    public Person getByFio(String fio) throws AppException {

        Person  person = personRepository.getByFio(fio);

        if (person == null) {

            throw new AppException(Response.Status.NOT_FOUND.getStatusCode(), //404
                    404,
                    "The person you requested with fio " + fio + " was not found in the database");
        }

        return person;
    }

    @Override
    public Person update(Person person) throws AppException {

        Person personById = personRepository.getById(person.getId());

        if (personById == null) {

            throw new AppException(Response.Status.NOT_FOUND.getStatusCode(), //404
                    404,
                    "The person you requested with id " + person.getId() + " was not found in the database");
        }
        return personRepository.save(person);
    }

    @Override
    public List<Person> getAll() {
        return personRepository.getAll();
    }


}
