package methodchaining;

public class ClassExample {

    static String name;
    static Float salary;

    public static void setData(String n, Float s)
    {
            name = n;
            salary = s;
    }
    
    public static  void getData()
    {
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
        
    }

    public static void main(String[] args) {
        
		ClassExample.setData("Arun", 1020F);
        ClassExample.getData();
    }
}