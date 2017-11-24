/**
 * Program to store details of hot air balloons
 * parent class is aircraft
 * @author andrew cullinane
 */
public class HotAirBalloon extends Aircraft {

	//field variable
	private double gasTemperature;

	/**
	 * constructor for HotAirBalloon class
	 * @param maxSpeed as double
	 * @param maxWeight as double
	 * @param maxPersons as int
	 * @param gasTemperature as double
	 */
	public HotAirBalloon(double maxSpeed, double maxWeight, int maxPersons, double gasTemperature) {
		super(maxSpeed, maxWeight, maxPersons);
		this.gasTemperature = gasTemperature;
	}
	
	/**
	 * getter for gasTemperature
	 * @return gas temperature as double
	 */
	public double getGasTemperature() {
		return gasTemperature;
	}
	
	/**
	 * setter for gasTemperature
	 * @param newGasTemperature as double
	 */
	public void setGasTemperature(double newGasTemperature) {
		this.gasTemperature = newGasTemperature;
	}
	
	/**
	 * @return output text as String
	 * adds onto Aircraft toString
	 */
	@Override
	public String toString() {
		return super.toString() + " It has a gas temperature of maximally " + gasTemperature + "\u00b0C.";
	}
	
}
