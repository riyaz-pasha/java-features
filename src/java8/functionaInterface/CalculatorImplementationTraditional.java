package java8.functionaInterface;

public class CalculatorImplementationTraditional implements Calculator {
    @Override
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        CalculatorImplementationTraditional calculator = new CalculatorImplementationTraditional();
        System.out.println("Sum : " + calculator.add(1, 2));
    }
}
