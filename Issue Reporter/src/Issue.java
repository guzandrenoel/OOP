public class Issue {
    private int id;
    private String description;
    private String status; // Submitted, Verified, Resolved
    private User submittedBy;

    public Issue(int id, String description, User submittedBy) {
        this.id = id;
        this.description = description;
        this.status = "Submitted";
        this.submittedBy = submittedBy;
    }

    public int getId() { return id; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public User getSubmittedBy() { return submittedBy; }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Issue #" + id + " | " + description +
                " | Status: " + status +
                " | Submitted by: " + submittedBy.getName();
    }
}
