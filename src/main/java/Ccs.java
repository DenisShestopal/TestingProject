import java.io.IOException;

public class Ccs {

    private int expectation;


    public void drinkWater(int mls) {
    }

    public boolean setExpectation(int mls) {
        if(mls<0)
            mls=0;
        expectation = mls;
        return true;
    }


    public void eatSmth() {

    }
}
