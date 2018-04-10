package Car;

import Vehicle.Vehicle;

public class Car implements Vehicle {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car can move ");
		
	}

	@Override
	public void carry() {
		// TODO Auto-generated method stub
		System.out.println("Car can carry people");
		
	}

}
