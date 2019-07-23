import java.util.ArrayList;

    public class BusStop {
        private ArrayList<Person> queue;
        private String name;

        public BusStop(String name) {
            this.name = name;
            this.queue = new ArrayList<Person>();
        }

    public void addPerson() {
        Person person = new Person();
        this.queue.add(person);
        }

    public int queueLength() {
        return this.queue.size();
    }

    public void removePerson() {
        this.queue.remove(0);
    }
}


//    public void addPassenger() {
//        Person person = new Person();
//        if (this.passengerCount() < this.capacity) {
//            this.passengers.add(person);
//        }
//    }
//
//    public void removePassenger() {
//        this.passengers.remove(0);
//    }