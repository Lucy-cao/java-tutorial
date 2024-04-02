import java.util.Arrays;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 5);
        System.out.println("sum = " + upperBoundedWildCard(li));

        List<Double> ld = Arrays.asList(1.4, 3.5, 2.8);
        System.out.println("sum = " + upperBoundedWildCard(ld));
    }

    public static double upperBoundedWildCard(List<? extends Number> list) {
        //上界通配符：可以接收Number以及它的子类
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();
        }
        return s;
    }
}
