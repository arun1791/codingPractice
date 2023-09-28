package designPattern.builderDesignpattern;

public class MIanExamle {
    public static void main(String[] args) {
        User user=new User.UserBuilder()
        .setEmailId("test@gamiol")
        .setUserId("101")
        .setUserName("arun")
        .build();

        System.out.println(user);
        User user2=User.UserBuilder.builder()
        .setEmailId("anit@gmail")
        .setUserId("150")
        .setUserName("hahha")
        .build();

        System.out.println(user2);
    }
    
}