package q4;

public class UseVehicle {
	public static void main(String[] args) {
        Car car = new Car(30);
        MotorCycle motorcycle = new MotorCycle(60);

        System.out.print(" For Car : ");
        car.display();
        System.out.print("For Motorcycle : ");
        motorcycle.display();

    }


}
