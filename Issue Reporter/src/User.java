public class User {
    protected int id;
    protected String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() { return name; }

    public Issue submitIssue(int issueId, String description) {
        return new Issue(issueId, description, this);
    }
}
