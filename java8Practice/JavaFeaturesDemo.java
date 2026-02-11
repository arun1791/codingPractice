package java8Practice;

// java
public class JavaFeaturesDemo {
    // record (Java 16+)
    record Point(int x, int y) {}

    // sealed interface and permitted implementations (Java 17+)
    static sealed interface Shape permits Circle, Rectangle {
        double area();
    }
    static final class Circle implements Shape {
        final double r;
        Circle(double r) { this.r = r; }
        public double area() { return Math.PI * r * r; }
    }
    static final class Rectangle implements Shape {
        final double w, h;
        Rectangle(double w, double h) { this.w = w; this.h = h; }
        public double area() { return w * h; }
    }

    public static void main(String[] args) throws Exception {
        // Java 8: Lambdas + Streams + Optional + java.time
        var nums = java.util.List.of(1, 2, 3, 4, 5, 6);
        int sumEven = nums.stream()
                          .filter(n -> n % 2 == 0) // lambda
                          .mapToInt(Integer::intValue)
                          .sum();
        System.out.println("Sum of evens: " + sumEven);

        java.util.Optional<Integer> maybe = nums.stream().filter(n -> n > 10).findFirst();
        System.out.println("Optional example: " + maybe.orElse(-1));

        var today = java.time.LocalDate.now();
        System.out.println("Today: " + today);

        // Java 10: var
        var message = "Hello Java (var)";
        System.out.println(message);

        // Java 11: HttpClient (sync example)
        var client = java.net.http.HttpClient.newHttpClient();
        var request = java.net.http.HttpRequest.newBuilder()
                        .uri(java.net.URI.create("https://httpbin.org/get"))
                        .GET()
                        .build();
        var response = client.send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
        System.out.println("HTTP status: " + response.statusCode());

        // Java 12+ / 14+: switch expression
        int code = 2;
        var label = switch (code) {
            case 1 -> "one";
            case 2 -> "two";
            default -> "many";
        };
        System.out.println("Switch expression result: " + label);

        // Java 13+: text block
        var json = """
                   {
                     "name": "JavaFeatures",
                     "version": 21
                   }
                   """;
        System.out.println("Text block JSON:\n" + json);

        // Java 16+: record usage
        var p = new Point(3, 4);
        System.out.println("Point: " + p + ", x+y=" + (p.x() + p.y()));

        // Java 16+: pattern matching for instanceof
        Object maybeStr = "a string";
        if (maybeStr instanceof String s) {
            System.out.println("Pattern matched string length: " + s.length());
        }

        // Java 17+: sealed types usage
        Shape s1 = new Circle(2.5);
        Shape s2 = new Rectangle(3, 4);
        System.out.println("Areas: " + s1.area() + ", " + s2.area());

        // Java 19/21+: virtual threads (Project Loom - use JDK 21 for stable APIs)
        var vt = Thread.ofVirtual().start(() -> {
            System.out.println("Running on a virtual thread: " + Thread.currentThread());
        });
        vt.join(); // wait for it to finish

        System.out.println("Demo finished.");
    }
}