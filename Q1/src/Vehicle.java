/*
 * Author: Afla-Mensah Cephson
 * Programme:Biomedical Engineering
 * Index: 7078821
 * Date: 29th February, 2024
 */


public class Vehicle {  // Creating a parent class Vehicle
    //Setting the fields for the class Vehicle
    private String owner;
    private int wheels;
    private String regisNum;

    public String getRegisNum() {
        return regisNum;
    }

    public void setRegisNum(String regisNum) {
        this.regisNum = regisNum;
    }

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
