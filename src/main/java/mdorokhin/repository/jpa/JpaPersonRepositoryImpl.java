package mdorokhin.repository.jpa;

import mdorokhin.model.Address;
import mdorokhin.model.Person;
import mdorokhin.model.Phone;
import mdorokhin.repository.PersonRepository;
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
public class JpaPersonRepositoryImpl implements PersonRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public Person save(Person person) {

        if (person.isNew()) {
            em.persist(person);
        } else {
            em.merge(person);
        }
        return person;
    }

    @Override
    public boolean remove(Integer id) {
        return em.createNamedQuery(Person.PERSON_REMOVE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Person getById(Integer id) {
        return em.find(Person.class, id);
    }

    @Override
    public Person getByPhoneNumber(Phone phone) {
        return (Person) em.createNamedQuery(Person.PERSON_BY_PHONE).setParameter("phone", phone).getSingleResult();
    }

    @Override
    public Person getByFio(String fio) {
        return (Person) em.createNamedQuery(Person.PERSON_BY_FIO).setParameter("phone", fio).getSingleResult();
    }

    @Override
    public List<Person> getAll() {
        return em.createNamedQuery(Person.PERSON_ALL, Person.class).getResultList();
    }

}
