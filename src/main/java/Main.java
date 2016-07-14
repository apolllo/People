public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Name", "Last Name", "email@gmail.com", 0, 0, 0);
        Person person2 = new Person("Name1", "Last Name1", "email1@gmail.com", 1, 1, 1);
        person1.printDetails();
        person2.printDetails();
    }
}
