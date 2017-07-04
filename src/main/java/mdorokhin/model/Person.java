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
public class Person extends BaseEntity {

    @Column
    private String fio;

    @ManyToOne
    @JoinColumn
    private Address address;

    @OneToMany
    private List<Phone> phones;


    public Person() {
    }

    public Person(String fio, Address address, List<Phone> phones) {
        this.fio = fio;
        this.address = address;
        this.phones = phones;
    }

    public Person(Integer id, String fio, Address address, List<Phone> phones) {
        super(id);
        this.fio = fio;
        this.address = address;
        this.phones = phones;
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

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", id=" + id +
                ", address=" + address +
                ", phones=" + phones +
                '}';
    }
}
