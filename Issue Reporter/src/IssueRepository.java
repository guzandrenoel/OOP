import java.util.ArrayList;

public class IssueRepository {
    private ArrayList<Issue> issues = new ArrayList<>();

    public void addIssue(Issue issue) {
        issues.add(issue);
    }

    public Issue findById(int id) {
        for (Issue issue : issues) {
            if (issue.getId() == id) {
                return issue;
            }
        }
        return null;
    }

    public boolean deleteIssue(int id) {
        Issue toDelete = findById(id);
        if (toDelete != null) {
            issues.remove(toDelete);
            return true;
        }
        return false;
    }

    public void displayAll() {
        if (issues.isEmpty()) {
            System.out.println("No issues reported yet.");
        } else {
            for (Issue issue : issues) {
                System.out.println(issue);
            }
        }
    }
}
