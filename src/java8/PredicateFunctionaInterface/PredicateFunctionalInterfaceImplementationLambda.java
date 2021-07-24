package java8.PredicateFunctionaInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateFunctionalInterfaceImplementationLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 12, 13, 14, 15);
        Predicate<Integer> even = (integer) -> integer % 2 == 0;
        Consumer<Integer> print = (integer) -> System.out.println("Num : " + integer);
        numbers.stream().filter(even).forEach(print);
    }
}
