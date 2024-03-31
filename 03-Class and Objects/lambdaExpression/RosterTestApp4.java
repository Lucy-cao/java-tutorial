package lambdaExpression;

import java.util.List;

public class RosterTestApp4 {
    /*approach4:在3的基础上改写一下，使用匿名类。减少了一个步骤
    step1:编写printPersons方法，调用CheckPerson中的test方法，满足test条件才打印人员信息
    step2:发现缺少CheckPerson的接口，补充上，里面只有一个方法，入参是Person，返回值是boolean
    step3:编写main方法，初始化人员列表，调用printPersons方法，CheckPerson参数传的是实现了这个接口的匿名类，可以减少定义一个实现类
     */

    interface CheckPerson {
        boolean test(Person p);
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p))
                p.printPerson();
        }
    }

    public static void main(String[] args) {
        List<Person> personList = RosterTestBase.generateList();
        //使用匿名类
        printPersons(personList, new CheckPerson() {
            public boolean test(Person p) {
                return p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25;
            }
        });
    }


}
