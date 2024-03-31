public class StringBuilderDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";//回文字符串
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();//使用StringBuilder的翻转代码简洁易读
        System.out.println(sb);//println方法里默认调用了sb.toString()

        sb.append("! Today is a good day.");
        System.out.println(sb);

        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());

        sb.insert(4, "insert ");
        System.out.println(sb);
    }
}
