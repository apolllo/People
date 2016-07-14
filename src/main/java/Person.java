import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {
    private String name;
    private String surname;
    private String email;
    private byte kids;
    private enum hobby {ACT, COOK, DANCE, SING, READ};
    private enum sex {MALE, FEMALE};

    public Person(String name, String surname, String email, byte kids) {
        Logger logger = LoggerFactory.getLogger(Person.class);
        setName(name);
        setSurname(surname);
        setEmail(email);
        setKids(kids);
        logger.info("Hello World");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getKids() {
        return kids;
    }

    public void setKids(byte kids) {
        if (kids >= 0 && kids < 10) { this.kids = kids; }
        else { System.out.println("log");}
    }

    public void printDetails() {
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getEmail());
        System.out.println(getKids());
    }
}
