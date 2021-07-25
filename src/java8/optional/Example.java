package java8.optional;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        String[] words = {"Hi"};

//        String word = words[5].toLowerCase();  // Throws null pointer exception
//        System.out.println(word);
//
        Optional<String> wordOptional = Optional.ofNullable(words[0]);
        if (wordOptional.isPresent()) {
            System.out.println(wordOptional.get());
        } else {
            System.out.println("No word found");
        }
    }
}
