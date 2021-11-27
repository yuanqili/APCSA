public class RandomDigit {
    public static void main(String[] args) {
        // Math.random() returns a random value in [0, 1]
        double randomValue = Math.random();
        // Pay attention to type conversions happened in the following line
        long randomDigit = Math.round(randomValue * 10);
        System.out.println(randomDigit);
    }
}
