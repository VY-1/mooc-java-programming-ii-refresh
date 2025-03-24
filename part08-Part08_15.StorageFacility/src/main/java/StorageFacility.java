
//Your task is creating a class called StorageFacility that can be used to keep track of storage units and their contents. 
//The class is to implement the following methods:

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> containers;

    public StorageFacility(){
        this.containers = new HashMap<>();
    }

    //adds the parameter item to the storage unit that is also given as a parameter.
    public void add(String unit, String item){

        //create an empty array of items if it unit doesn't exist
        this.containers.putIfAbsent(unit, new ArrayList<>());

        //add item to specified unit with
        this.containers.get(unit).add(item);
    }

    //returns a list that contains all the items in the storage unit indicated by the parameter. 
    //If there is no such storage unit or it contains no items, the method should return an empty list.
    public ArrayList<String> contents(String storageUnit){

        return this.containers.getOrDefault(storageUnit, new ArrayList<>());
    }

    //removes the given item from the given storage unit. NB! Only removes one item — if there are several items with the same name, the rest still remain. 
    //If the storage unit would be empty after the removal, the method also removes the unit.
    public void remove(String storageUnit, String item){
        this.containers.get(storageUnit).remove(item);

        if(this.containers.get(storageUnit).isEmpty()){
            this.containers.remove(storageUnit);
        }
    }

    //returns the names of the storage units as a list. NB! Only the units that contain items are listed.
    public ArrayList<String> storageUnits(){
        ArrayList<String> storageList = new ArrayList<>();
        for(String unit: this.containers.keySet()){
            if(!unit.isEmpty()){
                storageList.add(unit);
            }
        }
        return storageList;
    
    }
}
