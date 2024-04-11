import java.util.ArrayList;
import java.util.List;

public class EvenNumber extends NaturalNumber {
    public EvenNumber(int i) {
        super(i);
    }

    public static void main(String[] args) {
        List<EvenNumber> le = new ArrayList<>();
        List<? extends NaturalNumber> ln = le;//赋值成功，因为EvenNumber满足【? extends NaturalNumber】的条件，所以此项赋值不会报错
//        ln.add(0, new EvenNumber(8));//不能插入数据，会报错，因为? extends NaturalNumber你不能确定是NaturalNumber还是EvenNumber
    }
}
