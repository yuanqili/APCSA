package lecture2;

public class TypeConversion {
    public static void main(String[] args) {
        String strValue = "1234";
        int parsedValue = Integer.parseInt(strValue);

        // OK
        short castLong = (short) Math.round(3.1415926);

        // Not OK
        long largeValue = 123456849;
        short castShortValue = (short) largeValue;
        System.out.println(castShortValue);
    }
}
