package java8.ConsumerFunctionaInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceImplementationLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 200, 300, 400, 500);
        numbers.stream().forEach((number) -> System.out.println("Num : " + number));
    }
}
