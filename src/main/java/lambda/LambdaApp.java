package lambda;

public class LambdaApp {
    public static void main(String[] args) {
        Operationable operation = (a , b) -> a + b;

        int result = operation.calculate(20, 10);
        System.out.println(result); //30

        Operationable operation1 = ( m,  l) -> m / l;
        Operationable operation2 = ( x,  y) -> x - y;
        Operationable operation3 = ( x,  y) -> x * y;

        System.out.println(operation1.calculate(20, 10)); //30
        System.out.println(operation2.calculate(20, 10)); //10
        System.out.println(operation3.calculate(20, 10)); //200

    }
}

@FunctionalInterface
interface Operationable {
    int calculate(int z, int k);
}
