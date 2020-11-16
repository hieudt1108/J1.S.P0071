public class Task {

    private int id;
    private String name;
    private int typeID;
    private String date;
    private double from;
    private double to;
    private String assignee;
    private String reviewer;

    public Task() {
    }

    public Task(int id, String name, int typeID, String date, double from, double to, String assignee, String reviewer) {
        this.id = id;
        this.name = name;
        this.typeID = typeID;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String typeName() {
        if (typeID == 1) {
            return "Code";
        } else if (typeID == 2) {
            return "Test";
        } else if (typeID == 3) {
            return "Design";
        } else {
            return "Review";
        }
    }

    public double getTime() {
        double time = to - from;
        return time;
    }

    @Override
    public String toString() {
        return String.format("%d%20s%20s%20s%20.1f%20s%20s", id, name, typeName(), date, getTime(), assignee, reviewer);
    }
}
