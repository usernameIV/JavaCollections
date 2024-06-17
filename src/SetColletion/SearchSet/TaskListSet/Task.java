package SetColletion.SearchSet.TaskListSet;


public class Task {

    private String description;
    private boolean done;

    public Task (String description) {
        this.description = description;
        this.done = true;
    }

    public String getDescription() {
        return description;
    }
    public boolean isDone() {
        return done;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return  '\n' + "Task: "
            +"description - " + description;
    }
}
