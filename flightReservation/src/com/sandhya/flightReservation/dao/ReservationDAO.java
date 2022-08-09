package com.sandhya.flightReservation.dao;

import com.sandhya.flightReservation.model.Reservation;

public interface ReservationDAO {
	
	Reservation bokFlight(Reservation reservation);
	
	Reservation checkIn(long reservationId, int noOfBags);

}
