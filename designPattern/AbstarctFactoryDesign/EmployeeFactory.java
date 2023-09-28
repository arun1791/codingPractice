package designPattern.AbstarctFactoryDesign;

public class EmployeeFactory {

    //gte empoyee

    public static Employee getEmployee(EmployeeAbstractFactory factory)
    {
            return factory.creatEmployee();
    }
    
}