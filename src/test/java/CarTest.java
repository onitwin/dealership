import Enums.EngineType;
import carcomponents.Car;
import carcomponents.Engine;
import carcomponents.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Engine engine;
    private Tyre tyre;
    private Car car;


    @Before
    public void before(){
        tyre = new Tyre("Goodyear", 10);
        engine = new Engine(EngineType.HYBRID, 20);
        car = new Car("Skoda", 100, engine, tyre);
    }

    @Test
    public void canGetModel(){
        assertEquals("Skoda",car.getModel());
    }

    @Test
    public void canGetPrice(){
        assertEquals(100,car.value());
    }

    @Test
    public void canSetPrice(){
        assertEquals(100,car.value());
        car.setPrice(200);
        assertEquals(200,car.value());
    }

    @Test
    public void canGetEngine(){
        assertEquals(engine,car.getEngine());
    }

    @Test
    public void canGetTyres(){
        assertEquals(tyre,car.getTyre());
    }

    @Test
    public void canGetDamage(){
        assertEquals(0,car.getDamage());
    }

    @Test
    public void canSetDamageAndPrice(){
        assertEquals(0,car.getDamage());
        car.addDamage(20);
        assertEquals(20,car.getDamage());
        assertEquals(80,car.value());

    }

    @Test
    public void canRepairDamage(){
        assertEquals(0,car.getDamage());
        car.addDamage(20);
        assertEquals(20,car.getDamage());
        assertEquals(80,car.value());
        car.repairDamage(10);
        assertEquals(10,car.getDamage());
        assertEquals(90,car.value());

    }

    @Test
    public void canGetCurrentPriceIncDamage(){
        car.addDamage(20);
        assertEquals(80,car.value());
    }

    
}
