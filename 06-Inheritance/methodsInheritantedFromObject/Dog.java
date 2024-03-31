package methodsInheritantedFromObject;

import java.util.Arrays;

public class Dog {
    private String name;
    private int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String... args) {
        Dog dog1 = new Dog("jacky", 7);
        Class<Dog> dogClass = (Class<Dog>) dog1.getClass();
        System.out.println("name: " + dogClass.getSimpleName() +
                ", isAnnotation: " + dogClass.isAnnotation() +
                ", methods: " + Arrays.toString(dogClass.getMethods()));

    }
}
