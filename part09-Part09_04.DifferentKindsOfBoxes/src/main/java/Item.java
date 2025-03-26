import java.util.Objects;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Item)){
            return false;
        }

        Item comparedItem = (Item) compared;
        if(this.name == comparedItem.name){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash = 90 * hash + Objects.hashCode(this.name);
        return hash;
    }

}
