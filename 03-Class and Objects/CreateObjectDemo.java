public class CreateObjectDemo {
    public static void main(String[] args){
        //声明对象
        Point origin = new Point(23,67);
        Rectangle recOne=new Rectangle(origin,100,200);
        Rectangle recTwo=new Rectangle(50,100);
        //打印矩形1的长宽和面积
        System.out.println("Width of rectOne: "+recOne.width);
        System.out.println("Height of rectOne: "+recOne.height);
        System.out.println("Area of rectOne: "+recOne.getArea());
        //设置矩形2的中心位置
        recTwo.origin=origin;
        System.out.println("X Position of rectTwo: " + recTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + recTwo.origin.y);
        //移动矩形2
        recTwo.move(39,56);
        System.out.println("X Position of rectTwo: " + recTwo.origin.x);
        System.out.println("Y Position of rectTwo: " + recTwo.origin.y);
    }
}
