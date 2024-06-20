package MapCollection.SortMap;

import java.time.LocalDate;
import java.util.*;

public class EventsSchedule {

    private Map<LocalDate, Event> events;

    public EventsSchedule() {
        this.events = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String attraction) {
        events.put(date, new Event(name, attraction));
    }
    public void displaySchedule() {
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(events);
        System.out.println(eventTreeMap);
    }
    public void getNextEvent() {
        /*
        Set<LocalDate> dateSet = events.keySet();
        Collections<Event> values = events.values();
        events.get();
        */
        LocalDate actualDate = LocalDate.now();
        System.out.println();
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(events);
        for (Map.Entry<LocalDate, Event> entry : eventTreeMap.entrySet()) {
            if (entry.getKey().isEqual(actualDate) || entry.getKey().isAfter(actualDate)) {
                System.out.println("The next event is: " + entry.getValue() + " will happen on " + entry.getKey());
                break;
            }
        }
    }


}
