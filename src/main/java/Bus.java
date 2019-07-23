import java.util.ArrayList;

public class Bus {
    private ArrayList<Person> passengers;
    private String destination;
    private int capacity;
    private BusStop busstop;
    private Person person;

    public Bus(String destination) {
        this.destination = destination;
        this.capacity = 10;
        this.passengers = new ArrayList<Person>();
        busstop.addPerson();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(BusStop busstop) {
        Person person = busstop.removePerson();
        if (this.passengerCount() < this.capacity) {
            this.passengers.add(person);
        }
    }

//    public void eatFishFromRiver(River river) {
//        Salmon salmon = river.removeFish();
//        this.belly.add(salmon);
//    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
