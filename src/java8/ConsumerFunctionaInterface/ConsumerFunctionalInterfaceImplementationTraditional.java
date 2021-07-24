package java8.ConsumerFunctionaInterface;

import java8.functionaInterface.CalculatorImplementationTraditional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceImplementationTraditional implements Consumer<Integer> {
    @Override
    public void accept(Integer number) {
        System.out.println("num : " + number);
    }

    public static void main(String[] args) {
        ConsumerFunctionalInterfaceImplementationTraditional consumer = new ConsumerFunctionalInterfaceImplementationTraditional();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().forEach(consumer);
    }
}
