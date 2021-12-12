package lecture2;

public class DoubleOps {
    public static void main(String[] args) {
        System.out.println(1.0 / 0.0);
        System.out.println(Math.sqrt(-1.0));
        
        // implicit type conversion 隐式类型转换
        System.out.println("5 / 3 is " + 5 / 3);
        System.out.println("5 / 3.0 is " + 5 / 3.0);
        System.out.println("5.0 / 3 is " + 5.0 / 3);
        System.out.println("5.0 / 3.0 is " + 5.0 / 3.0);

        System.out.println("Maximum int is " + Integer.MAX_VALUE);
        System.out.println("Minimum int is " + Integer.MIN_VALUE);

        int super_duper_large_value = Integer.MAX_VALUE + 1;
        System.out.println("Super duper large value is " + super_duper_large_value);
        int super_duper_small_value = Integer.MIN_VALUE - 1;
        System.out.println("Super duper small value is " + super_duper_small_value);
    }
}
