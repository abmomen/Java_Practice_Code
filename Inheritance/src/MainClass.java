import Bike.Bike;
import Car.TeslaCars;


public class MainClass {
	public static void main(String[] args){
		TeslaCars car=new TeslaCars();
		car.move();
		car.carry();
		car.elegence();
		car.Speed();
		car.Comfort();
		System.out.println();
		
		Bike bike=new Bike();
		bike.move();
		bike.carry();
		bike.Cost();
		bike.Speed();

		
	}

}
