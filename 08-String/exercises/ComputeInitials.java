package exercises;

public class ComputeInitials {
    public static void main(String[] args) {
        String myName = "Fred F. Flintstone";
        StringBuffer myInitials = new StringBuffer();

        for (int i = 0; i < myName.length(); i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i));
            }
        }
        System.out.println(myInitials);
    }
}
