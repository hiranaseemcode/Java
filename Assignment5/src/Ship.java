import java.util.ArrayList;
public class Ship implements Vehicle{

	public String name;
	public int topSpeed;
	public int maxPassengers;
	public double amountOfWater;
	public Ship() {
	super();
	}
	
	public Ship(String name,int maxPassengers,  int topSpeed, double amountOfWater) {
		if (name == "" || name == " ") {
			throw new IllegalArgumentException("failure");
		}
		
		if (topSpeed < 1) {
			throw new IllegalArgumentException("failure");
		}
		
		if (maxPassengers < 1 || maxPassengers >= 10000) {
			throw new IllegalArgumentException("failure");
		}
		
		if (amountOfWater < 1) {
			throw new IllegalArgumentException("failure");
		}
		this.topSpeed = topSpeed;
		this.name = name;
		this.maxPassengers = maxPassengers;
		this.amountOfWater = amountOfWater;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getTopSpeed() {
		// TODO Auto-generated method stub
		return topSpeed;
	}

	@Override
	public int getMaxPassengers() {
		// TODO Auto-generated method stub
		return maxPassengers;
	}
	
	public double getDisplacement() {
		return amountOfWater;
	}

	public static void main(String[] args) {
		/*
		 * Vehicle[] vehicles = new Vehicle[5]; Ship ship = new Ship("Titanic", 3327,
		 * 39, 52310); vehicles[0] = ship; Car toyotaAvensis = new Car("Toyota Avensis",
		 * 5, 200, 2.02); vehicles[1] = toyotaAvensis; Car lamborghiniGallardo = new
		 * Car("Lamborghini Gallardo", 2, 325, 1.485); vehicles[2] =
		 * lamborghiniGallardo; Ship nimitz = new Ship("Nimitz", 5680, 58, 100020);
		 * vehicles[3] = nimitz; Car mazda3 = new Car("Mazda 3", 5, 190, 1.3);
		 * vehicles[4] = mazda3; System.out.println(vehicles.length); for(int i = 0; i <
		 * vehicles.length; i++){ System.out.println(vehicles[i].getName() + " - " +
		 * vehicles[i].getTopSpeed() + " - " + vehicles[i].getMaxPassengers()); }
		 * 
		 */
        Vehicle[] vehicles = new Vehicle[5];
		Ship ship = new Ship("Titanic", 3327, 39, 52310);
		vehicles[0] = ship;
		Car toyotaAvensis = new Car("Toyota Avensis", 5, 200, 2.02);
		vehicles[1] = toyotaAvensis;
		Car lamborghiniGallardo = new Car("Lamborghini Gallardo", 2, 325, 1.485);
		vehicles[2] = lamborghiniGallardo;
		Ship nimitz = new Ship("Nimitz", 5680, 58, 100020);
		vehicles[3] = nimitz;
		Car mazda3 = new Car("Mazda 3", 5, 190, 1.3);
		vehicles[4] = mazda3;
		System.out.println(vehicles.length);
		for(int i = 0; i < vehicles.length; i++){
		    System.out.println(vehicles[i].getName() + " - " + vehicles[i].getTopSpeed() + " - " + vehicles[i].getMaxPassengers());
		}
		
	}
}
