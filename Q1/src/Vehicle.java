/*
 * Author: Boateng Henry Kwabena
 * Programme:Biomedical Engineering
 * Index: 7081321
 * Ref.no: 20855987
 * Date: 29th February, 2024
 */

public class Vehicle {  // Creating a parent class Vehicle
    //Setting the fields for the class Vehicle
    private String owner;
    private int wheels;

    //Implementing our accessors and mutators
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
