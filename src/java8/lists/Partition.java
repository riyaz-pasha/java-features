package java8.lists;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Partition {

    private static <T> Collection<List<T>> nPartition(List<T> objs, final int noOfItemsInEachList) {
        return IntStream.range(0, objs.size())
                .boxed()
                .collect(Collectors.groupingBy(
                        e -> e / noOfItemsInEachList,
                        Collectors.mapping(objs::get, Collectors.toList())
                ))
                .values();
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.range(1, 11).boxed().collect(toList());
        Collection<List<Integer>> batches = nPartition(integerList, 3);
        System.out.println(batches); // [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]
    }
}
