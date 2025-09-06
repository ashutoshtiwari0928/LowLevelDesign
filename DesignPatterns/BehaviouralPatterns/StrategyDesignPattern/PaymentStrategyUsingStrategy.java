package DesignPatterns.BehaviouralPatterns.StrategyDesignPattern;

interface ShippingStrategy{
    double calcualteCost(Order order);
}

class FlatShipping implements ShippingStrategy{
    private double rate;

    public FlatShipping(double rate){
        this.rate = rate;
    }
    @Override
    public double calcualteCost(Order order) {
        System.out.println("Calculating flat shipping rate strategy. ");
        return rate;
    }
}

class WeightBasedShipping implements  ShippingStrategy{
    public final double rateperkg;

    public WeightBasedShipping(double rateperkg) {
        this.rateperkg = rateperkg;
    }
    @Override
    public double calcualteCost(Order order) {
        System.out.println("Calcualting weight based shipping strategy: ");
        return order.getWeight()*rateperkg;
    }
}

class DistangeBasedShipping implements ShippingStrategy{
    public final double rateperkm;

    public DistangeBasedShipping(double rateperkm) {
        this.rateperkm = rateperkm;
    }

    @Override
    public double calcualteCost(Order order) {
        System.out.println("Calculating using distance based shipping strategy.");
        if(order.getZone().equals("ZoneA")){
            return rateperkm*7;
        }
        else if(order.getZone().equals("ZoneB")){
            return rateperkm*5;
        }
        else{
            return rateperkm*6;
        }
    }
}
class ShippingService{
    private ShippingStrategy shippingStrategy;

    public ShippingService(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingCost(Order order){
        if(shippingStrategy==null){
            System.out.println("First select the shipping strategy.");
        }
        double cost = shippingStrategy.calcualteCost(order);
        System.out.println(STR."Final Shipping cost is \{cost}");
        return cost;
    }
}
public class PaymentStrategyUsingStrategy {
    public static void main(String[] args) {
        Order order = new Order(10,5,"ZoneA");
        ShippingService shippingService = new ShippingService(new FlatShipping(10));

        shippingService.calculateShippingCost(order);
        shippingService.setShippingStrategy(new WeightBasedShipping(2));
        shippingService.calculateShippingCost(order);
        shippingService.setShippingStrategy(new DistangeBasedShipping(12));
        shippingService.calculateShippingCost(order);
    }
}
