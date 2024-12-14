
import java.util.*;

public class main {

    private String Suit;
    private String Value;
    private String[] Suits = {"H", "D", "S", "C"};
    private String[] Values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] Cards = new String[Suits.length * Values.length];

    public main(String Suit, String Value) {
        this.Suit = Suit;
        this.Value = Value;
    }

    public String getSuit() {
        return Suit;
    }

    public String getValue() {
        return Value;
    }

    public String[] createCards() {
        int index = 0;
        for (String value : Values) {
            for (String suit : Suits) {
                Cards[index++] = value + suit;
            }
        }
        return Cards; // Return the array of cards
    }

    public void shuffleCards() {
        String temp;
        int index;
        Random rand = new Random();
        for (int i = Cards.length - 1; i > 0; i--) {
            index = rand.nextInt(i + 1);
            temp = Cards[index];
            Cards[index] = Cards[i];
            Cards[i] = temp;
        }
    }

    public static void main(String[] args) {
        main deck = new main("H", "A");
        String[] allCards = deck.createCards();

        // Print all cards
        for (String card : allCards) {
            deck.shuffleCards();
            System.out.println(card);
        }
    }
}
