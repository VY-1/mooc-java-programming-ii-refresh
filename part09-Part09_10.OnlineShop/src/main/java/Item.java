public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;

    }

    //get the price of the item based on quantity
    public int price(){
        return this.unitPrice * this.qty;
    }

    //increase quantity by one
    public void increaseQuantity(){
        this.qty++;
    }

    public String toString(){
        return this.product +": " + this.qty;
    }
    
}
