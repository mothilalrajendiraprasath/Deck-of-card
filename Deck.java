import java.util.ArrayList;

public class Deck {
    public void deckcard() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i <= suits.length; i++) {
            for (int j = 0; i <= suits.length; i++) {
                deck[suits.length * i + j] = ranks[i] + "of" + suits[j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("deck[i]'");
        }
    }
}