package staticMethods;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("Class method in Cat");
    }

    public void testInstanceMethod() {
        System.out.println("Instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        System.out.println("测试类方法");
        Cat.testClassMethod();//调用的是Cat类的类方法
        Animal.testClassMethod();//调用的是Animal类的类方法

        System.out.println("测试实例方法");
        myCat.testInstanceMethod();//调用的是Cat的实例对象
        myAnimal.testInstanceMethod();//仍然调用的是Cat的实例对象

        /* 输出：
         * 测试类方法
         * Class method in Cat
         * Class method in Animal
         * 测试实例方法
         * Instance method in Cat
         * Instance method in Cat
         */

    }
}
