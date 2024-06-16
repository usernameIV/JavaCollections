package ListCollection.SortList.SortNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortNumber {

    private List<Integer> numbers;

    public SortNumber() {
        this.numbers = new ArrayList<>();
    }

    public void addNumbers(Integer num) {
        numbers.add(num);
    }
    public List<Integer> sortASC() {
        List<Integer> sortNumberAsc = new ArrayList<>(numbers);
        Collections.sort(sortNumberAsc);
        return sortNumberAsc;
    }
    public List<Integer> sortDESC() {
        List<Integer> sortNumberDesc = new ArrayList<>(numbers);
        sortNumberDesc.sort(Collections.reverseOrder());
        return sortNumberDesc;
    }
    public void displayNumbers() {
        System.out.println("Numbers to sort: ");
        for (Integer num : numbers) {
            System.out.println(num + "; ");
        }
    }
}
