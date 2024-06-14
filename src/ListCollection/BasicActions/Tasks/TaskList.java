package ListCollection.BasicActions.Tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> tasksList;

    public TaskList () {
        this.tasksList = new ArrayList<>();
    }

    public void addTask(String description) {
        tasksList.add(new Task(description));
    }
    public void removeTask(String description) {
        List<Task> toRemoveTasks = new ArrayList<>();
        for (Task task : tasksList) {
            if(task.getDescription().equalsIgnoreCase(description)) {
             toRemoveTasks.add(task);
            }
        }
        tasksList.removeAll(toRemoveTasks);
    }

    public int getAllTasks() {
        return tasksList.size();
    }

    public void getTasksDescription() {
        System.out.println(tasksList);
    }


}
