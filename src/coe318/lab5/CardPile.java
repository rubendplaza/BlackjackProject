package coe318.lab5;
/**
 *
 * @author
 */

import java.util.ArrayList;

/**
 * A pile of cards.
 *
 */
public class CardPile {
    //Instance variables
    private ArrayList <Card> cards;

    public CardPile() {
        //Initialize the instance variable.-
        cards = new ArrayList <Card>();
    }
    /**
     * Add a card to the pile.
     * @param card
     */
    public void add(Card card) {
        cards.add(card);
        //FIX THIS-
    }

    /**
     * Remove a card chosen at random from the pile.
     * @return
     */
    public Card removeRandom() {

        //double randDouble = Math.random() * (cards.size());
        int randIndex = (int)(Math.random()*cards.size());

        Card removedCard = cards.get(randIndex);
        cards.remove(randIndex);

        return removedCard;
        //FIX THIS-
    }

    /**
     * The string representation is a space separated list
     * of each card.
     * @return
     */
    @Override
    public String toString() {

        String returnString = "";

        for (int i = 0; i < cards.size(); i++){

            returnString = returnString.concat(cards.get(i) + " ");

        }

        //FIX THIS-
        return returnString;
    }

    /**
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public static void main(String[] args) {
        CardPile p = new CardPile();
        p.add(new Card(2, 1, true));
        p.add(new Card(3, 2, true));
        p.add(new Card(4, 3, false));
        p.add(new Card(14, 1, true));
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("Removed: " + p.removeRandom());
        System.out.println("");
        CardPile deck = new CardPile();
        for(int i = 2; i < 15; i++) {
            for(int j = 0; j < 4; j++) {
                deck.add(new Card(i, j, true));
            }
        }
        for (int i = 0; i < 52; i++) {
            System.out.println((i+1) + ": " + deck.removeRandom());

        }
    }


}