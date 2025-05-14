package Ex3;

public class Calculator {

    public static double divide(double a, double b) {

        try {
            return a / b;
        } catch (ArithmeticException e){
            System.out.println("Teilen durch Null geht nicht");
        }
        return 0.0;
    }

    //...
    public static void main(String[] args) {
        System.out.println(Calculator.divide(3, 0));
    }

}
