package designPattern.AbstarctFactoryDesign;

public class AndroidDevloper implements Employee{

    @Override
    public int salary() {
        // TODO Auto-generated method stub
        return 5000;
        //throw new UnsupportedOperationException("Unimplemented method 'salary'");
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        System.out.println("my name is androied devloper");
        return "Arun";
        //throw new UnsupportedOperationException("Unimplemented method 'name'");
    }

    

    
}