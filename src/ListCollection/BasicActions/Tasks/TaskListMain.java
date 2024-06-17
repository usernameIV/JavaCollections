package ListCollection.BasicActions.Tasks;

import ListCollection.BasicActions.Tasks.TaskList;

public class TaskListMain {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();
        System.out.println("All elements list: "+ taskList.getAllTasks());


        taskList.addTask("Tarefa 1");
        taskList.addTask("Tarefa 1");
        taskList.addTask("Tarefa 2");
        System.out.println("All elements list: "+ taskList.getAllTasks());

        taskList.removeTask("Tarefa 1");
        System.out.println("All elements list: "+ taskList.getAllTasks());

        System.out.println();

        taskList.getTasksDescription();

    }
}
