package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    private List<Event> myEvents = new LinkedList<Event>();

    public Agenda (){
        this.myEvents = myEvents;
    }

    public List<Event> getMyEvents(){
        return myEvents;
    }

    public void addEvent(Event e) {
        // TODO : implémenter cette méthode
        myEvents.add(e);
        //throw new UnsupportedOperationException("Pas encore implémenté");
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        // TODO : implémenter cette méthode
        //throw new UnsupportedOperationException("Pas encore implémenté");
        List<Event> inDay = new LinkedList<Event>();
        for (Event e : myEvents){
            if (e.isInDay(day)){
                inDay.add(e);
            }
        }
        return inDay;
    }
}
