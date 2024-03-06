/*
 * Author: Boateng Henry Kwabena
 * Programme:Biomedical Engineering
 * Index: 7081321
 * Ref.no: 20855987
 * Date: 29th February, 2024
 */


//Creating a Test main Class called VehicleTest
public class VehicleTest {
    public static void main(String[] args) {
        Car car1 = new Car();           // Instantiating the object Class Car
        Lorry lorry1 = new Lorry();      // Instantiating the object Class Lorry
        Bicycle bicycle1 = new Bicycle();  // Instantiating the object Class Bicycle

        // Outputting the default wheels of each vehicle by calling the field name wheels from the Parent class Vehicle
        System.out.println("Cars have "+car1.wheels+" wheels");
        System.out.println("Lorries have "+lorry1.wheels+" wheels");
        System.out.println("Bicylces have "+bicycle1.wheels+" wheels");


    }


}
