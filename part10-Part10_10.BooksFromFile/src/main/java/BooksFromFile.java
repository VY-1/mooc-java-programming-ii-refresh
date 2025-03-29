
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        System.out.println("Enter the file name to read: ");
        String fileName = scanner.nextLine();

        List<Book> allBooks = readBooks(fileName);
        for(Book book: allBooks){
            System.out.println("Book title: " + book.getName());
        }

    }

    public static List<Book> readBooks(String file){
        List<Book> books = new ArrayList<>();
        try{
            // reading the file line by line
            Files.lines(Paths.get(file))
                // splitting the row into parts on the "," character
                .map(row -> row.split(","))
                // deleteting the split rows that have less than 2 parts
                .filter(parts -> parts.length >=4)
                //creating book from parts
                .map(parts -> new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
                // add to books List Array
                .forEach(book -> books.add(book));

        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        return books;
    }

}
