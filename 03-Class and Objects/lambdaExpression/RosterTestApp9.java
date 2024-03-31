package lambdaExpression;

import java.util.List;

public class RosterTestApp9 {
    //approach9:聚合式的流式操作

    public static void main(String[] args) {
        List<Person> personList = RosterTestBase.generateList();
        personList.stream()
                .filter(person -> person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25)
                .map(p -> p.getEmailAddress())
                .forEach(email -> System.out.println(email));
    }
}
