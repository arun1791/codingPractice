package designPattern.ProtoTypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection  implements Cloneable {
    
    private String ip;
    private String imprtantData;
    private List<String> domains=new ArrayList<>();


    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getImprtantData() {
        return imprtantData;
    }
    public void setImprtantData(String imprtantData) {
        this.imprtantData = imprtantData;
    }

    

    @Override
    public String toString() {
        return "NetworkConnection [ip=" + ip + ", imprtantData=" + imprtantData + ","+domains+",]";
    }
    public void loadveryImprtantdata()
    {
        domains.add("www.matrupeth.in");
        domains.add("www.matrupeth.com");
        domains.add("www.matrupeth.org");
        this.imprtantData="very very imprtant data";

    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    

}