import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IssueRepository repo = new IssueRepository();
        User user = new User(1, "Alice");
        Admin admin = new Admin(2, "Bob");
        int issueCounter = 1;
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to SugboLink Lite");
            System.out.println("Choose role:");
            System.out.println("1. User");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            System.out.print("Role: ");
            int role = sc.nextInt();
            sc.nextLine();

            switch (role) {
                case 1: // User Menu
                    System.out.println("\nUser Menu:");
                    System.out.println("1. Submit Issue");
                    System.out.println("2. View Issues");
                    System.out.print("Choice: ");
                    int uChoice = sc.nextInt();
                    sc.nextLine();
                    switch (uChoice) {
                        case 1:
                            System.out.print("Enter issue description: ");
                            String desc = sc.nextLine();
                            Issue issue = user.submitIssue(issueCounter++, desc);
                            repo.addIssue(issue);
                            System.out.println("Issue submitted.");
                            break;
                        case 2:
                            repo.displayAll();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 2: // Admin Menu
                    System.out.println("\nAdmin Menu:");
                    System.out.println("1. Verify Issue");
                    System.out.println("2. Resolve Issue");
                    System.out.println("3. Delete Issue");
                    System.out.println("4. View Issues");
                    System.out.print("Choice: ");
                    int aChoice = sc.nextInt();
                    sc.nextLine();
                    switch (aChoice) {
                        case 1:
                            System.out.print("Enter issue ID to verify: ");
                            int vid = sc.nextInt();
                            Issue toVerify = repo.findById(vid);
                            if (toVerify != null) admin.verifyIssue(toVerify);
                            else System.out.println("Issue not found.");
                            break;
                        case 2:
                            System.out.print("Enter issue ID to resolve: ");
                            int rid = sc.nextInt();
                            Issue toResolve = repo.findById(rid);
                            if (toResolve != null) admin.resolveIssue(toResolve);
                            else System.out.println("Issue not found.");
                            break;
                        case 3:
                            System.out.print("Enter issue ID to delete: ");
                            int did = sc.nextInt();
                            admin.deleteIssue(repo, did);
                            break;
                        case 4:
                            repo.displayAll();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting SugboLink Lite. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid role.");
            }
        }
        sc.close();
    }
}
