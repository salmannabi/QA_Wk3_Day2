package challengegarage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private static List<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public static void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	public static void addMultiVehicles(Vehicle[] vehicles) {
		for (int i = 0; i < vehicles.length; i++) {
			vehicleList.add(vehicles[i]);
		}
	}
	
	public static void removeVehicleById(int id) {
		int index = vehicleList.indexOf(id);
		
		if (index >= 0) {
			vehicleList.remove(index);
		} else {
			System.out.println("Vehicle with id " + id + " don't exist");
		}
	}
	
	public static void removeVehicleByType(String type) {
		for (int i = 0; i < vehicleList.size(); i++) {
			if (vehicleList.get(i).getClass().getName().equals(type)) {
				vehicleList.remove(i);
				i--;
			}
		}
	}
	
	public static void removeAll() {
		vehicleList.clear();
	}
}
