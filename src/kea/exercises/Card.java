package kea.exercises;

public class Card {

    private final int value; // int 1-13
    private final Suit suit; // enum

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getSuitRank() {
        return suit.getRank();
    }

    public boolean beats(Card anotherCard) {
        // doesn't beat an identical card
        return (this.value > anotherCard.value) ||
                (this.value == anotherCard.value && this.getSuitRank() > anotherCard.getSuitRank());
    }

    @Override
    public String toString() {
        return value + suit.getDescription(); // eg "13 of hearts"
    }
}
