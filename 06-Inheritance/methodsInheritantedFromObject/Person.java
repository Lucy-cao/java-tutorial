package methodsInheritantedFromObject;

public class Person implements Cloneable {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.clone();
        } catch (Exception e) {
            System.out.println("This is an exception");
        }

    }
}
