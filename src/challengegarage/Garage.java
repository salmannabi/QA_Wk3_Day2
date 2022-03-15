package challengegarage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private static List<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public static void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
		System.out.println("Added " + vehicle.toString());
	}
	
	public static void addMultiVehicles(Vehicle[] vehicles) {
		for (int i = 0; i < vehicles.length; i++) {
			vehicleList.add(vehicles[i]);
			System.out.println("Added " + vehicles[i].toString());
		}
		System.out.println();
	}
	
	public static void removeVehicleById(int id) {
		int index = -1;
		
		for (int i = 0; i < vehicleList.size(); i++) {
			if (vehicleList.get(i).getId() == id) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			vehicleList.remove(index);
			System.out.println("Removed vehicle with id: '2'\n");
		} else {
			System.out.println("Vehicle with id " + id + " don't exist");
		}
	}
	
	public static void removeVehicleByType(String type) {
		int count = 0;
		for (int i = 0; i < vehicleList.size(); i++) {
			if (vehicleList.get(i).getClass().getSimpleName().toLowerCase().equals(type)) {
				vehicleList.remove(i);
				count++;
				i--;
			}
		}
		
		System.out.println("Removed " + count + " vehicles of type: " + type + "\n");
	}
	
	public static void removeAll() {
		vehicleList.clear();
	}
	
	public static void printAllVehicles() {
		for (int i = 0; i < vehicleList.size(); i++) {
			System.out.println(vehicleList.get(i).toString());
		}
	}
}
