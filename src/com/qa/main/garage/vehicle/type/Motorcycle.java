package com.qa.main.garage.vehicle.type;

import com.qa.main.garage.vehicle.Vehicle;

// is-a relationship

public class Motorcycle extends Vehicle {

	// CONSTRUCTOR //

	public Motorcycle(String vehicleType, String classType, int tireCount, int doorCount) {
		super(vehicleType, classType, tireCount, doorCount); // object class

	}

	@Override
	public void driving() {
		System.out.print("Motorcyle has left " + this.getGarageName());
	}

	@Override
	public void parked() {
		System.out.print("The Vehicle is parked " + this.getGarageName());

	}

	@Override
	public String toString() {
		return "Motorcycle [getVehicleType()=" + getVehicleType() + ", getClassType()=" + getClassType()
				+ ", toString()=" + super.toString() + ", getGarageName()=" + getGarageName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
