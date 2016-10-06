import org.junit.Before;
import org.junit.Test;

public class CcsTest {

    private Ccs ccs;

    @Before
    public void setUp() throws Exception {
        ccs = new Ccs();
    }

    @Test
    public void canCreateSystem(){

    }

    @Test
    public void canDrinkWater(){
        ccs.drinkWater(0);
    }

    @Test
    public void canAddExpectation(){
        ccs.setExpectation(0);
    }

    @Test
    public void canAddNegativeExpectation(){
        ccs.setExpectation(-1);
    }

    @Test
    public void canEatSmth(){
        ccs.eatSmth();
    }




}
