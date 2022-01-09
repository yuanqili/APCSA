package lecture8;

public class Dog {

    public static final String bioName = "Canis familiaris";

    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Dog name=" + name + ", age=" + age;
    }

}
