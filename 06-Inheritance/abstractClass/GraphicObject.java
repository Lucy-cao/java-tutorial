package abstractClass;

public abstract class GraphicObject {
    int x, y;

    void moveTo(int newX, int newY) {
        x = newX;
        y = newY;
    }

    static void testStatic() {
        System.out.println("testStatic in abstract class GraphicObject");
    }

    abstract void draw();

    abstract void resize();
}
