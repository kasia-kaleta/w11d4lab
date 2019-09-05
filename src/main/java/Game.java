public class Game {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.initializeDeck();
        deck.shuffleDeck();

        Card p1card = deck.dealCard();
        Card p2card = deck.dealCard();

        String result;
        if (p1card.getValueFromEnum() > p2card.getValueFromEnum()){
           result =  "P1 Wins!";
        }
        else if (p2card.getValueFromEnum() > p1card.getValueFromEnum()){
            result =  "P2 Wins!";
        }
        else {result = "Draw!";}


        System.out.println("Welcome to the silly game!");
        System.out.println("Player 1 is dealt... " + p1card.getRank().toString() + " of " + p1card.getSuit().toString());
        System.out.println("Player 2 is dealt... " + p2card.getRank().toString() + " of " + p2card.getSuit().toString());
        System.out.println("The result is... " + result);
    }
}
