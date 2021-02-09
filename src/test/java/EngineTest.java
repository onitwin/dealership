import Enums.EngineType;
import carcomponents.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void before(){
        engine = new Engine(EngineType.HYBRID, 50);
    }

    @Test
    public void canGetEngineType(){
        assertEquals(EngineType.HYBRID, engine.getEngineType());
    }

    @Test
    public void canGetEngineSize(){
        assertEquals(50,engine.getEngineSize());
    }


}
