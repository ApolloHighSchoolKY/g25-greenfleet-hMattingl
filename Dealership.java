import java.util.ArrayList;

public class Dealership {
    public static void main(String[] args) {
        ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

        // TODO: Add a standard Vehicle and an ElectricCar
        inventory.add(new Vehicle("Ford"));
        inventory.add(new ElectricCar("Toyota"));

        
        System.out.println("--- End of Day Report ---");
        // TODO: Loop through inventory. 
        // TODO: If a vehicle is an ElectricCar, check if it needs a charge.
        for(Vehicle v: inventory)
        {
            //if(!(v instanceof ElectricCar)) //test if drive worked as intended
            v.startEngine();

            v.drive(550);
            System.out.println(v);

            if(v instanceof ElectricCar)
            {
                System.out.println(((ElectricCar)v).getCharge()); //test instanceof/ ElectricCar's drive 
                if(((ElectricCar)v).getCharge()< 50)
                    ((ElectricCar)v).charge();
                System.out.println(((ElectricCar)v).getCharge()); //test charge
            }

            v.stopEngine();

            System.out.println(v);

        }
    }
}
