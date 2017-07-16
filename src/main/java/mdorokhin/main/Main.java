package mdorokhin.main;


import mdorokhin.model.Address;
import mdorokhin.model.Person;
import mdorokhin.model.Phone;
import mdorokhin.repository.AddressRepository;
import mdorokhin.repository.PersonRepository;
import mdorokhin.repository.PhoneRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * @author Maxim Dorokhin
 *         07.07.2017
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring-context.xml","META-INF/spring/spring-database.xml");

        AddressRepository jpaAddressRepositoryImpl = context.getBean("jpaAddressRepositoryImpl", AddressRepository.class);

//        System.out.println(jpaAddressRepositoryImpl.getAll());

//        jpaAddressRepositoryImpl.save(new Address("Kazan"));
//        jpaAddressRepositoryImpl.save(new Address("Sochi"));
//        jpaAddressRepositoryImpl.save(new Address("Tver"));
//        List<Address> all = jpaAddressRepositoryImpl.getAll();
//
//        Address byId = jpaAddressRepositoryImpl.getById(1);
//        System.out.println(byId);
//        List<Person> persons = byId.getPersons();
//        System.out.println(persons);
//        // System.out.println(all);

//        PhoneRepository jpaPhoneRepositoryImpl = context.getBean("jpaPhoneRepositoryImpl", PhoneRepository.class);
//
//        System.out.println(jpaPhoneRepositoryImpl.getAll());
//        Phone byId = jpaPhoneRepositoryImpl.getByNumber("+7(800)-222-22-22");
//        System.out.println(byId);


//        PersonRepository jpaPersonRepositoryImpl = context.getBean("jpaPersonRepositoryImpl", PersonRepository.class);
//
//        System.out.println(jpaPersonRepositoryImpl.getById(2));
//
//        Person ivanov = jpaPersonRepositoryImpl.getByFio("Petrov Petr Petrovich");
//        System.out.println(ivanov);

//        PersonRepository jpaPersonRepositoryImpl = context.getBean("jpaPersonRepositoryImpl", PersonRepository.class);
//
//        Person byId = jpaPersonRepositoryImpl.getById(1);
//        System.out.println(byId.getPhones());


    }


}
