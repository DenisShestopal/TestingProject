public class AppRunner {

    public void go() {
        Ccs ccs = new Ccs();
        ccs.setCalories(0);
        ccs.setCaloriesExpectation(1600);
        ccs.setWaterExpectation(2500);
        System.out.println("Daily calories result is: " + ccs.countDailyCaloriesResult());
        if(ccs.countDailyCaloriesResult()>0)
            System.out.println("Please eat " + ccs.countDailyCaloriesResult() + " calories more");
        System.out.println("Daily water result is: " + ccs.countDailyWaterResult());
        if(ccs.countDailyWaterResult()>0)
            System.out.println("Please drink " + ccs.countDailyWaterResult()+ "mls of water more.");
    }
}
