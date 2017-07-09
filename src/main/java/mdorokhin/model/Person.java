package mdorokhin.model;

import javax.persistence.*;
import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Entity
@Table(name = "persons")
@NamedQueries({
        @NamedQuery(name = Person.PERSON_GET, query = "SELECT p FROM Person p WHERE p.id=:id"),
        @NamedQuery(name = Person.PERSON_REMOVE, query = "DELETE FROM Person p WHERE p.id=:id"),
        @NamedQuery(name = Person.PERSON_BY_FIO, query = "SELECT p FROM Person p WHERE p.fio=:fio"),
        @NamedQuery(name = Person.PERSON_BY_PHONE, query = "SELECT p FROM Person p WHERE p.id=:phone ORDER BY p.fio"),
        @NamedQuery(name = Person.PERSON_ALL, query = "SELECT p FROM Person p ORDER BY p.fio"),
})
public class Person extends BaseEntity {

    public static final String PERSON_GET = "Person.get";
    public static final String PERSON_REMOVE = "Person.remove";
    public static final String PERSON_BY_FIO = "Person.getByFio";
    public static final String PERSON_BY_PHONE = "Person.byPhone";
    public static final String PERSON_ALL = "Person.getAll";

    @Column(name = "fio")
    private String fio;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "person", fetch = FetchType.EAGER)
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
