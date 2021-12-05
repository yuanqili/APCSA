package lecture3;

public class Flip
{
    public static void main(String[] args)
    {
        double random = Math.random();
        if (random < 0.5)
            System.out.println("Heads" + " " + random);
        else
            System.out.println("Tails" + " " + random);
    }
}
