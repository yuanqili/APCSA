public class RootFormula {
    public static void main(String[] args) {
        double b = 1;
        double c = 1;

        double squaredRootValue = Math.sqrt(Math.pow(b, 2) - 4 * c);
        double rootOne = (-b + squaredRootValue) / 2;
        double rootTwo = (-b - squaredRootValue) / 2;
        double rootLarger = Math.max(rootOne, rootTwo);
        double rootSmaller = Math.min(rootOne, rootTwo);
        
        System.out.println("Root one is " + rootOne);
        System.out.println("Root two is " + rootTwo);

        System.out.println("The larger root is " + rootLarger);
        System.out.println("The smaller root is " + rootSmaller);
    }
}
