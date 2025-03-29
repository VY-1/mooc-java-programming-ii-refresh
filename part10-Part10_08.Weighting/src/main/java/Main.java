

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
        System.out.println();

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(suitcase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }

}
