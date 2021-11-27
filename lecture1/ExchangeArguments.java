public class ExchangeArguments
{
    public static void main(String[] args)
    {
        // arg[0]: the first argument
        // arg[1]: the second argument
        int a = Integer.parseInt(args[0]); 
        int b = Integer.parseInt(args[1]);
        System.out.println("arg[0] is " + a);
        System.out.println("arg[1] is " + b);
        int t = a;
        a = b;
        b = t;
        System.out.println("After exchange, now a is " + a);
        System.out.println("After exchange, now b is " + b);
    }
}
