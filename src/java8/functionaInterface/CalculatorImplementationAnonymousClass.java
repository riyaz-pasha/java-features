package java8.functionaInterface;

public class CalculatorImplementationAnonymousClass {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int add(int firstNumber, int secondNumber) {
                return firstNumber + secondNumber;
            }
        };

        System.out.println("Sum : " + calculator.add(10, 20));
    }
}
