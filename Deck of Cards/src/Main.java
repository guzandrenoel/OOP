import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Deal Cards");
            System.out.println("4. Display Deck");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Enter a number between 1 and 5.");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck.create();
                    break;
                case 2:
                    deck.shuffle();
                    break;
                case 3:
                    System.out.print("How many cards to deal? ");
                    int count = scanner.nextInt();
                    deck.deal(count);
                    break;
                case 4:
                    deck.display();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }

        } while (choice != 5);

        scanner.close();
    }
}
