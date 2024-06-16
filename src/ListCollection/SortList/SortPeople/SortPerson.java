package ListCollection.SortList.SortPeople;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPerson {

    private List<Person> persons;

    public SortPerson() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        persons.add(new Person(name, age, height));
    }
    public List<Person> sortByAge() {
        List<Person> personByAge = new ArrayList<>(persons);
        Collections.sort(personByAge);
        return personByAge;
    }
    public List<Person> sortByHeight() {
        List<Person> personByHeight = new ArrayList<>(persons);
        Collections.sort(personByHeight, new Person.ComparatorByHeight());
        return personByHeight;
    }


}
