/*
 * Author: Boateng Henry Kwabena
 * Programme:Biomedical Engineering
 * Index: 7081321
 * Ref.no: 20855987
 * Date: 29th February, 2024
 */
public class Lorry extends Vehicle{ // Lorry inheriting from the parent class Vehicle
    public String registrationNumber;

    public Lorry() {
        this.wheels= 6;
    } // setting default values to the wheels using constructor

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
