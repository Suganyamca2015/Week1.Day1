package week1.day1;

public class TwoWheeler {

	short maximumSpeed = 210;
	byte seatingCapacity = 4;
	int price = 800000;
	long ownerMobile = 8610034336L;
	float mileage = 22.2f;
	double distanceCovered = 18765.356;
	char fuelType = 'P';
	boolean isPetrolEngine = true;

	public void driveCar() {

		int regNo = 2617;		
		System.out.println("\n Drive the Car");		
		System.out.println("RegistrationNumber:" + regNo);
		System.out.println("ContactNumber:" + ownerMobile);
		System.out.println("FuelType:" + fuelType);
		fuelType = 'D';					
	}

	public void applyBrake() {
		System.out.println("\n Apply Brake");
		System.out.println("Price = " + price);
		System.out.println("FuelType:" + fuelType);	
		System.out.println("IsPetrolEngine:" + isPetrolEngine);		
	}
	
	public void acclerate() {
		System.out.println("SeatingCapacity:" + seatingCapacity );
		System.out.println("Mileage:" + mileage);
		System.out.println("DistanceCovered:" + distanceCovered);
	}
	public static void main(String[] args) {
		System.out.println("Inside Main Method \n");
		TwoWheeler myCar = new TwoWheeler();
		myCar.driveCar();
		myCar.applyBrake();		
		myCar.acclerate();
	}
}
