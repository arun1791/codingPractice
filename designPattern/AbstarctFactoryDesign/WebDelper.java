package designPattern.AbstarctFactoryDesign;

public class WebDelper  implements Employee{

    @Override
    public int salary() {
        // TODO Auto-generated method stub
        return 5000;
        //throw new UnsupportedOperationException("Unimplemented method 'salary'");
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        System.out.println("i am web devlope ");
        return "ankit";
        //throw new UnsupportedOperationException("Unimplemented method 'name'");
    }
    
}