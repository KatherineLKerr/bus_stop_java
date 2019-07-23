import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busstop;

    @Before
    public void setUp() {
        busstop = new BusStop("the beach");
    }

    @Test
    public void canAddPerson() {
        busstop.addPerson();
        assertEquals(1, busstop.queueLength());
    }

    @Test
    public void canRemovePerson() {
        busstop.addPerson();
        busstop.removePerson();
        assertEquals(0, busstop.queueLength());
    }


}
