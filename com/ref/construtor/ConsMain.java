package com.ref.construtor;

public class ConsMain {
    public static void main(String[] args) {
        System.out.println("stduing learing construopr refernve ");

        Provider provider=Student::new;

        Student student = provider.getStudent();
        student.display();
    }

}
