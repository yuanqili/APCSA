package lecture1;

public class IntegerParser
{
    public static void main(String[] args)
    {
        int value1 = Integer.parseInt("42");
        int value2 = Integer.parseInt("-127");
        int value3 = Integer.parseInt("0");
        int summation = value1 + value2 + value3;
        String message = "Summation is " + summation;
        System.out.println(message);
    }
}
