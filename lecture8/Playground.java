package lecture8;

public class Playground {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        System.out.println(rect1.toString());
        rect1.setWidth(30);
        System.out.println(rect1.toString());
        System.out.println(rect1.toString());
        System.out.println(rect1.toString());

        Rectangle rect2 = new Rectangle(20);
        System.out.println("Rectangle 2: area=" + rect2.area() + ", perimeter=" + rect2.perimeter());

        double[] values = {23, 43, 12, 97, 35};
        Stats stats = new Stats(values);
        stats.describe();

        Dog dog1 = new Dog("dog1", 3);
        System.out.println(dog1.toString());
        Dog dog2 = new Dog("dog2", 4);
        System.out.println(dog2.toString());

        System.out.println(Dog.bioName);
    }

}
