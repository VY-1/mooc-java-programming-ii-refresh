public class ProductWarehouse extends Warehouse {

    private String name;

    //Creates an empty product warehouse. 
    //The name of the product and the capacity of the warehouse are provided as parameters.
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.name = productName;

    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }
    
    
    public String toString(){
        return this.name + ": " + super.toString();
    }

}
