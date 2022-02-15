import cars.Car;
import cars.Electric;
import cars.Fosil;
import cars.Hybrid;
import org.junit.Before;
import org.junit.Test;
import places.Dealership;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car fosil;
    Car hybrid;
    Car electric;
    ArrayList<Car> cars;
    Dealership dealer;

    @Before
    public void before(){
        fosil = new Fosil(1);
        hybrid = new Hybrid(2);
        electric = new Electric(3);
        cars = new ArrayList<Car>();
        cars.add(fosil);
        cars.add(hybrid);
        cars.add(electric);
        dealer = new Dealership(cars);
    }

    @Test
    public void hasBobby(){
        assertEquals(1, dealer.getCars().get(0).getBobby());
    }
}
