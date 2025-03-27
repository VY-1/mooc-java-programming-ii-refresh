
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        List<Integer> allNumbers = new ArrayList<>();

        System.out.println("Enter a number (0) to stop: ");
        while(true){
            int input = Integer.parseInt(scanner.nextLine());
            if(input == 0){
                break;
            }

            allNumbers.add(input);

        }

        List<Integer> positiveOnly = positive(allNumbers);

        System.out.println("Positive numbers: " + positiveOnly);

    }
    
    public static List<Integer> positive(List<Integer> numbers){
        List<Integer> posNumber = numbers.stream().filter(number -> number >0).collect(Collectors.toCollection(ArrayList::new));
        return posNumber;
    }

}
