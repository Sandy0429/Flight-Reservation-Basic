package com.sandhya.flightReservation.tests;

import com.sandhya.flightReservation.dao.ReservationDAO;
import com.sandhya.flightReservation.dao.ReservationDAOImpl;
import com.sandhya.flightReservation.model.Passenger;
import com.sandhya.flightReservation.model.Reservation;

public class Test {

	public static void main(String[] args) {

		ReservationDAO dao = new ReservationDAOImpl();
		Reservation reservation = new Reservation();
		Passenger passenger = new Passenger();
		passenger.setId(123l);
		passenger.setFirstName("Sandhya");
		passenger.setLastName("Choudhari");
		passenger.setEmail("sandhya@gmail.com");				
		reservation.setPassenger(passenger);
		reservation.setFlightId(1l);
		
		Reservation savedReservation = dao.bokFlight(reservation);
		System.out.println(savedReservation);
		
		Reservation checkedInReservation = dao.checkIn(savedReservation.getId(), 2);
		System.out.println(checkedInReservation);
	}

}
