package com.designPattern;

public class EmployeeFactory {

    //get the empyyye
    public  static  Employee getEmpolyee(String empType)
    {
            if(empType.trim().equalsIgnoreCase("ANDROID")){
                return  new Andriord();
            }
            else if (empType.trim().equalsIgnoreCase("WEB DEVLOPER"))
            {
                return  new Webdevloper()
;            }
            else {
                return  null;
            }
    }
}
