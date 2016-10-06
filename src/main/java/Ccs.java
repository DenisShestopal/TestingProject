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

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public int getCaloriesExpectation() {
        return caloriesExpectation;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setCaloriesExpectation(int calories) {
        calories = getValue(calories);
        this.caloriesExpectation = calories;
    }

    public boolean setWaterExpectation(int mls) {
        mls = getValue(mls);
        waterExpectation = mls;
        return true;
    }

    private int getValue(int value) {
        if(value <0)
            value =0;
        return value;
    }


    public void drinkWater(int mls) {
        mls = getValue(mls);
        this.waterLevel += mls;
    }

    public void eatSmth(int calories) {
        calories = getValue(calories);
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

    public int countDailyCaloriesResult() {
        return this.caloriesExpectation - this.calories;
    }
}
