package com.sandhya.flightReservation.model;

public class Flight extends AbstractModel {
	
	private String flightNumber;
	private String operatingAirLines;
	private String departureCity;
	private String arrivalCity;
	private String dateAndTimeOfDeparture;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirLines() {
		return operatingAirLines;
	}

	public void setOperatingAirLines(String operatingAirLines) {
		this.operatingAirLines = operatingAirLines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public String getDateAndTimeOfDeparture() {
		return dateAndTimeOfDeparture;
	}

	public void setDateAndTimeOfDeparture(String dateAndTimeOfDeparture) {
		this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operatingAirLines=" + operatingAirLines + ", departureCity="
				+ departureCity + ", arrivalCity=" + arrivalCity + ", dateAndTimeOfDeparture=" + dateAndTimeOfDeparture
				+ "]";
	}

}
