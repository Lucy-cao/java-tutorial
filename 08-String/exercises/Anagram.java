package exercises;

import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "Cosmo and Laine:";
        String string2 = "Maid, clean soon!";
        if (areAnagram(string1, string2))
            System.out.println("str1和str2是Anagram");
        else
            System.out.println("str1和str2不是Anagram");
    }

    public static boolean areAnagram(String str1, String str2) {
        //获取到所有的字母去除大小写后排序
        String letters1 = getAllLetters(str1);
        String letters2 = getAllLetters(str2);

        letters1 = letters1.toLowerCase();
        letters2 = letters2.toLowerCase();

        letters1 = sortStr(letters1);
        letters2 = sortStr(letters2);
        return letters1.equals(letters2);
    }

    public static String getAllLetters(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {//判断是否是字母
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String sortStr(String str) {
        //先把字符串转化为字符数组
        char[] charSeq = str.toCharArray();
        //排序
        java.util.Arrays.sort(charSeq);
        return new String(charSeq);
    }
}
