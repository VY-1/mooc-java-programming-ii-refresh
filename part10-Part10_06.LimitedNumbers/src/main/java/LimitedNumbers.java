
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        
        while(true){
            int input = Integer.parseInt(scanner.nextLine());
            if(input < 0){
                break;
            }

            numberList.add(input);


        }

        //filters numberList between 1-5 and prints each number within the range
        numberList.stream().filter(number -> number >=1 && number<=5).forEach(num ->System.out.println(num));

    }
}
