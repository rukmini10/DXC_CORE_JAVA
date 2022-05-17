/*Q3
 * Create a class named HotelRoom, having roomNumber as integer and nightlyRentCharge as double.
Include getter methods for required field and a constructor that requires an integer argument representing the
room number.
The constructor sets the room rate based on the room number; rooms numbered 299 and below are Rs 6900 per
night, and others are Rs 8900 per night.
Create an extended class named Suite whose constructor requires a room number and adds a Rs 400 surcharge
to the regular hotel room rate, which again is based on the room number.
Write an application named HotelRoomService that creates an object of each class, and demonstrate that all the
methods work correctly
 * 
 * 
 */
class HotelRoom { 
    final double rate1 = 6900;
    final double rate2 = 8900;
    final int regularrate = 400;


    private int roomNumber;
    private double nightlyRentCharge;


    HotelRoom (int Room ) {
      roomNumber=Room;
        if (roomNumber <= 299)//regularrate
          nightlyRentCharge = rate1;
        else
        	nightlyRentCharge = rate2;
    } 
    public int getRoom(){ 
    	return roomNumber; 
    	}
    public double getRentalRate(){ 
    	return nightlyRentCharge; 
    	}
    public void setRoom(int Room){ 
    	roomNumber=Room;
    }
    public void setRentalRate(double nightlyRentCharge){
    	
    }
} 
