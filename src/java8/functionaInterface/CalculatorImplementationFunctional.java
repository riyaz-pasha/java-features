package java8.functionaInterface;

public class CalculatorImplementationFunctional {
    public static void main(String[] args) {
        Calculator calculator = (firsNumber, secondNumber) -> firsNumber + secondNumber;
        System.out.println("Sum : " + calculator.add(100, 200));
    }
}
