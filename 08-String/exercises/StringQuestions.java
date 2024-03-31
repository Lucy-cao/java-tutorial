package exercises;

public class StringQuestions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        //1.初始capacity为sb.length()+16=42
        System.out.println("Q1: capacity = " + sb.capacity());

        String hannah = "Did Hannah see bees? Hannah did.";
        //length()=32,hannah.charAt(12)='e',hannah.charAt(15)='b'
        System.out.println("Q2: length = " + hannah.length());
        System.out.println("Q2: hannah.charAt(12) = " + hannah.charAt(12));
        System.out.println("Q2: hannah.charAt(15) = " + hannah.charAt(15));

        String str1 = "Was it a car or a cat I saw?".substring(9, 12);
        //str1.length=3,str1=car
        System.out.println("Q3: str1.length = " + str1.length());
        System.out.println("Q3: str1 = " + str1);

        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');//index = 5

        /*1. result = si*/
        result.setCharAt(0, original.charAt(0));
        /*2. result = se*/
        result.setCharAt(1, original.charAt(original.length() - 1));
        /*3. result = swe*/
        result.insert(1, original.charAt(4));
        /*4. result = sweoft*/
        result.append(original.substring(1, 4));
        /*5. result = swear oft*/
        result.insert(3, (original.substring(index, index + 2) + " "));

        System.out.println("Q4: result = " + result);

        String hi = "Hi, ";
        String mom = "mom.";
        System.out.println("E1: way1 = " + hi + mom);
        System.out.println("E1: way2 = " + hi.concat(mom));
        System.out.format("E1: way3 = %s%s%n", hi, mom);
    }
}
