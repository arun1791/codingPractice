package methodchaining;

public class Main {
    public static void main(String[] args) {
       
        Student student = Student.of()
        .setAge(45).setName("arun").setCity("delhi");
        System.out.println(student);
    }
    
}