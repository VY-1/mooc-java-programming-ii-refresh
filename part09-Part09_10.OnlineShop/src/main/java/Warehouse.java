import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;


    public Warehouse(){
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    //add product info to inventory
    public void addProduct(String product, int price, int stock){
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);

    }

    //method to get the product's price
    public int price(String product){
        return this.productPrice.getOrDefault(product, -99);
    }
    
    //method to return total product in stock
    public int stock(String product){
        return this.productStock.getOrDefault(product, 0);
    }

    //method to take 1 item off inventory
    public boolean take(String product){
        if(stock(product) > 0){
            this.productStock.put(product, stock(product)-1);
            return true;
        }
        return false;
    }

    public Set<String> products(){
        Set<String> products = this.productStock.keySet();

        return products;
    }

}
