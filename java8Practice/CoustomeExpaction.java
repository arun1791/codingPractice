package java8Practice;

public class CoustomeExpaction {

    void main()
    {
        try {
            throw new InvalidAgeException("Age is not valid");
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}