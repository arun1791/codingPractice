package java8Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamClass {
    public static void main(String[] args) {

        List<? extends Number> numbers = List.of(12, 45,25, 65, 12, 65);
        int sum = numbers.stream().distinct().mapToInt(Number::intValue).sum();
        List<? extends Number> list = numbers.stream().distinct().sorted().toList();
        IO.println("sum: " + sum+" sorted list: "+list);

        //concurrent stream
        int sumParallel = numbers.parallelStream().distinct().mapToInt(Number::intValue).sum();
        IO.println("sum using parallel stream: " + sumParallel);
        //concurrent hash map
        var concurrentMap = numbers.parallelStream().distinct()
                .collect(java.util.stream.Collectors.toConcurrentMap(
                        n -> n,
                        n -> 1,
                        Integer::sum
                ));
        IO.println("concurrent map: " + concurrentMap);


        String str = "hello 20 world 40";
        //adding numbers in the string using stream
        int sum1 = Arrays.stream(str.split("\\D+")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
        IO.println("sum of numbers in string: " + sum1);

    }
}
