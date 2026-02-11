package java8Practice;

import java.util.Arrays;
import java.util.List;

public class Main {

    void main()
    {
        List<Student> list= Arrays.asList(new Student("1","Alice",23),
                new Student("2","Bob",21),
                new Student("3","Charlie",22));
        list.stream().sorted().forEach(System.out::println);

        list.stream().sorted(new NameComapreble()).forEach(System.out::println);


        AndroirdDeveloper androirdDeveloper=new AndroirdDeveloper();
        androirdDeveloper.develop();
//        androirdDeveloper.performCodeReview();
        Developer developer=new AndroirdDeveloper();
        developer.codeReview();
        Developer.attendMeeting();


        ImmutableObject immutableObject=new ImmutableObject("John",30);
        System.out.println(immutableObject);

    }
}
