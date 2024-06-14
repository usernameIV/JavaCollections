package ListCollection;

import ListCollection.Shopping.Item;
import ListCollection.Shopping.ShoppingCart;
import ListCollection.Tasks.TaskList;

public class ListCollectionMain {

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



        ShoppingCart<Item> cart = new ShoppingCart<>();
        cart.addItem("Pão de caixa", 6.50, 2);
        cart.addItem("Caixa de ovo", 18.50, 1);
        cart.addItem("Bolinho de queijo", 2.50, 5);
        cart.addItem("Frango", 25.99, 1);

        cart.showItems();
        cart.calculateTotalValue();

        cart.removeItem("Caixa de ovo");
        System.out.println();
        System.out.println("Value after removal of an item ↓");
        cart.calculateTotalValue();



    }
}
