package java8Practice;

import java.util.Objects;

public record Student(String UUID, String name, int age) implements Comparable<Student> {
    public Student(String UUID, String name, int age) {
        this.UUID = UUID;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(UUID, student.UUID) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UUID, name, age);
    }
}
