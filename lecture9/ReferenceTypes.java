package lecture9;

public class ReferenceTypes {

    public static void main(String[] args) {

        // Primitive types 基础数据类型
        int integerValue = 10;
        long longValue = 10;
        float floatValue = 42.0f;
        double doubleValue = 42.0;
        char charValue = ' ';
        boolean booleanValue = true;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // Reference types 引用数据类型
        // class/object
        String message = new String("Hello World");
        // syntax sugar 语法糖
        String message2 = "Hello World";
        int messageLength = message.length();

    }

}
