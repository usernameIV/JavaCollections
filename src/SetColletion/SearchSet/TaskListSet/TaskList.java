package SetColletion.SearchSet.TaskListSet;

import java.util.HashSet;
import java.util.Set;


public class TaskList {

    private Set<Task> toDoTasks;

    public TaskList () {
        this.toDoTasks = new HashSet<>();
    }
    public void addTask(String description) {
        toDoTasks.add(new Task(description));
    }
    public void removeTask(String description) {
        Task taskToRemove = null;
        if (!toDoTasks.isEmpty()) {
            for (Task tsk : toDoTasks) {
                if (tsk.getDescription().equalsIgnoreCase(description)){
                    taskToRemove = tsk;
                }
            }
            toDoTasks.remove(taskToRemove);
        }
    }
    public void displayTasks() {
        System.out.println(toDoTasks);
    }
    public int countTasks() {
        return toDoTasks.size();
    }
    public Set<Task> getDoneTasks() {
        Set<Task> doneTasks = new HashSet<>();
        for (Task tsk : toDoTasks) {
            if (tsk.isDone()) {
                doneTasks.add(tsk);
            }
        }
        return doneTasks;
    }
    public Set<Task> getPendingTasks() {
        Set<Task> pendingTasks = new HashSet<>();
        for (Task tsk : toDoTasks) {
            if (!tsk.isDone()) {
                pendingTasks.add(tsk);
            }
        }
        return pendingTasks;
    }
    public void makeTaskDone(String description) {
        for (Task tsk : toDoTasks) {
            if (tsk.getDescription().equalsIgnoreCase(description)) {
                tsk.setDone(true);
            }
        }
    }
    public void makeTaskPending(String description) {
        for (Task tsk : toDoTasks) {
            if (tsk.getDescription().equalsIgnoreCase(description)) {
                tsk.setDone(false);
            }
        }
    }
    public void removeAllTasks() {
        toDoTasks.removeAll(toDoTasks);
    }


}