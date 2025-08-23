package DesignPatterns.BehaviouralPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface FitnessObserver{
    void update(FitnessData data);
}

interface FitnessDataSubject{
    void registerObserver(FitnessObserver observer);
    void removeObserver(FitnessObserver observer);
    void notifyObserver();
}

class FitnessData implements FitnessDataSubject{
    private int steps;
    private int activeMinutes;
    private int calories;
    private final List<FitnessObserver> observers = new ArrayList<>();


    @Override
    public void registerObserver(FitnessObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(FitnessObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(FitnessObserver o: observers){
            o.update(this);
        }
    }

    public void newFitnessDataPushed(int steps,int activeMinutes,int calories){
        this.steps = steps;
        this.activeMinutes = activeMinutes;
        this.calories = calories;
        System.out.println("\nFitnessData: New data received – Steps: " + steps +
                ", Active Minutes: " + activeMinutes + ", Calories: " + calories);
        notifyObserver();
    }
    public void dailyReset(){
        this.steps = 0;
        this.calories = 0;
        this.activeMinutes = 0;
        System.out.println("\nFitnessData: Daily reset performed.");
        notifyObserver();
    }
    public int getSteps() { return steps; }
    public int getActiveMinutes() { return activeMinutes; }
    public int getCalories() { return calories; }
}

class LiveActivityDisplay implements FitnessObserver{

    @Override
    public void update(FitnessData data) {
        System.out.println("Live Display → Steps: " + data.getSteps() +
                " | Active Minutes: " + data.getActiveMinutes() +
                " | Calories: " + data.getCalories());
    }
}
class ProgressLogger implements FitnessObserver {
    @Override
    public void update(FitnessData data) {
        System.out.println("Logger → Saving to DB: Steps=" + data.getSteps() +
                ", ActiveMinutes=" + data.getActiveMinutes() +
                ", Calories=" + data.getCalories());
        // Simulated DB/file write...
    }
}
class GoalNotifier implements FitnessObserver {
    private final int stepGoal = 10000;
    private boolean goalReached = false;

    @Override
    public void update(FitnessData data) {
        if (data.getSteps() >= stepGoal && !goalReached) {
            System.out.println("Notifier → 🎉 Goal Reached! You've hit " + stepGoal + " steps!");
            goalReached = true;
        }
        else{
            System.out.println("Notifier -> steps:"+data.getSteps()
                    +" active minutes: "+data.getActiveMinutes());
        }
    }

    public void reset() {
        goalReached = false;
    }
}
public class FitnessTracker {
    public static void main(String[] args) {
        FitnessData fitnessData = new FitnessData();
        LiveActivityDisplay display = new LiveActivityDisplay();
        ProgressLogger logger = new ProgressLogger();
        GoalNotifier notifier = new GoalNotifier();

        fitnessData.registerObserver(display);
        fitnessData.registerObserver(logger);
        fitnessData.registerObserver(notifier);

        fitnessData.newFitnessDataPushed(500, 5, 20);
        fitnessData.newFitnessDataPushed(9800, 85, 350);
        fitnessData.newFitnessDataPushed(10100, 90, 380);

        notifier.reset();
        fitnessData.dailyReset();

        fitnessData.removeObserver(notifier);

        fitnessData.newFitnessDataPushed(500, 5, 20);
        fitnessData.newFitnessDataPushed(9800, 85, 350);
        fitnessData.newFitnessDataPushed(10100, 90, 380);

        notifier.reset();
        fitnessData.dailyReset();
    }
}
