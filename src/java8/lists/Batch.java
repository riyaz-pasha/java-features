package java8.lists;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Batch {

    private static <T> Collection<List<T>> nBatches(List<T> objs, final int batchSize) {
        return IntStream.range(0, objs.size())
                .boxed()
                .collect(Collectors.groupingBy(
                        e -> e % batchSize,
                        Collectors.mapping(objs::get, toList())
                ))
                .values();
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.range(1, 11).boxed().collect(toList());
        Collection<List<Integer>> batches = nBatches(integerList, 3);
        System.out.println(batches); // [[1, 4, 7, 10], [2, 5, 8], [3, 6, 9]]
    }
}
