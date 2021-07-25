package java8.methodReferences;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class ReferenceToStaticMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("riyaz", "pasha", "mohammed");
//        list.stream().map(word -> StringUtils.capitalize(word)).forEach(word -> System.out.println(word));
        list.stream().map(StringUtils::capitalize).forEach(System.out::println);
    }
}
