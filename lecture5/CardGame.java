package lecture5;

public class CardGame {
    
    public static void main(String[] args) {
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A" };
        String[] suit = { "c", "d", "h", "s" };
        String[] deck = new String[52];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[ i + j * 13 ] = rank[i] + suit[j];
            }
        }

        // Math.random() -> [0, 1)
        // Math.random() * 52 -> [0, 52)
        for (int t = 0; t < 5; t++) {
            for (int i = 0; i < deck.length; i++) {
                int cardIndex = (int)(Math.random() * 52);
                String temp = deck[i];
                deck[i] = deck[cardIndex];
                deck[cardIndex] = temp;
            }
        }

        for (int i = 0 ; i < deck.length; i++) {
            String card = deck[i];
            char cardRank = card.charAt(0);
            char cardSuit = card.charAt(1);
            System.out.println( "Rank is " + cardRank + ", and suit is " + cardSuit );
        }
    }
}
