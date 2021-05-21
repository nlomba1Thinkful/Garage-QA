package com.qa.main.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.main.garage.vehicle.Vehicle;

public class Garage {

	// ***********//
	// ATTRIBUTES //
	// ***********//
	private String garageName;

	// ************//
	// CONSTRUCTOR //
	// ************//
	public Garage() {
		super();
		this.garageName = "Sarah's Garage";

	}

	public Garage(String garageName) {
		this.garageName = garageName;

	}

	// ********//
	// METHODS //
	// ********//

	// Create new list to store vehicles in
	List<Object> sarahsGarage = new ArrayList<Object>();

	public void addVehicle(Object vehicle) {
		// add vehicle by id ??
		sarahsGarage.add(0, vehicle);
	}

	public void deleteVehicle(Vehicle vehicle) {

	}

	public void whosAtSarahsGarage() {

		for (int i = 0; i < sarahsGarage.size(); i++) {
			System.out.println(sarahsGarage.get(i).toString());
		}

	}

	public String getGarageName() {
		return garageName;
	}

}
