package multipleInheritance;

public class Person implements Play, Sport {

    @Override
    public void playFootball() {
        //这里实现的是Play接口中的playFootball
    }

    @Override
    public void playBasketball() {

    }
}
