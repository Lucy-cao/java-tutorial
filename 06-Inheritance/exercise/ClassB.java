package exercise;

public class ClassB extends ClassA {
    //报错
//    public static void methodOne(int i) {
//    }

    public void methodTwo(int i) {
        //重写了父类里的methodTwo
    }
    
    //报错
//    public void methodThree(int i) {
//    }

    public static void methodFour(int i) {
        //隐藏了父类里的methodFour
    }
}
