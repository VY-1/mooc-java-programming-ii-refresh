public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changehistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changehistory = new ChangeHistory();
        this.changehistory.add(initialBalance);
        
    }
    
    public String history(){
        return this.changehistory.toString();
    }

    @Override
    public void addToWarehouse(double amount){
        double result = 0;
        result = (double) super.getBalance() + amount;
        this.changehistory.add(result);
        super.addToWarehouse(amount);
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double result = 0;

        result = (double) super.getBalance() - amount;
        //the difference is added not just the amount
        this.changehistory.add(result);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis(){

        System.out.println("Product: " + this.getName());

        System.out.println("History: " + this.changehistory.toString());

        System.out.println("Largest amount of product: " + this.changehistory.maxValue());

        System.out.println("Smallest amount of product:" + this.changehistory.minValue());

        System.out.println("Average: " + this.changehistory.average());
    }
}
