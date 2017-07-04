package mdorokhin.model;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public class Person {

    private Integer id;
    private String fio;
    private Address address;
    private List<Phone> phones;


    public Person() {
    }

    public Person(Integer id) {
        this.id = id;
    }

    public Person(Integer id, String fio, Address address, List<Phone> phones) {
        this.id = id;
        this.fio = fio;
        this.address = address;
        this.phones = phones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
