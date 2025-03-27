
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){

            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }

            inputs.add(input);


        }
        //handling collections as streams
        double average = inputs.stream().mapToInt(s -> Integer.parseInt(s)).average().getAsDouble();

        System.out.print("average of the numbers: " + average);

    }
}
