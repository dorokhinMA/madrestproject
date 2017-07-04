package mdorokhin.model;

import javax.persistence.*;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Entity
@Table
//@NamedQueries()
public class Phone extends BaseEntity {

    @Column
    private String number;

    @ManyToOne
    @JoinColumn
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
