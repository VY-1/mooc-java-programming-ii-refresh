import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("1", "first");
        nameMap.put("2", "second");

        System.out.println(returnSize(nameMap));

    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    public static int returnSize(Map<String, String> names){
        return names.size();
    }
}
