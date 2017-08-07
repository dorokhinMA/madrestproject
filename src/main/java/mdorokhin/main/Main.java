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

        PersonRepository jpaPersonRepositoryImpl = context.getBean("jpaPersonRepositoryImpl", PersonRepository.class);

        Person byId = jpaPersonRepositoryImpl.getById(2);

        System.out.println(byId.getAddress());


    }


}
