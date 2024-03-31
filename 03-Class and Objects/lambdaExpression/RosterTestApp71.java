package lambdaExpression;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RosterTestApp71 {
    /* approach7:前面已经讲了两种功能性接口，第一个是返回了boolean值，第二个是返回void，还有一种是返回指定的类型
    Function<T,R>包含了方法：R apply(T t)。T是入参的类型，R是返回值的类型
     */

    public static void printPersonsWithFunction(List<Person> personList, Predicate<Person> predicate, Function<Person, String> function, Consumer<String> consumer) {
        for (Person p : personList) {
            if (predicate.test(p)) {
                String data = function.apply(p);
                consumer.accept(data);
            }
        }
    }

    public static void main(String[] args) {
        List<Person> personList = RosterTestBase.generateList();
        printPersonsWithFunction(personList,
                person -> person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25,
                p -> p.getEmailAddress(),
                data -> System.out.println(data));
    }
}
