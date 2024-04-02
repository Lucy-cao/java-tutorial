public class GenericDemo {
    public static <T extends Comparable<T>> int countGreaterThan(T[] nArray, T elem) {
        //泛型方法
        int count = 0;
        for (T n : nArray) {
            if (n.compareTo(elem) > 0)
                ++count;
        }
        return count;
    }
}
