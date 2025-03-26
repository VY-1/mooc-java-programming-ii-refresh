import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item newItem){
        int totalWeight = 0;
        for(Item item: this.items){
            totalWeight += item.getWeight();
        }
        if(totalWeight + newItem.getWeight() <= capacity){
            this.items.add(newItem);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
}
