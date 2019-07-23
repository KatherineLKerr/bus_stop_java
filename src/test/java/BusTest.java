import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private BusStop busstop;
    private Person person;

    @Before
    public void setUp() {
        bus = new Bus("the beach");
        busstop = new BusStop("beach");
        person = new Person();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
        busstop.addPerson();
    }

    @Test
    public void busHasNumOfPassengers() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengerIfCapacityLessThan10() {
        bus.addPassenger(busstop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cantAddPassengerIfCapacityMoreThan10() {
        bus.addPassenger(busstop);
        bus.addPassenger(busstop);
        bus.addPassenger(busstop);
        bus.addPassenger(busstop);
        bus.addPassenger(busstop);
        bus.addPassenger(busstop);
        bus.addPassenger(busstop);
        bus.addPassenger(busstop);
        bus.addPassenger(busstop);
        bus.addPassenger(busstop);
        bus.addPassenger(busstop);
        bus.addPassenger(busstop);
        assertEquals(10, bus.passengerCount());
    }

    @Test
    public void busCanRemovePassenger() {
        bus.addPassenger(busstop);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }
}
