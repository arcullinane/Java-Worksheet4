/**
 * Class to store details about aeroplanes
 * parent class is aircraft
 * @author andrew cullinane
 */
public class Aeroplane extends Aircraft {

	//field variable
	private double range;

	/**
	 * constructor for Aeroplane class
	 * @param maxSpeed as double
	 * @param maxWeight as double
	 * @param maxPersons as int
	 * @param range as double
	 */
	public Aeroplane(double maxSpeed, double maxWeight, int maxPersons, double range) {
		super(maxSpeed, maxWeight, maxPersons);
		this.range = range;
	}

	/**
	 * getter for range
	 * @return range as double
	 */
	public double getRange() {
		return range;
	}

	/**
	 * setter for range
	 * @param newRange as double
	 */
	public void setRange(double newRange) {
		this.range = newRange;
	}
	
	/**
	 * @return output text as String
	 * adds onto Aircraft toString
	 */
	@Override
	public String toString() {
		return super.toString() + " It has a range of " + range + " km.";
	}
	
}
