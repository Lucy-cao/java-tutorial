package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class RosterTestApp2 {
    // approach2:打印某个年龄范围内的人员
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (p.getAge() >= low && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> personList = RosterTestBase.generateList();
        printPersonsWithinAgeRange(personList, 10, 50);
    }
}
