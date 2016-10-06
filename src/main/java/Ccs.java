public class Ccs {

    private int expectation;
    private int calories;

    public int getExpectation() {
        return expectation;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
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
        calories = calories - (meters * 2);

    }

    public void seeCalories() {
        System.out.println(this.calories);
    }
}
