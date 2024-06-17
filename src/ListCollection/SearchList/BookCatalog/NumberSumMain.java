package ListCollection.SearchList.BookCatalog;

import ListCollection.SearchList.NumberSum.NumberSum;

public class NumberSumMain {
    public static void main(String[] args) {

        NumberSum sum = new NumberSum();

        sum.addNumber(20);
        sum.addNumber(30);
        sum.addNumber(40);

        sum.calculateSum();

        sum.findBiggestNumber();

        sum.findSmallestNumber();
        sum.displayNumbers();

    }
}
