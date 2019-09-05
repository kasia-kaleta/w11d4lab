import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
