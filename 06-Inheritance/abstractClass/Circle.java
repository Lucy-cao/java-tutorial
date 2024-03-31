package abstractClass;

public class Circle extends GraphicObject {
    void draw() {

    }

    void resize() {

    }

//    static void testStatic() {
//        System.out.println("testStatic in Circle");
//    }

    public static void main(String... args) {
        Circle c = new Circle();
        GraphicObject g = c;
        Circle.testStatic();
        GraphicObject.testStatic();
    }
}
