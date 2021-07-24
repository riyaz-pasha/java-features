package java8.SupplierFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Example {

    public static final String DEFAULT_VALUE = "Default Value";

    public static void main(String[] args) {
        List<String> list = Arrays.asList();
        Supplier<String> defaultValue = () -> DEFAULT_VALUE;
        System.out.println(list.stream().findAny().orElseGet(defaultValue));
    }
}
