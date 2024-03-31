package exercise;

public class AddNum {
    public static void main(String... args) {
        if (args.length != 1) {
            int sum = 0;
            for (String s : args) {
                sum += Integer.parseInt(s);
            }
            System.out.format("参数求和为：%d%n", sum);
        } else {
            System.err.println("请输入多个参数！");
        }
    }
}
