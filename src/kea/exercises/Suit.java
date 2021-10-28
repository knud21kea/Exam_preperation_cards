package kea.exercises;

enum Suit {

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

    int getRank() {
        return this.rank;
    }

    String getDescription() {
        return this.description;
    }

    static Suit getRandomSuit() {
        // values() returns an array containing the constants of Suit
        return values()[(int) (Math.random() * values().length)];
    }
}
