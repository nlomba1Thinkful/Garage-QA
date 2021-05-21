package com.qa.main;

import com.qa.main.garage.Garage;
import com.qa.main.garage.vehicle.Vehicle;
import com.qa.main.garage.vehicle.type.Motorcycle;
import com.qa.main.garage.vehicle.type.Semi;

public class Runner {

	// attribute

	// Main method - starting
	public static void main(String[] args) {

		Vehicle x = new Motorcycle("Motorcyle", "M", 2, 0);
		Vehicle y = new Semi("Semi", "C", 12, 4);

		Garage myGarage = new Garage("Sarah's Garage");
		System.out.println(" Welcome to " + myGarage.getGarageName());

		x.parked();
		System.out.println("");

		x.driving();

		System.out.println("");
		y.driving();

		myGarage.addVehicle(x);

		myGarage.whosAtSarahsGarage();

		// myGarage.deleteVehicle(x);

	}

	// Methods
	// accessor, static/non, return type, nameof, parameterlist, scope

	// class
	// attributes(class members)
	// methods (class members)
}
