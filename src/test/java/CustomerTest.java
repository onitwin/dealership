import Enums.EngineType;
import carcomponents.Car;
import carcomponents.Engine;
import carcomponents.Tyre;
import org.junit.Before;
import org.junit.Test;
import users.Customer;
import users.Dealership;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Car car;
    Car car2;
    Car car3;
    Customer customer;
    Dealership dealer;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        customer=new Customer(200);
        engine=new Engine(EngineType.DIESEL,40);
        tyre=new Tyre("Goodyear",30);
        car=new Car("Lada",50,engine,tyre);
        car2=new Car("Skoda",50,engine,tyre);
        car3=new Car("Porche",50,engine,tyre);
    }

    @Test
    public void canGetFunds(){
        assertEquals(200,customer.getFunds());
    }

    @Test
    public void canGetGarage(){
        assertEquals(0,customer.getGarageSize());
    }

    @Test
    public void canAddToGarage(){
        assertEquals(0,customer.getGarageSize());
        customer.addCar(car);
        assertEquals(1,customer.getGarageSize());
    }

    @Test
    public void canRemoveCarsFromStock(){
        customer.addCar(car);
        customer.addCar(car2);
        customer.addCar(car3);
        assertEquals(3,customer.getGarageSize());
        customer.removeCarFromGarage(car2);
        assertEquals(2,customer.getGarageSize());
        customer.getGarage();
    }


}
