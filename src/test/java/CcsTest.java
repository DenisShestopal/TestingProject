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
        ccs.setCaloriesExpectation(0);
    }

    @Test
    public void canAddNegativeExpectation(){
        ccs.setWaterExpectation(-1);
    }

    @Test
    public void canWalk(){
        ccs.walk(0);
    }

    @Test
    public void canSeeCalories(){
        ccs.seeCalories();
    }

    @Test
    public void canWalkNegative(){
        ccs.walk(-1);
    }

    @Test
    public void canEatFood(){
        ccs.eatSmth(100);
    }

    @Test
    public void canSeeWaterLevel(){
        ccs.getWaterLevel();
    }

    @Test
    public void seeDailyWaterResult(){
        ccs.countDailyWaterResult();
    }

    @Test
    public void seeDailyCaloriesResult(){
        ccs.countDailyCaloriesResult();
    }

    @Test
    public void isWaterDailyResultNegative(){
        ccs.setWaterExpectation(1000);
        ccs.drinkWater(500);
        ccs.drinkWater(300);
        assert (ccs.countDailyWaterResult() > 0);
    }





}
