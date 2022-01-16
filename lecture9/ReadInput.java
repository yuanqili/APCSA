package lecture9;

import java.util.Scanner;

public class ReadInput {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Please input your name: ");
        String name = console.nextLine();
        System.out.println("Welcome, " + name);

        System.out.print("Please input your age: ");
        int age = console.nextInt();
        System.out.println("OK. So your age is " + age);

        System.out.print("Please input your favorite book: ");
        String book = console.next();
        System.out.println("The book's name is " + book);

        System.out.print("Please input your favorite book: ");
        String book2 = console.next();
        System.out.println("The book's name is " + book2);
    }

}
