package exercise;

import java.util.function.Function;

public class DataStructure3 {
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure3() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public void print(Function<Integer, Boolean> iterator) {
        for (int i = 0; i < SIZE; i++) {
            if (iterator.apply(i))
                System.out.print(arrayOfInts[i] + " ");
        }
    }

    public static boolean isEvenIndex(int index) {
        return index % 2 == 0;
    }

    public static boolean isOddIndex(int index) {
        return index % 2 != 0;
    }

    public int getArrayOfInts(int index) {
        return this.arrayOfInts[index];
    }

    public static void main(String s[]) {
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure3 ds = new DataStructure3();
        //第三道题，使用匿名表达式
        ds.print(DataStructure3::isEvenIndex);
        System.out.println("================");
        ds.print(DataStructure3::isOddIndex);
    }
}
