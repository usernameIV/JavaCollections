package ListCollection.SortList.SortPeople;

import ListCollection.SortList.SortPeople.SortPerson;

public class SortPeopleMain {
    public static void main(String[] args) {

        SortPerson sortP = new SortPerson();
        sortP.addPerson("Danton", 19, 1.86);
        sortP.addPerson("Liedson", 21, 1.79);
        sortP.addPerson("Macathos", 20, 1.85);

        System.out.println("List sorted by the age: ");
        System.out.println(sortP.sortByAge());
        System.out.println();
        System.out.println();
        System.out.println("List sorted by the height: ");
        System.out.println(sortP.sortByHeight());

    }




}
