import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> itemsMap;

    public ShoppingCart(){
        this.itemsMap = new HashMap<>();
    }

    //adds an item to the cart that matches the product given as a parameter, with the price given as a parameter.
    public void add(String product, int price){
        if(this.itemsMap.containsKey(product)){            
            this.itemsMap.get(product).increaseQuantity();
            
        }
        else{
            this.itemsMap.put(product, new Item(product, 1, price));
        }
    }
    
    //returns the total price of the shopping cart
    public int price(){
        int totalPrice = 0;
        for(Item item: itemsMap.values()){
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print(){
        for(Item item: this.itemsMap.values()){
            System.out.println(item);
        }
    }
}
