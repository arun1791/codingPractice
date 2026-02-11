package java8Practice;

public final class ImmutableObject {

   private final String name;
    private final int age;

    public ImmutableObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ImmutableObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
