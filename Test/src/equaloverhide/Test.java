package equaloverhide;

public class Test {

  

public final int x=34;

   public Test() {
    System.out.println(x);
   }

@Override
public boolean equals(Object obj) {
    
    Test t=(Test) obj;
    return t.x==this.x;
}

   

   
    
}