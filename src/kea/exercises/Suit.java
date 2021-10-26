package kea.exercises;

public enum Suit {

    HEART(3, " of hearts"),
    DIAMOND(2, " of diamonds"),
    SPADE(1, " of spades"),
    CLUB(0, " of clubs");

    final int rank;
    final String description;

    Suit(int rank, String description) {
        this.rank = rank;
        this.description = description;
    }

    public int getRank() {
        return this.rank;
    }

    public String getDescription() {
        return this.description;
    }

    public static Suit getRandomSuit() {
        // values() returns an array containing the constants of Suit
        return values()[(int) (Math.random() * values().length)];
    }
}
