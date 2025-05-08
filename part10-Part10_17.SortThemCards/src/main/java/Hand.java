import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void add(Card card){
        this.cards.add(card);
    }

    public void print(){
        this.cards.stream().forEach(card-> System.out.println(card));
    }

    public void sort(){
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand otherHand){
        int valueThisHand = 0;
        int valueOtherHand = 0;

        for(Card card: this.cards){
            valueThisHand += card.getValue();
        }
        for(Card card: otherHand.cards){
            valueOtherHand += card.getValue();
        }

        return valueThisHand - valueOtherHand;
    }

    public void sortBySuit(){
        Comparator<Card> comparator = Comparator.comparing(Card::getSuit).thenComparing(Card::getValue);

        Collections.sort(this.cards, comparator);
    }
}
