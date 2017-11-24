/**
 * Program to keep track of aircraft details including maximum speed, maximum
 * weight, and maximum number of persons.
 * 
 * @author andrew cullinane
 */

public class Aircraft {
	// field variables
	private double maxSpeed;
	private double maxWeight;
	private int maxPersons;

	/**
	 * Constructor for Aircraft class
	 * @param maxSpeed as double
	 * @param maxWeight as double
	 * @param maxPersons as int
	 */
	public Aircraft(double maxSpeed, double maxWeight, int maxPersons) {
		this.maxSpeed = maxSpeed;
		this.maxWeight = maxWeight;
		this.maxPersons = maxPersons;
	}

	/**
	 * getter for maxSpeed
	 * @return maximum speed as a double
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * getter for maxWeight
	 * @return maximum weight as double
	 */
	public double getMaxWeight() {
		return maxWeight;
	}

	/**
	 * getter for maxPersons
	 * @return maximum number of persons as int
	 */
	public int getMaxPersons() {
		return maxPersons;
	}

	/**
	 * setter for maxSpeed
	 * @param newMaxSpeed as double
	 */
	public void setMaxSpeed(double newMaxSpeed) {
		this.maxSpeed = newMaxSpeed;
	}

	/**
	 * setter for maxWeight
	 * @param newMaxWeight as double
	 */
	public void setMaxWeight(double newMaxWeight) {
		this.maxWeight = newMaxWeight;
	}

	/**
	 * setter for maxPersons
	 * @param newMaxPersons as int
	 */
	public void setMaxPersons(int newMaxPersons) {
		this.maxPersons = newMaxPersons;
	}

	/**
	 * @return String output for class
	 */
	public String toString() {
		
		// person or persons 
		String personString = "";
		if (maxPersons == 1) {
			personString = " person.";
		} else {
			personString = " persons.";
		}

		//String
		return "The aircraft has a maximal speed of " + maxSpeed + " km/h and a maximal weight of " + maxWeight
				+ " kg. It can carry " + maxPersons + personString;

	}

}
