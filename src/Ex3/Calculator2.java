package Ex3;

public class Calculator2 {

    public static double divide(double a, double b) {

        if (b == 0){
            throw new ArithmeticException("Teilen durch Null");
        }
        return a / b;
    }

    //...
    public static void main(String[] args) {

        try {
            System.out.println(Calculator.divide(3, 0));
        } catch (ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }


    }

}
