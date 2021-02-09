import Enums.EngineType;
import carcomponents.Car;
import carcomponents.Engine;
import carcomponents.Tyre;
import org.junit.Before;
import org.junit.Test;
import users.Dealership;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Tyre tyre;
    Engine engine;
    Car car;
    Dealership dealer;
    Car car2;

    @Before
    public void before(){
        engine=new Engine(EngineType.DIESEL,40);
        tyre=new Tyre("Goodyear",30);
        car=new Car("Lada",50,engine,tyre);
        car2=new Car("Lada",50,engine,tyre);
        dealer=new Dealership();
    }

    @Test
    public void canGetFunds(){
        assertEquals(0,dealer.getFunds());
    }

    @Test
    public void canGetGarageSize(){
        assertEquals(0,dealer.getGarageSize());
    }

    @Test
    public void canAddCarsToStock(){
        assertEquals(0,dealer.getGarageSize());
        dealer.addCarToStock(car);
        assertEquals(1,dealer.getGarageSize());
    }

    @Test
    public void canRemoveCarsFromStock(){
        dealer.addCarToStock(car);
        assertEquals(1,dealer.getGarageSize());
        dealer.removeCarFromStock(car);
        assertEquals(0,dealer.getGarageSize());
    }
}
