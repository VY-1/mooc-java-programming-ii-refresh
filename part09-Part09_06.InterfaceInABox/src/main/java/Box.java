import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity){
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Packable newItem){
        if(weight() + newItem.weight() <= capacity){
            this.items.add(newItem);
        }
    }

    public double weight(){
        double totalWeight = 0;
        for(Packable item: this.items){
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }
    
}
