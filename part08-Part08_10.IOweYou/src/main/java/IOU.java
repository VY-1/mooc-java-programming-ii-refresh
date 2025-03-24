import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iouMap;

    public IOU(){
        this.iouMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        iouMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        
        return this.iouMap.getOrDefault(toWhom, (double) 0);
    }
    
}
