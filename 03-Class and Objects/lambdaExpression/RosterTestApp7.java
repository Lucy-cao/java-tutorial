package lambdaExpression;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class RosterTestApp7 {
    /*approach7:如果找到了满足条件的人员之后，想执行其他的操作（入参是Person，返回类型是void），就需要有一个功能性接口包含这个方法，才能使用lambda表达式。Consumer<T>这个接口就包含了一个方法：void accept(T t)
     */

    public static void processPerson(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : personList) {
            if (predicate.test(p))//如果满足条件，就执行某个操作
                consumer.accept(p);
        }
    }

    public static void main(String[] args) {
        List<Person> personList = RosterTestBase.generateList();
        processPerson(personList,
                //判断条件
                person -> person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25,
                //执行某个操作
                p -> p.printPerson());
    }
}
