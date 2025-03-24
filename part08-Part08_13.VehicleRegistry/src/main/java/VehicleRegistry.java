import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry(){
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(!vehicleRegistry.containsKey(licensePlate)){
            vehicleRegistry.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate){
        return this.vehicleRegistry.getOrDefault(licensePlate, null);

    }

    public boolean remove(LicensePlate licensePlate){
        if(this.vehicleRegistry.containsKey(licensePlate)){
            this.vehicleRegistry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates(){
        for(LicensePlate licensePlate: vehicleRegistry.keySet()){
            System.out.println(licensePlate);
        }
    }

    public void printOwners(){
        ArrayList<String> ownerList = new ArrayList<>();

        for (String owner : this.vehicleRegistry.values()){

            if (!ownerList.contains(owner)){

                ownerList.add(owner);
            }
        }
        for (String owner : ownerList){
            System.out.println(owner);
        }

    }
    
}
