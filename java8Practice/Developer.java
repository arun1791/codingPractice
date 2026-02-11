package java8Practice;

public interface Developer {

    void develop();
    //Default method
    default void codeReview() {
        IO.println("Code review in progress");
    }
    //Static method
    static void attendMeeting() {
        IO.println("Attending developer meeting");
    }
}
