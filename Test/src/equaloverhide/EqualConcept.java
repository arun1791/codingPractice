package equaloverhide;

public class EqualConcept {

    public static void main(String[] args) {
        Test t=new Test();
        Test t1=new Test();
        System.out.println(t.equals(t1));
        System.out.println(t==t1);
    }
    
}