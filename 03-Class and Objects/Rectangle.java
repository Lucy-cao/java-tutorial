import javax.swing.*;

public class Rectangle {
    public int width=0;
    public int height=0;
    public Point origin;//中心点

    //四个构造函数，参数的数量和类型有区别
    public Rectangle(){
        origin=new Point(0,0);
    }
    public Rectangle(Point p){
        origin=p;
    }
    public Rectangle(int w, int h){
        origin=new Point(0,0);
        width=w;
        height=h;
    }
    public Rectangle(Point p,int w,int h){
        origin=p;
        width=w;
        height=h;
    }
    //移动矩形
    public void move(int x,int y){
        origin.x=x;
        origin.y=y;
    }
    //计算面积
    public int getArea(){
        return this.width*this.height;
    }
}
