package com.qa.main.garage.vehicle.type;

import com.qa.main.garage.vehicle.Vehicle;

public class Semi extends Vehicle {

	// ************//
	// CONSTRUCTOR //
	// ************//
	public Semi(String vehicleType, String classType, int tireCount, int doorCount) {
		super(vehicleType, classType, tireCount, doorCount); // object class

	}

	@Override
	public void parked() {
		System.out.print("The Semi is parked " + this.getGarageName());

	}

	@Override
	public void driving() {
		System.out.print("The Semi is driving " + this.getGarageName());

	}

	@Override
	public String toString() {
		return "Semi [getVehicleType()=" + getVehicleType() + ", getClassType()=" + getClassType() + ", toString()="
				+ super.toString() + ", getGarageName()=" + getGarageName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
