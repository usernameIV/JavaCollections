package MapCollection.SortMap;

import java.time.LocalDate;
import java.time.Month;

public class EventsScheduleMain {

    public static void main(String[] args) {

        EventsSchedule evt = new EventsSchedule();

        evt.addEvent(LocalDate.of(2022, Month.JULY, 15), "Event 1", "Attraction 1");
        evt.addEvent(LocalDate.of(2022, 7, 9), "Event 2", "Attraction 2");
        evt.addEvent(LocalDate.of(2024, Month.JULY, 21), "Event 3", "Attraction 3");
        evt.addEvent(LocalDate.of(2024, Month.JULY, 28), "Event 4", "Attraction 3");

        evt.displaySchedule();

        evt.getNextEvent();


    }

}
