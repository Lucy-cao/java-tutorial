package lambdaExpression;

import java.util.function.BiFunction;

public class MethodReferencesExamples {
    //静态方法
    public static String appendStringStatic(String s1, String s2) {
        return s1 + s2;
    }

    //实例方法
    public String appendString2(String s1, String s2) {
        return s1 + s2;
    }

    //BiFunction是一个功能性接口，只有一个抽象方法apply
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> function) {
        return function.apply(a, b);
    }

    public static void main(String[] args) {
        MethodReferencesExamples app = new MethodReferencesExamples();

        //lambda表达式写法:其实是实现了function.apply的方法执行内容
        System.out.println(mergeThings("Hello ", "World!", (a, b) -> appendStringStatic(a, b)));
        //可以改写为引用静态方法
        System.out.println(mergeThings("Hello ", "World!", MethodReferencesExamples::appendStringStatic));
        //引用实例方法
        System.out.println(mergeThings("Hello ", "World!", app::appendString2));
        //使用String类型的concat方法
        System.out.println(mergeThings("Hello ", "World!", String::concat));

        //所有以上都是打印的一样的内容：Hello World!
    }
}
