package java8.PredicateFunctionaInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateFunctionalInterfaceImplementationAnonymous {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Predicate<Integer> even = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        Consumer<Integer> print = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Num : " + integer);
            }
        };
        numbers.stream().filter(even).forEach(print);
    }
}
