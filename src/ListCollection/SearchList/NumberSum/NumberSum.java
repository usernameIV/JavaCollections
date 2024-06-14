package ListCollection.SearchList.NumberSum;

import java.util.ArrayList;
import java.util.List;

public class NumberSum {

    List<Integer> numberList;

    public NumberSum() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number) {
        numberList.add(number);
    }
    public void calculateSum() {
        int even = 0;
        int odd = 0;
        int resultSum;
        for(int number : numberList) {
            int calculus = number++;
            if (number % 2 == 0) {
                even += calculus;
            }
            if (number % 2 != 0) {
                odd += calculus;
            }
        }
        resultSum = even + odd;
        System.out.println("The sum of numbers on list is: "+ resultSum);
    }
    public void findBiggestNumber() {
        if (!numberList.isEmpty()) {
            int maxIndex = 0;
            for (int i = 1; i < numberList.size(); i++) {
                if (numberList.get(i) > numberList.get(maxIndex)) {
                    maxIndex = i;
                }
            }
            System.out.println("The largest number is: " + numberList.get(maxIndex));
        }
        else {
            System.out.println("The list is empty.");
        }

    }
    public void findSmallestNumber() {
        if (!numberList.isEmpty()) {
            int minIndex = 0;
            for (int i = 1; i < numberList.size(); i++) {
                if (numberList.get(i) < numberList.get(minIndex)) {
                    minIndex = i;
                }
            }
            System.out.println("The smallest number is: " + numberList.get(minIndex));
        }
        else {
            System.out.println("The list is empty.");
        }
    }
    public void displayNumbers() {
        System.out.println("The numbers are: ");
        for (int number : numberList) {
            System.out.print(number + " ;" );
        }
    }



}
