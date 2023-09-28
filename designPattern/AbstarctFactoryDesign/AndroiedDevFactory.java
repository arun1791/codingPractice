package designPattern.AbstarctFactoryDesign;

public class AndroiedDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee creatEmployee() {
        // TODO Auto-generated method stub
        return new AndroidDevloper();
        //throw new UnsupportedOperationException("Unimplemented method 'creatEmployee'");
    }
    
}