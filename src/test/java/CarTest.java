import Enums.EngineType;
import carcomponents.Car;
import carcomponents.Engine;
import carcomponents.Tyre;
import org.junit.Before;

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

    
}
