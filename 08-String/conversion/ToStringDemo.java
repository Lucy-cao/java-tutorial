package conversion;

public class ToStringDemo {
    public static void main(String[] args) {
        double d = 858.48;
        String dStr = Double.toString(d);

        int pos = dStr.indexOf('.');
        System.out.println(pos);
        System.out.printf("%d 位数字在小数点之前%n", pos);
        System.out.format("%d 位数字在小数点之后%n", dStr.length() - pos - 1);
    }
}
