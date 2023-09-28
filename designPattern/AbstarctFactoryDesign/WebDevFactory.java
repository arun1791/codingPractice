package designPattern.AbstarctFactoryDesign;

public class WebDevFactory  extends EmployeeAbstractFactory{

    @Override
    public Employee creatEmployee() {
        // TODO Auto-generated method stub
        return new WebDelper();
        //throw new UnsupportedOperationException("Unimplemented method 'creatEmployee'");
    }
    
}