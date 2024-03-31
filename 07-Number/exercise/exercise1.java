package exercise;

public class exercise1 {
    public static void main(String[] args) {
        System.out.println("1.a 将int转化为16进制的字符串");
        int num1 = 65;
        System.out.format("%d 的十六进制表达式为: %s%n", num1, Integer.toHexString(num1));

        System.out.println("1.b 将字符串以5为基数转换为十进制数");
        String str2 = "230";
        System.out.format("%s 的十进制数为: %d%n", str2, Integer.parseInt(str2, 5));
        System.out.format("%s 的十进制数为: %d%n", str2, Integer.valueOf(str2, 5));

        System.out.println("1.c 判断浮点数是不是NaN");
        System.out.format("%f 是否NaN: %s%n", 5.55, Double.isNaN(5.55));

        System.out.println("2. 判断下列表达式的输出");
        System.out.format("Integer.valueOf(1).equals(Long.valueOf(1)): %s%n", Integer.valueOf(1).equals(Long.valueOf(1)));//false
        //The result is true if and only if the argument is not null and is an Integer object that contains the same int value as this object.
        //输出false，因为API文档中写到，只有当参数不是null，并且是和这个对象有相同值的Integer对象，但是现在传参的是Long对象
    }
}
