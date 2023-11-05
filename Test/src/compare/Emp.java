package compare;

public class Emp implements Comparable<Emp> {

    private int id ;
    private String name;
    private String desc;


    public  Emp() 
    {

    }
    @Override
    public int compareTo(Emp o) {
        // TODO Auto-generated method stub
        return this.id-o.id;

    }
    public Emp(int id, String name, String desc)
    {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", desc=" + desc + "]";
    }
    
    
}