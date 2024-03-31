import java.util.ArrayList;
import java.util.List;

public class Boxing {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 50; i += 2) {
            intList.add(i);//装箱的过程，实际执行：intList.add(Integer.valueOf(i))
        }

        Integer num1 = new Integer(-8);
        int result = absoluteValue(num1);//拆箱的过程，实际执行absoluteValue(num1.intValue())
        System.out.println("absolute of " + num1 + " is " + result);

        List<Double> d = new ArrayList<>();
        d.add(3.141596);//装箱的过程：d.add(Double.valueOf(3.141596))
        double pi = d.get(0);//拆箱的过程：double pi = d.get(0).doubleValue()
        System.out.println("pi = " + pi);
    }

    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }
}
