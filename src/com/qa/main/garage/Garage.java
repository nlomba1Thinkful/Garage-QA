package com.qa.main.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.main.garage.vehicle.Vehicle;

public class Garage {

	// ATTRIBUTES //

	private String garageName;

	// CONSTRUCTOR //

	public Garage() {
		super();
		this.garageName = "Nick's Garage";

	}

	public Garage(String garageName) {
		this.garageName = garageName;

	}

	// METHODS //

	// Create new list to store vehicles in
	List<Object> vehicleGarage = new ArrayList<Object>();

	public void addVehicle(Object vehicle) {
		// add vehicle by id
		vehicleGarage.add(0, vehicle);
	}

	public void deleteVehicle(Vehicle vehicle) {

	}

	public void whosAtSarahsGarage() {

		for (int i = 0; i < vehicleGarage.size(); i++) {
			System.out.println(vehicleGarage.get(i).toString());
		}

	}

	public String getGarageName() {
		return garageName;
	}

}
