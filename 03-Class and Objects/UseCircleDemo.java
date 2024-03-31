public class UseCircleDemo {
    public static void main(String[] args){
        Circle c = new Circle(0,0,2);
        UseCircleDemo.moveCircle(c, 1, 2);
        System.out.println(1);
    }

    public static void moveCircle(Circle circle, int deltaX, int deltaY){
        circle.setX(circle.getX()+deltaX);
        circle.setY(circle.getY()+deltaY);

        circle = new Circle(0,0, 4);
        System.out.println(1);
    }
}
