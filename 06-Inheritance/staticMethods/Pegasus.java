package staticMethods;

public class Pegasus implements Flyer, Mythical {
    public static void main(String... args) {
        Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());
    }

    @Override
    public String identifyMyself() {
        return "I am a Pegasus.";
    }
}
