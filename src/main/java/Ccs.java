import java.io.IOException;

public class Ccs {

    private int expectation;
    private int callories;

    public int getExpectation() {
        return expectation;
    }

    public int getCallories() {
        return callories;
    }

    public void setCallories(int callories) {
        this.callories = callories;
    }

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

    public void walk(int meters) {
        callories = callories - (meters * 2);

    }

    public void seeCallories() {
        System.out.println(this.callories);
    }
}
