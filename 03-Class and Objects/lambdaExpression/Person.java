package lambdaExpression;

import java.util.Date;

public class Person {

    public enum Sex {
        MALE,
        FEMALE
    }

    private String name;
    private int age;
    private String birthday;
    private Sex gender;
    private String emailAddress;

    public Person(String name, int age, String birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public void printPerson() {
        System.out.println(
                "姓名："
                        + this.name
                        + ", 性别："
                        + this.gender
                        + ", 年龄："
                        + this.age
                        + ", 生日："
                        + this.birthday
                        + ", 邮箱："
                        + this.emailAddress);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return this.gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static int compareByAge(Person a, Person b) {
        //根据年龄比较大小
        return a.birthday.compareTo(b.getBirthday());
    }
}
