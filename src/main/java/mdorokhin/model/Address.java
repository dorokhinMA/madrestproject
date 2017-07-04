package mdorokhin.model;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public class Address {

    private Integer id;
    private String address;
    private List<Person> persons;

    public Address() {
    }

    public Address(Integer id, String address, List<Person> persons) {
        this.id = id;
        this.address = address;
        this.persons = persons;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
