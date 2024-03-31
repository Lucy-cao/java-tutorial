public class ShadowTest {
    public int x=0;

    class FirstLevel{
        public int x=1;

        void methodInFirstLevel(int x) {
            System.out.println("x=" + x);
            System.out.println("this.x=" + this.x);
            System.out.println("ShadowTest.this.x=" + ShadowTest.this.x);
        }
    }

    public static void main(String[] args){
        ShadowTest shadowTest = new ShadowTest();
        FirstLevel firstLevel = shadowTest.new FirstLevel();
        firstLevel.methodInFirstLevel(23);
        /* output:
         * x=23
         * this.x=1
         * ShadowTest.x=0
         */
    }
}
