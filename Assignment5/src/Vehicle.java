import java.util.ArrayList;

public interface Vehicle {

	String getName();

	int getTopSpeed();

	int getMaxPassengers();

//	public static String fastestVehicle(ArrayList<Vehicle> vehicles) {
//
//		int highestSpeed = vehicles.get(0).getTopSpeed();
//		Vehicle fastestVehicle = vehicles.get(0);
//		for (Vehicle vehicle : vehicles) {
//			if (vehicle.getTopSpeed() > highestSpeed) {
//				fastestVehicle = vehicle;
//				highestSpeed = vehicle.getTopSpeed();
//			}
//			
//		}
//		return fastestVehicle.getName();
//	}
	
	public static String fastestVehicle(ArrayList<Vehicle> v){
	    Vehicle fastest = v.get(0);
	    for (int i = 1; i < v.size(); i++) {
	      if(v.get(i).getTopSpeed() > fastest.getTopSpeed()){
	        fastest = v.get(i);
	      }
	    }
	    return fastest.getName();
	  }
	
	public static void printVehicles(ArrayList<Vehicle> list){
	    for (Vehicle v : list) {
	      if(v instanceof Ship){
	        Ship s = (Ship)v;
	        System.out.println("This ship displaces "+ s.getDisplacement() + " tonnes of water");
	      } else if(v instanceof Car){
	        Car s = (Car)v;
	        System.out.println("This car weighs "+ s.getWeight() + " tonnes");
	      }
	    }
	  }

	
//	public static void printVehicles(ArrayList<Vehicle> vehicles) {
//
//		for (Vehicle vehicle : vehicles) {
//			if(vehicle instanceof Car) {
//				System.out.println( "This car weighs "+ ((Car) vehicle).getWeight() + " tonnes");
//			}
//			else {
//				System.out.println( "This ship displaces "+ ((Ship) vehicle).getDisplacement() + " tonnes of water");
//			}
//		} 
//	}
}