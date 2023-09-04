package com.jspiders.jams.service;

import java.util.List;
import java.util.Optional;

import com.jspiders.jams.dto.FlightInfoDTO;

public interface FlightInfoService {

	Optional<FlightInfoDTO> addFlightInformation(FlightInfoDTO flightInfo, int airlineId);
	
	int removeFlightInfo(String flightNumber);
	
	FlightInfoDTO modifyFlightInformation(FlightInfoDTO flightInfoDto);
	
	List<FlightInfoDTO> getAllFlightInfo();
	
	List<FlightInfoDTO> getFlightInfoBasedOnAirlineName(String airlineName);
}
