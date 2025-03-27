import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // You can test your method here
        Set<String> hashSet = new HashSet<>();
        hashSet.add("first");
        hashSet.add("first");
        hashSet.add("second");
        hashSet.add("second");
        hashSet.add("second");

        System.out.println(returnSize(hashSet));

    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.
    public static int returnSize(Set<String> names){
        return names.size();
    }

}
