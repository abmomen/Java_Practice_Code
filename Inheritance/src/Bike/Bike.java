package Bike;

import Vehicle.Vehicle;

public class Bike implements Vehicle  {
	public void Speed(){
		System.out.println("Motor bikes are very speedy");
		
	}
	
	public void Cost(){
		System.out.println("This is a low cost ride");
	}

	@Override
	public void move() {
		System.out.println("bike can move");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carry() {
		// TODO Auto-generated method stub
		System.out.println("bike carry people");
		
	}

}
