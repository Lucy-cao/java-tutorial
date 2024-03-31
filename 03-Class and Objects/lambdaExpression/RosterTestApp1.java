package lambdaExpression;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RosterTestApp1 {
    // approach1:从Person对象列表中，找出年龄大于某数的
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> personList = RosterTestBase.generateList();
        printPersonsOlderThan(personList, 20);
    }
}
