package designPattern.AbstarctFactoryDesign;

public class Client {

    public static void main(String[] args) {
        Employee e1=EmployeeFactory.getEmployee(new AndroiedDevFactory()) ;
        e1.name();

         Employee e2=EmployeeFactory.getEmployee(new WebDevFactory()) ;
        e2.name();        
    }
    
}