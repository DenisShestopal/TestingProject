public class Ccs {

    private int waterExpectation;
    private int calories;
    private int waterLevel;
    private int caloriesExpectation;

    public int getWaterExpectation() {
        return waterExpectation;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setCaloriesExpectation(int calories) {
        if(calories<0)
            calories=0;
        this.caloriesExpectation = calories;
    }

    public boolean setWaterExpectation(int mls) {
        if(mls<0)
            mls=0;
        waterExpectation = mls;
        return true;
    }


    public void drinkWater(int mls) {
        if(mls<0)
            mls=0;
        this.waterLevel += mls;
    }

    public void eatSmth(int calories) {
        if(calories<0)
            calories=0;
        this.calories += calories;
    }

    public void walk(int meters) {
        if(meters>=0)
        this.calories -= (meters * 2);

    }

    public void seeCalories() {
        System.out.println(this.calories);
    }

    public double getWaterLevel() {
        return this.waterLevel;
    }


    public int countDailyWaterResult() {
        return this.waterExpectation - this.waterLevel;
    }
}
