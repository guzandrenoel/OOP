public class Admin extends User {

    public Admin(int id, String name) {
        super(id, name);
    }

    public void verifyIssue(Issue issue) {
        if (issue.getStatus().equals("Submitted")) {
            issue.setStatus("Verified");
            System.out.println("Admin verified issue #" + issue.getId());
        }
    }

    public void resolveIssue(Issue issue) {
        if (!issue.getStatus().equals("Resolved")) {
            issue.setStatus("Resolved");
            System.out.println("Admin resolved issue #" + issue.getId());
        }
    }

    public void deleteIssue(IssueRepository repo, int id) {
        if (repo.deleteIssue(id)) {
            System.out.println("Admin deleted issue #" + id);
        } else {
            System.out.println("Issue not found.");
        }
    }
}
