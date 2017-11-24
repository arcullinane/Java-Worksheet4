/**
 * Class to store maximum speed, car number, and make of car details about cars
 * parent class is Sorting
 * @author andrew cullinane
 */
public class Car extends Sorting implements Sortable {
	//field variables
	private double maxSpeed;
	private String carNumber;
	private String make;

	/**
	 * Constructor for Car class
	 * @param maxSpeed as double
	 * @param carNumber as String
	 * @param make as String
	 */
	public Car(double maxSpeed, String carNumber, String make) {
		this.maxSpeed = maxSpeed;
		this.carNumber = carNumber;
		this.make = make;
	}

	/**
	 * getter for maxSpeed
	 * @return maxSpeed as double
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	/**
	 * toString method to output text
	 * @return output text 
	 */
	public String toString() {
		return "Max Speed: " + maxSpeed + ", Car Number: " + carNumber + ", Make: " + make + ".";
	}

	/**
	 * value to be used for sorting
	 * @return value to be sorted.
	 */
	public double compareValue() {
		return maxSpeed;
	}

}
