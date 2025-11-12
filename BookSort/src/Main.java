import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<CatalogCard> catalog = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library Catalog System ===");
            System.out.println("1. Add Catalog Card");
            System.out.println("2. Edit Catalog Card");
            System.out.println("3. Remove Catalog Card");
            System.out.println("4. View Catalog Card(s)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Card ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Year Published: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Publisher: ");
                    String publisher = sc.nextLine();

                    catalog.add(new CatalogCard(id, title, author, year, publisher));
                    Collections.sort(catalog);
                    System.out.println("Catalog card added and sorted by Card ID!");
                }

                case 2 -> {
                    System.out.print("Enter Card ID to edit: ");
                    int editID = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;

                    for (CatalogCard card : catalog) {
                        if (card.getCardID() == editID) {
                            System.out.println("Editing Catalog Card...");
                            System.out.print("Enter new Book Title: ");
                            card.setBookTitle(sc.nextLine());
                            System.out.print("Enter new Book Author: ");
                            card.setBookAuthor(sc.nextLine());
                            System.out.print("Enter new Year Published: ");
                            card.setYearPublished(sc.nextInt());
                            sc.nextLine();
                            System.out.print("Enter new Publisher: ");
                            card.setPublisher(sc.nextLine());
                            found = true;
                            System.out.println("Catalog card updated!");
                            break;
                        }
                    }
                    if (!found) System.out.println("Catalog Card not found!");
                }

                case 3 -> {
                    System.out.print("Enter Card ID to remove: ");
                    int removeID = sc.nextInt();
                    sc.nextLine();
                    boolean removed = catalog.removeIf(card -> card.getCardID() == removeID);
                    if (removed) System.out.println("Catalog Card removed!");
                    else System.out.println("Catalog Card not found!");
                }

                case 4 -> {
                    System.out.println("\n1. View Single Catalog Card");
                    System.out.println("2. View All Catalog Cards (Sorted)");
                    System.out.print("Enter your choice: ");
                    int viewChoice = sc.nextInt();
                    sc.nextLine();

                    if (viewChoice == 1) {
                        System.out.print("Enter Card ID: ");
                        int searchID = sc.nextInt();
                        sc.nextLine();
                        boolean found = false;
                        for (CatalogCard card : catalog) {
                            if (card.getCardID() == searchID) {
                                card.displayCard();
                                found = true;
                                break;
                            }
                        }
                        if (!found) System.out.println("Catalog Card not found!");
                    } else if (viewChoice == 2) {
                        if (catalog.isEmpty()) {
                            System.out.println("No catalog cards to display!");
                        } else {
                            System.out.println("\n=== Catalog List (Sorted by Card ID) ===");
                            for (CatalogCard card : catalog) {
                                card.displayCard();
                            }
                        }
                    }
                }

                case 5 -> System.out.println("Exiting system...");

                default -> System.out.println("Invalid choice. Try again!");
            }

        } while (choice != 5);
        sc.close();
    }
}
