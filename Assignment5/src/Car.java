import java.util.ArrayList;

public class Car implements Vehicle{
	
	public String name;
	public int topSpeed;
	public int maxPassengers;
	public double weight;
	public Car() {
		super();
	}
	public Car(String name, int topSpeed, int maxPassengers,  double weight) {
		if (name == "") {
			throw new IllegalArgumentException("failure");
		}
		
		if (topSpeed < 0) {
			throw new IllegalArgumentException("failure");
		}
		
		if (maxPassengers < 1) {
			throw new IllegalArgumentException("failure");
		}
		
		if (weight < 0) {
			throw new IllegalArgumentException("failure");
		}
		this.topSpeed = topSpeed;
		this.name = name;
		this.maxPassengers = maxPassengers;
		this.weight = weight;
	}
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getTopSpeed() {
		return topSpeed;
	}
	
	@Override
	public int getMaxPassengers() {
		return maxPassengers;
	}
	
	public double getWeight() {
		return weight;
	}
	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Car("Mazda 3", 190,5,1.3));
		vehicles.add(new Car("Lamborghini Gallardo", 325,2,1.45));
		vehicles.add(new Ship("Titanic", 39,3327, 52310));
		vehicles.add(new Car("Toyota Avensis", 200,5,2.02));
		vehicles.add(new Ship("Nimitz", 58,5680, 100020));
		Vehicle.printVehicles(vehicles);
	}
}
