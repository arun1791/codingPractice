package designPattern.ProtoTypeDesignPattern;

public class Main {

    public static void main(String[] args) {
        
        System.out.println(" creating protortype object data type ");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.1");
        networkConnection.loadveryImprtantdata();
        System.out.println(networkConnection.toString());

        // we want ew object network 
       
        try{
             NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
             NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
             System.out.println(networkConnection2);
             System.out.println(networkConnection3);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        

        
    }
    
}