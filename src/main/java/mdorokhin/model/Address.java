package mdorokhin.model;

import javax.persistence.*;
import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Entity
@Table
//@NamedQueries()
public class Address extends BaseEntity {

    @Column
    private String address;

    @OneToMany
    private List<Person> persons;

    public Address() {
    }

    public Address(String address, List<Person> persons) {
        this.address = address;
        this.persons = persons;
    }

    public Address(Integer id, String address, List<Person> persons) {
        super(id);
        this.address = address;
        this.persons = persons;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", persons=" + persons +
                '}';
    }
}
