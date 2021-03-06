package mdorokhin.model;

import org.codehaus.jackson.annotate.*;
import org.codehaus.jackson.map.annotate.JsonView;

import javax.persistence.*;
import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Entity
@Table(name = "address")
@NamedQueries({
        @NamedQuery(name = Address.ALL, query = "SELECT DISTINCT a FROM Address a LEFT JOIN FETCH a.persons ORDER BY a.address"),
        @NamedQuery(name = Address.REMOVE, query = "DELETE FROM Address a WHERE a.id=:id")
})
@JsonIgnoreProperties(value = { "new" })
public class Address extends BaseEntity {

    public static final String ALL = "Address.getAll";
    public static final String REMOVE = "Address.remove";

    @Column(name = "address", nullable = false, unique = true)
    private String address;


    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address", fetch = FetchType.LAZY)
    private List<Person> persons;

    public Address() {
    }

    public Address(String address) {
        this.address = address;
    }

    public Address(Integer id, String address) {
        super(id);
        this.address = address;
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
                '}';
    }
}
