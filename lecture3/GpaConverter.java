package lecture3;

public class GpaConverter {
    public static void main(String[] args) {
        
        int rawScore = Integer.parseInt(args[0]);
        String gpaLetter = "";

        // Converts rawScore to gpaLetter
        // 90–100: A, 80–89: B, 70–79: C, 60–69: D, below 60: F
        if (rawScore >= 90 && rawScore <= 100) {
            gpaLetter = "A";
        } else if (rawScore >= 80) {
            gpaLetter = "B";
        } else if (rawScore >= 70) {
            gpaLetter = "C";
        } else if (rawScore >= 60) {
            gpaLetter = "D";
        } else {
            gpaLetter = "F";
        }

        System.out.println("Your raw score is " + rawScore + " which is " + gpaLetter);

    }
}
