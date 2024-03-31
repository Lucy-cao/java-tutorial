package lambdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReferencesTest {
    public static void main(String[] args) {
        List<Person> personList = RosterTestBase.generateList();
        Person[] personArr = personList.toArray(new Person[personList.size()]);
        //写法1：创建类实现Comparator接口
//        class PersonAgeComparator implements Comparator<Person> {
//            public int compare(Person a, Person b) {
//                return a.getBirthday().compareTo(b.getBirthday());
//            }
//        }
//        Arrays.sort(personArr, new PersonAgeComparator());
        //sort函数的签名：static <T> void sort(T[] a, Comparator<? super T> c)

        //写法2：使用lambda表达式
//        Arrays.sort(personArr, (a, b) -> a.getBirthday().compareTo(b.getBirthday()));

        //写法3：因为Person类里面是有个静态方法compareByAge实现了这个过程，所以可以改写为
//        Arrays.sort(personArr, (a, b) -> Person.compareByAge(a, b));

        //写法4：因为调用的是已经存在的方法，所以可以使用方法引用
        Arrays.sort(personArr, Person::compareByAge);
    }
}
