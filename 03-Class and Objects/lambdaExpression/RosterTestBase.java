package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RosterTestBase {
    public static List<Person> generateList() {
        final int SIZE = 15;
        Random random = new Random();
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            Person person = new Person("张" + i, (int) (Math.random() * 100),
                    "2000-1-" + i, Person.Sex.values()[random.nextInt(Person.Sex.values().length)],
                    i + "135@163.com");
            personList.add(person);
        }
        return personList;
    }
}
