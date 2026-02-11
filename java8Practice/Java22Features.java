package java8Practice;

public class Java22Features {
    void main()
    {
        String textBlock = """
                This is a text block
                in Java 22.
                It can span multiple lines.
                """;
        System.out.println(textBlock);

        try {
            int result = switch ("TWO") {
                case "ONE" -> 1;
                case "TWO" -> 2;
                case "THREE" -> 3;
                default -> throw new IllegalArgumentException("Unexpected value");
            };
            System.out.println("Switch expression result: " + result);
        } catch (IllegalArgumentException _) {
          IO.println("Caught an exception in switch expression");
        }
    }

}
