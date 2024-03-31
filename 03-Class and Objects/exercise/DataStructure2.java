package exercise;

public class DataStructure2 {
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure2() {
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

    public void print(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }

    public int[] getArrayOfInts() {
        return this.arrayOfInts;
    }

    public static void main(String s[]) {
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure2 ds = new DataStructure2();
        //第二道题，使用匿名类去实现打印奇数索引的值
        ds.print(new DataStructureIterator() {
            private int nextIndex = 1;

            public boolean hasNext() {
                return nextIndex < SIZE;
            }

            public Integer next() {
                Integer retValue = ds.getArrayOfInts()[nextIndex];
                // Get the next even element
                nextIndex += 2;
                return retValue;
            }
        });
    }
}
