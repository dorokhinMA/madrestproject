package mdorokhin.repository.jpa;

import mdorokhin.model.Address;
import mdorokhin.model.Person;
import mdorokhin.model.Phone;
import mdorokhin.repository.PersonRepository;
import org.hibernate.JDBCException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
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
    @Transactional
    public boolean remove(Integer id) {

        try {
            return em.createNamedQuery(Person.PERSON_REMOVE).setParameter("id", id).executeUpdate() != 0;
        } catch (JDBCException e){
            return false;
        }

    }

    @Override
    public Person getById(Integer id) {

        try {
            return (Person) em.createNamedQuery(Person.PERSON_GET).setParameter("id", id).getSingleResult();
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public Person getByPhone(Integer phoneId) {

        try {
            return (Person) em.createNamedQuery(Person.PERSON_BY_PHONE).setParameter("phoneId", phoneId).getSingleResult();
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public Person getByFio(String fio) {

        try {
            return (Person) em.createNamedQuery(Person.PERSON_BY_FIO).setParameter("fio", fio).getSingleResult();
        } catch (NoResultException e){
            return null;
        }
    }

    @Override
    public List<Person> getAll() {
        return em.createNamedQuery(Person.PERSON_ALL, Person.class).getResultList();
    }

}
