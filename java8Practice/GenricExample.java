package java8Practice;

public class GenricExample {
    void main() {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        Integer intItem = intBox.getItem();
        IO.println("Integer Item: " + intItem);

        Box<String> strBox = new Box<>();
        strBox.setItem("Hello Generics");
        String strItem = strBox.getItem();
        IO.println("String Item: " + strItem);
    }
}
