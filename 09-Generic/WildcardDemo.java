import java.util.Arrays;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        //1.有界通配符
        List<Integer> li = Arrays.asList(1, 2, 5);
        System.out.println("sum = " + upperBoundedWildCard(li));

        List<Double> ld = Arrays.asList(1.4, 3.5, 2.8);
        System.out.println("sum = " + upperBoundedWildCard(ld));

        //2.无界通配符
        //下面这行会报错：List<Integer>不是List<Object>的子类
//        unBoundedWildcard1(li);
        unBoundedWildcard2(li);
        unBoundedWildcard2(ld);
    }

    public static double upperBoundedWildCard(List<? extends Number> list) {
        //上界通配符：可以接收Number以及它的子类
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();
        }
        return s;
    }

    public static void unBoundedWildcard1(List<Object> list) {
        for (Object elm : list) {
            System.out.println(elm + " ");
        }
    }

    public static void unBoundedWildcard2(List<?> list) {
        for (Object elm : list) {
            System.out.println(elm + " ");
        }
    }
}
