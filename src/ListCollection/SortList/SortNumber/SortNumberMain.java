package ListCollection.SortList.SortNumber;

import ListCollection.SortList.SortNumber.SortNumber;

public class SortNumberMain {
    public static void main(String[] args) {

        SortNumber myNumber = new SortNumber();
        myNumber.addNumbers(20);
        myNumber.addNumbers(50);
        myNumber.addNumbers(40);
        myNumber.addNumbers(10);
        myNumber.addNumbers(30);

        myNumber.displayNumbers();
        System.out.println(myNumber.sortASC());
        System.out.println(myNumber.sortDESC());

    }
}
