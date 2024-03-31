package lambdaExpression;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RosterTestApp8 {
    //approach8:使用泛型，不限制传入的参数类型

    /**
     * step1:获取源数据
     * step2:筛选出满足条件的数据
     * step3:对满足条件的数据，返回某个值
     * step4:对步骤3返回的值进行相应操作
     */

    public static <X, Y> void processElements(
            Iterable<X> source,
            Predicate<X> predicate,
            Function<X, Y> function,
            Consumer<Y> consumer) {
        for (X p : source) {
            if (predicate.test(p)) {
                Y data = function.apply(p);
                consumer.accept(data);
            }
        }
    }

    public static void main(String[] args) {
        List<Person> personList = RosterTestBase.generateList();
        processElements(personList,
                person -> person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25,
                p -> p.getEmailAddress(),
                data -> System.out.println(data));
    }
}
