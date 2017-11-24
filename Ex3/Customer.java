/**
 * Class to store name, the total money spent, and address details of customers
 * @author andrew cullinane
 */
public class Customer extends Sorting implements Sortable {
	//field variables
	private String name;
	private double totalMoneySpent;
	private String address;

	/**
	 * Constructor for Customer class
	 * @param name as String
	 * @param totalMoneySpent as double
	 * @param address as String
	 */
	public Customer(String name, double totalMoneySpent, String address) {
		this.name = name;
		this.totalMoneySpent = totalMoneySpent;
		this.address = address;
	}

	/**
	 * toSring method to output text
	 * @return output text
	 */
	public String toString() {
		return "Name: " + name + ", Total Money Spent: " + totalMoneySpent + ", Address: " + address + ".";
	}

	/**
	 * value to be used for sorting
	 * @return value to be sorted.
	 */
	public double compareValue() {
		return totalMoneySpent;
	}

}
