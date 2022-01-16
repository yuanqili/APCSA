package lecture9;

public class StringMethods {

    public static void main(String[] args) {

        String word1 = "apple";
        String word2 = "applg";
        System.out.println(word1.compareTo(word2));
        System.out.println(word2.compareTo(word1));
        System.out.println(word2.compareTo(word2));

        String longMessage = "Good good good";
        System.out.print(longMessage.indexOf("Good"));


        System.out.print("name:\tYuanqi Li\n");
        System.out.print("age:\t27");

        String numbers = "0123456789";
        String numbers2 = "0123456789";

        if (numbers.equals(numbers2)) {
            System.out.println("They are euqal");
        } else {
            System.out.println("They are not euqal");
        }

        System.out.println(numbers);

        String substring1 = numbers.substring(3, 6);  // [3, 6)
        System.out.println(substring1);

        String substring2 = numbers.substring(3);  // [3, ...)
        System.out.println(substring2);
    }

}
