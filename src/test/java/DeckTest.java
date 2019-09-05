import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    Deck newDeck;

    @Before
    public void setUp(){
        newDeck = new Deck();
    }

    @Test
    public void canGetCardsSize(){
        assertEquals(0, newDeck.getCardsSize());
    }


    @Test
    public void canGetCards(){
        assertEquals(0, newDeck.getCardsSize());
    }

    @Test
    public void canInitializeDeck(){
        newDeck.initializeDeck();
        assertEquals(52, newDeck.getCardsSize());
    }

    @Test
    public void checkFirstCardValue(){
        newDeck.initializeDeck();
        assertEquals(SuitType.HEARTS, newDeck.getFirstCard().getSuit());
        assertEquals(RankType.ACE, newDeck.getFirstCard().getRank());
    }

    @Test
    public void checkShuffle(){
        newDeck.initializeDeck();
        newDeck.shuffleDeck();
        boolean suitMatch;
        boolean rankMatch;
        boolean cardMatch;

        if (newDeck.getFirstCard().getSuit() == SuitType.HEARTS) {
            suitMatch = true;
        }
        else{suitMatch = false;}

        if (newDeck.getFirstCard().getRank() == RankType.ACE) {
            rankMatch = true;
        }
        else{rankMatch = false;}
        if (suitMatch && rankMatch){
            cardMatch = true;
        }
        else{cardMatch = false;}
        assertTrue(!cardMatch);

    }

    @Test
    public void canDealCard(){
        newDeck.initializeDeck();
        newDeck.dealCard();
        assertEquals(51, newDeck.getCardsSize());
    }

}
