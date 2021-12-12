package lecture5;

public class RandomDoubles {
    
    public static void main(String[] args) {
        
        // initialization
        double[] randomValues = new double[42];
        System.out.print("randomValues[]: ");
        for (int i = 0; i < randomValues.length; i++) {
            System.out.print(randomValues[i] + ", ");
        }
        System.out.println("");

        // assignment of random values
        for (int i = 0; i < randomValues.length; i++) {
            randomValues[i] = Math.random();
        }
        System.out.print("randomValues[]: ");
        for (int i = 0; i < randomValues.length; i++) {
            System.out.print(randomValues[i] + ", ");
        }
        System.out.println("");

        double sum = 0;
        for (int i = 0; i < randomValues.length; i++) {
            sum += randomValues[i];
        }
        double mean = sum / randomValues.length;
        System.out.println("The sum is " + sum + ", and the mean is " + mean);

        double maxSoFar = randomValues[0];
        double minSoFar = randomValues[0];
        for (int i = 0; i < randomValues.length; i++) {
            double currentRandomValue = randomValues[i];
            if (currentRandomValue > maxSoFar) {
                maxSoFar = currentRandomValue;
            }
            if (currentRandomValue < minSoFar) {
                minSoFar = currentRandomValue;
            }
        }
        System.out.println("The max is " + maxSoFar + ", and the min is " + minSoFar);

    }

}
