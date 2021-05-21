package com.qa.main.garage.vehicle;

import com.qa.main.garage.Garage;

public abstract class Vehicle extends Garage implements Mobility {

	// ATTRIBUTES //

	private String vehicleType;
	private String classType;
	private int tireCount;
	private int doorCount;

	// CONSTRUCTOR //

	public Vehicle() {
		super();
		this.vehicleType = "??? - generic";
		this.classType = "??? - generic";
		this.tireCount = 2;
		this.doorCount = 0;

	}

	public Vehicle(String vehicleType, String classType, int tireCount, int doorCount) {
		this.vehicleType = vehicleType;
		this.classType = classType;
		this.tireCount = tireCount;
		this.doorCount = doorCount;
	}

	public abstract void parked();

	public abstract void driving();

	// METHODS //

	// Read only
	public String getVehicleType() {
		return vehicleType;
	}

	public String getClassType() {
		return vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", classType=" + classType + ", tireCount=" + tireCount
				+ ", doorCount=" + doorCount + "]";
	}

}
