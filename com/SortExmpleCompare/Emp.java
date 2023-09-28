package com.SortExmpleCompare;

public class Emp  {

    private String name;
    private  String phone;
    private int empId;

    

    // @Override
    // public int compareTo(Emp o) {
    //     // TODO Auto-generated method stub
    //     return this.empId-o.empId;
        
    //     //throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    // }

    public Emp(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return int return the empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Emp [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
    }

   

   

    

}