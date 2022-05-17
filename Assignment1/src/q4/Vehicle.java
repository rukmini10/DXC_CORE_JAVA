/*Create a class named Vehicle that acts as a superclass for vehicle types. The Vehicle class contains private
variables for the number of wheels and the average number of miles per gallon. It also contains a constructor
with integer arguments for the number of wheels and average miles per gallon, and a toString()method that
returns a String containing these values.
Create two subclasses, Car and MotorCycle, that extend the Vehicle class. Each subclass contains a constructor
that accepts the miles-per-gallon value as an argument and forces the number of wheels to the appropriate
value—2 for a MotorCycle and 4 for a Car. Write a UseVehicle class to instantiate the two Vehicle objects and
print the objects’ values.
*/
package q4;
public class Vehicle {

	  private int no_of_wheels;
	  private int miles_per_gallon;

	  Vehicle (int no_of_wheels, int miles_per_gallon) {
	    this.no_of_wheels=no_of_wheels;
	    this.miles_per_gallon=miles_per_gallon;
	  }
	  

	  @Override
	public String toString() {
		return "no_of_wheels=" + no_of_wheels + ", miles_per_gallon=" + miles_per_gallon ;
	}


	public void display() {
	    System.out.println("Wheels: " + toString() + " Miles Per Gallon: " +toString());
	  }

	}