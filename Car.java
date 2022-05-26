package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("Drivr the Car");
	}

	public void applyBrake() {
		System.out.println("Apply Brake");
	}
	public static void main(String[] args) {

		Car myCar=new Car();
		myCar.applyBrake();
		myCar.driveCar();

	}

}
