import javax.xml.crypto.Data;

public class DataStructure {
    private final static int SIZE = 15;
    private int[] arr = new int[SIZE];

    public DataStructure(){
        for(int i=0;i<SIZE;i++){
            arr[i] = i;
        }
    }

    public void printEven(){
        //打印偶数索引的值
        EvenIterator evenIterator = this.new EvenIterator();

        while(evenIterator.hasNext()){
            System.out.print(evenIterator.next()+" ");
        }
    }

    //内部类
    interface DataStructureIterator extends java.util.Iterator<Integer>{}
    private class EvenIterator implements DataStructureIterator{
        private int nextIndex=0;

        @Override
        public boolean hasNext() {
            return nextIndex<=SIZE-1;
        }

        @Override
        public Integer next() {
            Integer value = arr[nextIndex];
            nextIndex +=2;
            return value;
        }
    }

    public static void main(String[] args){
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
