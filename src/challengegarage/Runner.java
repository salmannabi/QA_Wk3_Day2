package challengegarage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car carOne = new Car(1, "Toyota", "Avensis", "2.0 Litres", "Manual", 4, 5000, "40 Litres");
		Car carTwo = new Car(2, "Lexus", "IS300h", "2.5 Litres", "Automatic", 4, 14000, "25 Litres");
		
		Van vanOne = new Van(3, "Ford", "Transit", "2.4 Litres", "Manual", 4, 8000, "1000Kg");
		Van vanTwo = new Van(4, "Vauxall", "Vivaro", "2.4 Litres", "Manual", 4, 8000, "1000Kg");
		
		Bike bikeOne = new Bike(5, "Suziki", "Bandit", "656cc", "Manual", 2, 2000, "2Person");
		Bike bikeTwo = new Bike(6, "Triumph", "Daytona", "599cc", "Manual", 2, 2500, "2Person");	
		
		Vehicle[] multiVehicleArray = {carOne, carTwo, vanOne, vanTwo, bikeOne, bikeTwo};
		Garage.addMultiVehicles(multiVehicleArray);
		
		// Testing removing a vehicle by ID
		Garage.removeVehicleById(2);
		
		// Testing removing a non-existent vehicle by id
		Garage.removeVehicleById(1000);
		System.out.println();
		
		// Testing removing vehicles by type
		Garage.removeVehicleByType("van");
		Garage.removeVehicleByType("Scooter");
		
		// Checking the current status of the vehicle list
		Garage.printAllVehicles();
	}

}
