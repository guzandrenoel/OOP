import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
    }

    public void create() {
        cards.clear();
        String[] suits = {"Cloves", "Diamond", "Heart", "Spade"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
        System.out.println("Deck created successfully with 52 cards.\n");
    }

    public void shuffle() {
        if (cards.isEmpty()) {
            System.out.println("Deck is empty. Please create it first.\n");
            return;
        }
        Collections.shuffle(cards);
        System.out.println("Deck shuffled successfully.\n");
    }

    public void deal(int count) {
        if (cards.isEmpty()) {
            System.out.println("Deck is empty. Please create it first.\n");
            return;
        }
        if (count > cards.size()) {
            System.out.println("Not enough cards in the deck. Only " + cards.size() + " left.\n");
            return;
        }
        System.out.println("Dealt Cards:");
        for (int i = 0; i < count; i++) {
            System.out.println(cards.remove(0));
        }
        System.out.println();
    }

    public void display() {
        if (cards.isEmpty()) {
            System.out.println("Deck is empty.\n");
            return;
        }
        System.out.println("Cards in deck:");
        for (Card card : cards) {
            System.out.println(card);
        }
        System.out.println("\nTotal cards remaining: " + cards.size() + "\n");
    }
}
