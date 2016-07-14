import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {
    private String name;
    private String surname;
    private String email;
    private int kids;
    private String hobby;
    private String gender;
    private enum hobbyList {ACT, COOK, DANCE, SING, READ};
    private enum genderList {MALE, FEMALE};

    public Person(String name, String surname, String email, int kids, int hobbyNumber, int genderNumber) {
        Logger logger = LoggerFactory.getLogger(Person.class);
        setName(name);
        setSurname(surname);
        setEmail(email);
        setKids(kids);
        setHobby(hobbyNumber);
        setGender(genderNumber);
        logger.debug("Hello World");
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

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        if (kids >= 0 && kids < 10) { this.kids = kids; }
        else { System.out.println("log");}
    }
    
    public String getHobby() {
        return hobby;
    }

    public void setHobby(int hobbyNumber) {
        if (hobbyNumber >= 0 && hobbyNumber < hobbyList.values().length) { 
        	hobby = hobbyList.values()[hobbyNumber].toString(); 
        } else { System.out.println("log");}
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(int genderNumber) {
        if (genderNumber >= 0 && genderNumber < genderList.values().length) { 
        	gender = genderList.values()[genderNumber].toString(); 
        } else { System.out.println("log");}
    }

    public void printDetails() {
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getEmail());
        System.out.println(getKids());
        System.out.println(getHobby());
        System.out.println(getGender());
    }
}
