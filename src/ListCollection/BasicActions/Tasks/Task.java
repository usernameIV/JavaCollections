package ListCollection.BasicActions.Tasks;

public class Task {

    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription () {
        return description;
    }

    @Override
    public String toString() {
        return "ListCollection.BasicActions.Tasks:"+" descriptions = " + description;
    }
}
