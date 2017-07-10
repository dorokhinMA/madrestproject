package mdorokhin.model;

import javax.persistence.*;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Entity
@Table(name = "phones")
@NamedQueries({
        @NamedQuery(name = Phone.ALL, query = "SELECT a FROM Phone a ORDER BY a.person.fio"),
        @NamedQuery(name = Phone.REMOVE, query = "DELETE FROM Phone a WHERE a.id=:id")
})
public class Phone extends BaseEntity {

    public static final String ALL = "Phone.getAll";
    public static final String REMOVE = "Phone.remove";

    @Column(name = "number", unique = true)
    private String number;

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
