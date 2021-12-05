package lecture4;

public class GamblerRuin {
    public static void main(String[] args) {

        int numGamblers = 10000;
        int numWinners = 0;

        for (int i = 0; i < numGamblers; i++) {
            int stake = 190;
            int goal = 200;
            while (stake < goal && stake > 0) {
                if (Math.random() < 0.5)
                    stake += 1;
                else
                    stake -= 1;
            }
            if (stake == goal)
                numWinners++;
        }

        System.out.println(
            numWinners + " out of " + numGamblers + " win (" 
            + (double) numWinners / numGamblers * 100 + "%)"
        );

    }
}
