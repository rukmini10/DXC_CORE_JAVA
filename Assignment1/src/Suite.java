class Suite extends HotelRoom { 
    final double surcharge = 400.00;
    Suite (int roomNumber){ 
        super(roomNumber);
        setRentalRate(getRentalRate() + surcharge);
    } 
} 