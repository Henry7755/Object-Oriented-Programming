/*
 * Author: Afla-Mensah Cephson
 * Programme:Biomedical Engineering
 * Index: 7078821
 * Date: 29th February, 2024
 */


//Testing the created classes
public class VehicleTest {
    public static void main(String[] args) {
        Car car1 = new Car();           // Creating a Car object
        Lorry lorry1 = new Lorry();      // Creating a Lorry Object
        Bicycle bicycle1 = new Bicycle();  // Creating a bicycle object

        // Printing the default values of the vehicles
        System.out.println("Lorries have "+lorry1.getWheels()+" wheels");
        System.out.println("Cars have "+car1.getWheels()+ " wheels");
        System.out.println("Bicylces have "+bicycle1.getWheels()+" wheels");


    }


}
