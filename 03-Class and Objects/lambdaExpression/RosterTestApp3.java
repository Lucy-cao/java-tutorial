package lambdaExpression;

import java.util.List;

public class RosterTestApp3 {
    /*approach3：通过一个接口可以让用户自定义判断标准
    step1:编写printPersons方法，调用CheckPerson中的test方法，满足test条件才打印人员信息
    step2:发现缺少CheckPerson的接口，补充上，里面只有一个方法，入参是Person，返回值是boolean
    step3:需要有一个类实现CheckPerson接口，才可以在main里面调用。CheckPersonEligibleForSelectiveService实现了满足选举的条件：男性、年龄在18-25之间
    step4:编写main方法，初始化人员列表，调用printPersons方法，CheckPerson参数传的是实现了这个接口的类实例化对象new CheckPersonEligibleForSelectiveService()
     */


    interface CheckPerson {
        boolean test(Person person);
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    //内部类
    static class CheckPersonEligibleForSelectiveService implements CheckPerson {

        @Override
        public boolean test(Person person) {
            return person.getGender() == Person.Sex.MALE
                    && person.getAge() >= 18
                    && person.getAge() <= 25;
        }
    }

    public static void main(String[] args) {
        List<Person> personList = RosterTestBase.generateList();
        printPersons(personList, new CheckPersonEligibleForSelectiveService());
    }
}
