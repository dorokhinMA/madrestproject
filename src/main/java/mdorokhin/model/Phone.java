package mdorokhin.model;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;

import javax.persistence.*;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Entity
@Table(name = "phones")
@NamedQueries({
        @NamedQuery(name = Phone.ALL, query = "SELECT DISTINCT a FROM Phone a ORDER BY a.person.fio"),
        @NamedQuery(name = Phone.REMOVE, query = "DELETE FROM Phone a WHERE a.id=:id"),
        @NamedQuery(name = Phone.GET_BY_NUMBER, query = "SELECT a FROM Phone a WHERE a.number=:number")
})
public class Phone extends BaseEntity {

    public static final String ALL = "Phone.getAll";
    public static final String REMOVE = "Phone.remove";
    public static final String GET_BY_NUMBER = "Phone.getByNumber";

    @Column(name = "number", unique = true, nullable = false)
    private String number;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Phone() {
    }

    public Phone(String number, Person person) {
        this.number = number;
        this.person = person;
    }

    public Phone(Integer id, String number, Person person) {
        super(id);
        this.number = number;
        this.person = person;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", person=" + person +
                ", id=" + id +
                '}';
    }
}
