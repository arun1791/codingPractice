package java8Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class App {
    void main() throws InterruptedException {
        /*IO.println("Hell world");

        IO.println(Thread.currentThread().getName());
        IO.println("Wroling of some task ");
        //going to viruiatl thread

        var vt1=Thread.ofVirtual().name("Virtual thread1").start(() -> {
            IO.println(Thread.currentThread().getName());
            IO.println("Wroling of some task in virtual thread");
            for (int i = 0; i <= 10; i++) {
                IO.println("Virtual Thread Count: " + i);
            }
        });
        //Thread.sleep(2000);
        vt1.join();
        try(ExecutorService executorService=Executors.newVirtualThreadPerTaskExecutor())
        {
            var future=executorService.submit(()->{
                IO.println(Thread.currentThread().getName());
                IO.println("Wroling of some task in virtual thread using executor service");
                for (int i = 0; i <= 10; i++) {
                    IO.println("Virtual Thread using Executor Service Count: " + i);
                }
            });
            future.get();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        IO.println("Thread to end");
    }*/

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Yanksha", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "Francesca", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "Ramesh", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "Melanie", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "Padma", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "Milad", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "Uzma", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "Ali", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "Ram", 25, 160, "M", "IT", "Blore", 2010));

        //grouping by city
        var groupByCity = empList.stream().collect(java.util.stream.Collectors.groupingBy(Employee::city));
        IO.println("Grouping by city: " + groupByCity);

        //Find count of male and female present in organization
        var genderCount = empList.stream().collect(java.util.stream.Collectors.groupingBy(Employee::gender, Collectors.counting()));
        IO.println("Gender Count: " + genderCount);

        //Find the count of male and female present in each department
        var genderCountByDept = empList.stream().collect(java.util.stream.Collectors.groupingBy(Employee::deptname,
                Collectors.groupingBy(Employee::gender, Collectors.counting())));
        IO.println("Gender Count by Department: " + genderCountByDept);

        //Print the names of all distinct departments in the organization.
        var distinctDepts = empList.stream().map(Employee::deptname).distinct().toList();
        IO.println("Distinct Departments: " + distinctDepts);

        //Print employee details whose age is greater than 28 in the organisation.
        var empAgeGreaterThan28 = empList.stream().filter(e -> e.age() > 28).toList();
        IO.println("Employees with age greater than 28: " + empAgeGreaterThan28);


        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
        //all covert upper case
        strings.stream().sorted().map(String::toUpperCase).forEach(IO::println);
        //second heightes word find using stream
        var secondHighest = strings.stream()
                .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                .skip(1)
                .findFirst();
        IO.println("Second highest length word: " + secondHighest.orElse("Not found"));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //find sum of squares of even numbers
        var sumOfSquares = numbers.stream()
                //.filter(n -> n % 2 == 0)
                //.map(n -> n * n)
                .reduce(0, Integer::sum);
        IO.println("Sum of squares of even numbers: " + sumOfSquares);
        int sum = numbers.stream().mapToInt(i -> i).sum();
        IO.println("Sum using mapToInt: " + sum);


    }
}
