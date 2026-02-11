package java8Practice;

public record Employee(int id,String name,int age,long salary,String gender,String deptname,String city,int yearOfJoinng) {
    public Employee(int id, String name, int age, long salary, String gender, String deptname, String city, int yearOfJoinng) {
        this.id = id;
        this.name = name;
        this.age = age;

        this.salary = salary;
        this.gender = gender;
        this.deptname = deptname;
        this.city = city;
        this.yearOfJoinng = yearOfJoinng;
    }
}
