import java.util.ArrayList;
import java.util.List;

public class BoxDemo {
    public static <U> void addBox(U u, List<Box<U>> boxes) {
        //往boxes里添加数据
        Box<U> box = new Box<>();
        box.setT(u);//往对象的某个泛型字段设置内容
        boxes.add(box);
    }

    public static <U> void printBoxes(List<Box<U>> boxes) {
        int count = 0;
        for (Box<U> box : boxes) {
            U contents = box.getT();//获取box对象里具体的某个字段的内容
            System.out.println("box#" + (++count) + " is " + contents.toString());
        }
    }

    public static void main(String[] args) {
        List<Box<Integer>> boxes = new ArrayList<>();
        addBox(10, boxes);
        addBox(30, boxes);
        addBox(56, boxes);

        printBoxes(boxes);
    }
}
