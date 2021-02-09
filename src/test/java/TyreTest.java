import carcomponents.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {
    Tyre tyre;

    @Before
    public void before(){
        tyre=new Tyre("Goodyear",20);
    }

    @Test
    public void canGetBrand(){
        assertEquals("Goodyear",tyre.getBrand());
    }

    @Test
    public void canGetCost(){
        assertEquals(20,tyre.getCost());
    }

    @Test
    public void canGetValue(){
        assertEquals(20,tyre.value());
    }
}
