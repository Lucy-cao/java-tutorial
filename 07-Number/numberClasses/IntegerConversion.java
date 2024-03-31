package numberClasses;

public class IntegerConversion {
    public static void main(String[] args) {
        //static Integer decode(String s)：将字符串转化为整型数字，可以接受十进制、八进制、十六进制的字符串
        //testDecode();

        //static int parseInt(String s, [int radix])
//        testParseInt();
        //转换字符串
//        testToString();
        testValueOf();
    }


    public static void testDecode() {
        System.out.println("1.传入十进制");
        Integer num1 = Integer.decode("333");
        System.out.println("十进制数据333：" + num1);

        System.out.println("=====================================");

        System.out.println("2.传入八进制");
        Integer num2 = Integer.decode("0333");
        System.out.println("八进制数据333：" + num2);

        System.out.println("=====================================");

        System.out.println("3.传入十六进制");
        Integer num3 = Integer.decode("0x333");
        System.out.println("十六进制数据333：" + num3);
    }

    public static void testParseInt() {
        int num1 = Integer.parseInt("98");
        System.out.println(num1); //98

//        int num2 = Integer.parseInt("98.66");//字符串是小数，会报错
        //转换二进制
        int num3 = Integer.parseInt("111", 2);
        System.out.println(num3);//7
        //以3为基数转换
        int num4 = Integer.parseInt("111", 3);
        System.out.println(num4);//13
        //以16为基数转换
        int num5 = Integer.parseInt("112", 16);
        System.out.println(num5);//274
    }

    public static void testToString() {
        Integer num1 = 34;
        System.out.println(num1.toString());

        int num2 = 56;
        System.out.println(Integer.toString(num2));
    }

    public static void testValueOf() {
        Integer num1 = Integer.valueOf(34);
        System.out.println(num1);//34

        Integer num2 = Integer.valueOf("098");
        System.out.println(num2);//98

        Integer num3 = Integer.valueOf("11", 16);//字符串不需要写成十六进制的格式
        System.out.println(num3);//17

        double b = 43.5;
        System.out.println(Math.rint(b));//44.0
        System.out.println(Math.pow(2, 3));//8.0
        System.out.println(Math.sqrt(9));//3.0
    }
}
