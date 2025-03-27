import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy){
        for(Movable movable: this.herd){
            movable.move(dx, dy);
        }
    }

    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }

    @Override
    public String toString(){
        String newString = "";
        for(Movable movable: this.herd){
            newString += movable.toString() + "\n";
        }
        return newString;
    }
}
