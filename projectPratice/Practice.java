package projectPratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Practice {


    public static void main(String[] args) {
        String str = "";

        Student student = new Student(12, "arun", "badlapur", 90960032655L);

        if (student.id() != null)
            System.out.println("Student is no balank");

        String name = "Alice";
        int age = 30;
        double salary = 75000.50;

        // Using System.out.printf
        System.out.printf("Name: %s, Age: %d, Salary: $%.2f%n", name, age, salary);

        List<Student> students = new ArrayList<>();
        //students.add(new Student(12, "arun", "badlapur", 909600L));
       //students = null;
        //System.out.println("mnnn" + OptionalInt.of(students.size()));

        for (Student studentdata : students) {
            Optional.of(studentdata);
            System.out.println(Optional.ofNullable(studentdata));

        }
        Long mobileNumber=30125456L;
        if(mobileNumber!=null)
        {
//            Long newMob = Optional.of(mobileNumber).get();
            System.out.println( Optional.ofNullable(mobileNumber));
        }



        


    }
}
