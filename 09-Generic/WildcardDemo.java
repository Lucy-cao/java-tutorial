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
//        unBoundedWildcard2(li);
//        unBoundedWildcard2(ld);

        //3.通配符捕获
        swapFirst(li, ld);
    }

    public static double upperBoundedWildCard(List<? extends Number> list) {
        //上界通配符：可以接收Number以及它的子类
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();//上界通配符的参数，只能读取数据
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

    public static void lowerBoundedWildcard(List<? super Integer> list) {
        for (int i = 0; i <= 10; i++) {
            list.add(i);//下界通配符，可以向其中插入数据
        }
        Integer.valueOf(2);
        for (Object ele : list) {

        }
    }

    public void foo(List<?> i) {
//        i.set(0, i.get(0));//会报错，因为编译器无法识别插入到列表中的i.get(0)到底是什么类型
        fooHelper(i);
    }

    private <T> void fooHelper(List<T> i) {
        i.set(0, i.get(0));
    }

    public static void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
        Number temp = l1.get(0);
//        l1.set(0, l2.get(0));
//        l2.set(0, temp);
    }


}
