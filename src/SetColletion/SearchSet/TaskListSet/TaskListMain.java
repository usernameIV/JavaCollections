package SetColletion.SearchSet.TaskListSet;

public class TaskListMain {
    public static void main(String[] args) {

        TaskList tList = new TaskList();

        tList.addTask("Practice Taekwondo");
        tList.addTask("Practice programming logic");
        tList.addTask("Farm skelth coins");
        tList.addTask("Date maria");
        tList.addTask("Practice shadow boxing");
        tList.displayTasks();

        tList.removeTask("Date maria");

        System.out.println("Tasks after removal: ");
        tList.displayTasks();
        System.out.println("Count of actual tasks: " + tList.countTasks());

        System.out.println(tList.getDoneTasks());


        tList.makeTaskPending("Farm skelth coins");
        System.out.println("Pending task: "+ tList.getPendingTasks());

        tList.removeAllTasks();

        System.out.println("Tasks after removing all: ");
        tList.displayTasks();



    }
}
