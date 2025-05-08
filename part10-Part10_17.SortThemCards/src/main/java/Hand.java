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

    public void sortBySuit(){
        Comparator<Card> comparator = Comparator.comparing(Card::getSuit).thenComparing(Card::getValue);

        Collections.sort(this.cards, comparator);
    }
    private int sumOfValues() {
        int sum = 0;
 
        for (Card card : cards) {
            sum += card.getValue();
        }
 
        return sum;
    }
 
    @Override
    public int compareTo(Hand hand) {
        return this.sumOfValues() - hand.sumOfValues();
    }


}
