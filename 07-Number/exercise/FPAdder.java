package exercise;

import java.text.DecimalFormat;
import java.util.Locale;

public class FPAdder {
    public static void main(String... args) {
        if (args.length != 1) {
            double sum = 0;
            for (String s : args) {
                sum += Double.parseDouble(s);
            }
            System.out.format(Locale.FRENCH, "参数求和为：%.2f(French)%n", sum);
            System.out.format("参数求和为：%.2f(Normal)%n", sum);

            // DecimalFormat
            DecimalFormat myFormat = new DecimalFormat("###,###.##");
            String output = myFormat.format(sum);
            System.out.println("DecimalFormat之后的值为：" + output);
        } else {
            System.err.println("请输入多个参数！");
        }
    }
}
