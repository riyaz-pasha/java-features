package java8.ConsumerFunctionaInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceImplementationAnonymous {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.println("Num : " + number);
            }
        });
    }
}
