package lambdaExpression;

import java.util.List;
import java.util.function.Predicate;

public class RosterTestApp6 {
    //approach6:第5个方案已经使用了lambda表达式，CheckPerson是只有一个抽象方法的简单接口，我们没有必要在我们自己的应用程序里去定义这个接口。JDK已经提供了一些接口，比如Predicate接口只有一个返回boolean值的test方法：boolean test(T t)。

    public static void printPersonsWithPredicate(List<Person> personList, Predicate<Person> predicate) {
        for (Person p : personList) {
            if (predicate.test(p))//使用Predicate<Person>代替了CheckPerson的接口
                p.printPerson();
        }
    }

    public static void main(String[] args) {
        List<Person> personList = RosterTestBase.generateList();
        printPersonsWithPredicate(personList, person ->
                person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25
        );
    }
}
