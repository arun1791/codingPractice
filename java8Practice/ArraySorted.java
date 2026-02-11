package java8Practice;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArraySorted {
    void main() {
        int[] arr = {5, 2, 8, 1, 3};
        Set<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        IO.println("collect = " + collect);

        String str[]={"banana","apple","orange","grape"};
        //find firstword using strewam and other
        String firstWord = Stream.of(str)
               // .sorted()
                .findFirst()
                .orElse("No words");
        IO.println("firstWord = " + firstWord);

        String word="AndroidDeveloper";
        String firstChar = Stream.of(word.split(""))
                .findFirst()
                .orElse("No char");
        IO.println("firstChar = " + firstChar);
        //occurrence of char in string
        long count = Stream.of(word.split(""))
                .filter(ch -> ch.equals("e"))
                .count();
        IO.println("count = " + count);
        // occurrence of char in string using charAt all chars using strtea
        Map<String, Long> collect1 = Stream.of(word.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        word.chars().mapToObj(c->String.valueOf((char)c)).forEach(IO::println);
        IO.println("collect1 = " + collect1);

    }

}
