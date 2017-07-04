package mdorokhin.model;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public class Phone {

    private Integer id;
    private String number;
    private Person person;

    public Phone() {
    }

    public Phone(Integer id, String number, Person person) {
        this.id = id;
        this.number = number;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
