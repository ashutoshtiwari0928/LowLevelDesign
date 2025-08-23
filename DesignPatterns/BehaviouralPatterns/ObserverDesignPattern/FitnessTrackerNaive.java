package DesignPatterns.BehaviouralPatterns.ObserverDesignPattern;
class LiveActivityDisplayNaive{
    public void showStats(int steps, int activeMinutes, int calories) {
        System.out.println("NAIVE Live Display: Steps: " + steps +
                " | Active Mins: " + activeMinutes +
                " | Calories: " + calories);
    }
}
class ProgressLoggerNaive{
    public void logDataPoint(int steps,int activeMinutes,int calories){
        System.out.println("NAIVE Logger: Saving data - Steps: " + steps +
                ", Active Mins: " + activeMinutes +
                ", Calories: " + calories);
    }
}
class NotificationServiceNaive{
    private int stepGoal = 10000;
    private boolean dailyStepGoalNotified = false;
    public void checkAndNotify(int currentSteps) {
        if (currentSteps >= stepGoal && !dailyStepGoalNotified) {
            System.out.println("NAIVE Notifier: ALERT! You've reached your "
                    + stepGoal + " step goal!");
            dailyStepGoalNotified = true;
        }
        // ... other notification logic, e.g., inactivity alerts ...
    }
    public void resetDailyNotification(){
        dailyStepGoalNotified=false;
    }
}
class FitnessDataNaive{
    private int steps;
    private int activeMinutes;
    private int calories;

    // Direct, hardcoded references to all dependent modules
    private LiveActivityDisplayNaive liveDisplay = new LiveActivityDisplayNaive();
    private ProgressLoggerNaive progressLogger = new ProgressLoggerNaive();
    private NotificationServiceNaive notificationService = new NotificationServiceNaive();
    public FitnessDataNaive(LiveActivityDisplayNaive ld, ProgressLoggerNaive pl, NotificationServiceNaive ns) {
        this.liveDisplay = ld;
        this.progressLogger = pl;
        this.notificationService = ns;
    }

    public void newFitnessDataPushed(int newSteps, int newActiveMinutes, int newCalories) {
        this.steps = newSteps;
        this.activeMinutes = newActiveMinutes;
        this.calories = newCalories;

        System.out.println("\nFitnessDataNaive: New data received - Steps: " + steps +
                ", ActiveMins: " + activeMinutes + ", Calories: " + calories);

        // Manually notify each dependent module
        liveDisplay.showStats(steps, activeMinutes, calories);
        progressLogger.logDataPoint(steps, activeMinutes, calories);
        notificationService.checkAndNotify(steps);
    }
    public void dailyReset() {
        // Reset logic...
        if (notificationService != null) {
            notificationService.resetDailyNotification();
        }
        System.out.println("FitnessDataNaive: Daily data reset.");
        newFitnessDataPushed(0, 0, 0); // Notify with reset state
    }
}

public class FitnessTrackerNaive {
    public static void main(String[] args) {
        LiveActivityDisplayNaive dislay = new LiveActivityDisplayNaive();
        ProgressLoggerNaive progressLogger = new ProgressLoggerNaive();
        NotificationServiceNaive notificationService = new NotificationServiceNaive();
        FitnessDataNaive fitnessData = new FitnessDataNaive(dislay,progressLogger,notificationService);
        fitnessData.newFitnessDataPushed(500, 5, 20);
        fitnessData.newFitnessDataPushed(9800, 85, 350);
        fitnessData.newFitnessDataPushed(10100, 90, 380); // Goal should be hit
        fitnessData.dailyReset();
    }
}
