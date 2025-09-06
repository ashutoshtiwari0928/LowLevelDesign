package DesignPatterns.BehaviouralPatterns.StrategyDesignPattern;
enum StrategyType{
    FLAT_RATE, WEIGHT_BASED, DISTANCE_BASED, THIRD_PARTY_API
}
class ShipmentCostCalculator{
    public double calculate(Order order, StrategyType strategyType){
        double cost = 0;
        if(strategyType.equals(StrategyType.FLAT_RATE)){
            System.out.println("Calculating flat rate cost.");
            cost = 10;
        }
        else if(strategyType.equals(StrategyType.WEIGHT_BASED)){
            System.out.println("Weight based strategy");
            cost = order.getWeight()*2.5;
        }
        else if(strategyType.equals(StrategyType.DISTANCE_BASED)){
            System.out.println("Distance based strategy");
            if("ZoneA".equals(order.getZone())){
                cost = 5;
            }
            else if("ZoneB".equals(order.getZone())){
                cost = 10;
            }
            else cost = 15;
        }
        else if(strategyType.equals(StrategyType.THIRD_PARTY_API)){
            System.out.println("Calculating throgh third party API");
            cost = 7.5 + (order.getValue()*0.02);
        }
        System.out.println(STR."Total shipping cost = \{cost}");
        return cost;
    }

}
class Order{
    double weight;
    String zone;
    double value;

    public Order(double weight, double value, String zone) {
        this.weight = weight;
        this.value = value;
        this.zone = zone;
    }

    public double getValue() {
        return value;
    }

    public double getWeight() {
        return weight;
    }

    public String getZone() {
        return zone;
    }
}
public class PaymentSystemNaive {
    public static void main(String[] args) {
        ShipmentCostCalculator costCalculator = new ShipmentCostCalculator();
        Order order1 = new Order(10,2,"ZoneA");

        costCalculator.calculate(order1,StrategyType.WEIGHT_BASED);
        costCalculator.calculate(order1,StrategyType.FLAT_RATE);
    }
}
/*
Problems with this approach:
1. Doesnot follow open close principle. If new feature is to be added entire strategy has to be rewritten.
2. Bloating: if new features are strategies are added constantly, the if elsa statements will keep increasing.
This will make code look unreadable and difficult to maintain.
3. Dificult to test in isolation.
4. Risk of code duplication.
5. Less cohesion. (Calculator is doing too much. Doesnot have a single responsibility.)

 */