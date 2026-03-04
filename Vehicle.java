public class Vehicle {
    private String model;
    private int mileage;
    private boolean engineRunning;

    /**
     * Constructor: All vehicles start with 0 miles and engine off.
     */
    public Vehicle(String model) {
        // TODO: Initialize variables
        this.model = model;
        mileage = 0;
        engineRunning = false;
    }

    public void startEngine() {
        // TODO: Set engineRunning to true
        engineRunning = true;
    }

    public void stopEngine()
    {
        engineRunning = false;
    }

    /**
     * Increases mileage if the engine is running.
     */
    public void drive(int distance) {
        // TODO: Logic to add distance only if engineRunning is true
        if(engineRunning)
            mileage += distance;
    }

    public String toString() {
        // TODO: Return model, mileage, and status
        if(engineRunning)
            return "This " + model + " has driven "+ mileage + " miles and the engine is running ";

        return "This " + model + " has driven "+ mileage + " miles and the engine is not running ";
    }

    public boolean getEngine()
    {
        return engineRunning;
    }
}
