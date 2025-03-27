
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordsList = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }

            wordsList.add(input);

        }

        //using stream and foreach to print the elements in the list
        wordsList.stream().forEach(word -> System.out.println(word));

    }
}
