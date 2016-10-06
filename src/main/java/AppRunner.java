public class AppRunner {

    public void go() {
        Ccs ccs = new Ccs();

        ccs.setCaloriesExpectation(1600);
        ccs.setWaterExpectation(2500);
        ccs.drinkWater(1200);
        ccs.eatSmth(4000);
        ccs.walk(1100);
        ccs.eatSmth(300);
        System.out.println("Daily calories result is: " + ccs.getCalories());
        if(ccs.getCalories()>ccs.getCaloriesExpectation())
            System.out.println("Please fire "
                    + ccs.getCalories()
                    + " calories more to be fit.");
        System.out.println("Daily water result is: " + ccs.getWaterLevel());
        if(ccs.getWaterLevel()<ccs.getWaterExpectation())
            System.out.println("Please drink "
                    + (ccs.countDailyWaterResult())
                    + "mls of water more.");
    }
}
