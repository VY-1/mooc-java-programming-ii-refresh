import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));

        HashMap<SimpleDate, String> dateString = new HashMap<>();

        dateString.put(new SimpleDate(1, 1, 2000), "Joe");
        SimpleDate joe = new SimpleDate(1, 1, 2000);

        System.out.println();
        System.out.println(dateString.get(joe));


    }
}
