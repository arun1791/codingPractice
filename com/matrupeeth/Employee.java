package com.matrupeeth;

public class Employee {
    private  int id;
    private  String name;
    private  String emailid;

    public Employee() {
    }

    public Employee(int id, String name, String emailid) {
        this.id = id;
        this.name = name;
        this.emailid = emailid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailid='" + emailid + '\'' +
                '}';
    }


}
