public class ElectricCar extends Vehicle {
    private double batteryPercent;

    public ElectricCar(String model) {
        // TODO: Use super() to set the model
        // TODO: Set batteryPercent to 100.0
        super(model);
        batteryPercent = 100.0;
    }

    /**
     * Override drive: Decreases battery by 1% for every 5 miles driven.
     */
    @Override
    public void drive(int distance) {
        // TODO: Call super.drive() 
        // TODO: Calculate battery loss
        super.drive(distance);

        if(super.getEngine())
            batteryPercent -= (distance/5);


    }

    public void charge() {
        batteryPercent = 100.0;
    }

    public double getCharge()
    {
        return batteryPercent;
    }
}
