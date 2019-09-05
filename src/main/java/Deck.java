import java.util.ArrayList;
import java.util.List;

public class Deck {

    private ArrayList<Card> cards;


    public Deck(){
        cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getCardsSize() {
        return this.cards.size();
    }


    public void initializeDeck() {
        SuitType[] suitList = SuitType.values();
        RankType[] rankList = RankType.values();

        for(int s = 0; s < suitList.length; s++){
            for (int r = 0 ;r < rankList.length; r++){
                Card card = new Card(suitList[s], rankList[r]);
                this.cards.add(card);
            }
        }
    }
}
