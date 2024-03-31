package lambdaExpression;

public class MultiParamsDemo {
    interface Operation {
        int operate(int a, int b);
    }

    public static int executeOperation(int a, int b, Operation op) {
        return op.operate(a, b);
    }

    public static void main(String[] args) {
        Operation op1 = (a, b) -> a + b;
        Operation op2 = (a, b) -> a - b;

        System.out.println(executeOperation(40, 3, op1));
        System.out.println(executeOperation(40, 3, op2));
    }
}
