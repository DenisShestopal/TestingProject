public class AppRunner {

    public void go() {
        Ccs ccs = new Ccs();
        ccs.setCalories(0);
        ccs.setCaloriesExpectation(1600);
        ccs.setWaterExpectation(2500);
        System.out.println("Daily calories result is: " + ccs.countDailyCaloriesResult());
        System.out.println("Daily water result is: " + ccs.countDailyWaterResult());
    }
}
