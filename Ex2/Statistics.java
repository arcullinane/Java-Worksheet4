import java.util.function.Function;

/**
 * Program to calculate the mean and standard deviation for a given array of
 * values that have a function applied to them.
 * @author andrew cullinane
 */
public class Statistics {

	/**
	 * Calculates mean for an array of doubles that have a function applied to each value
	 * @param f is a function (given double, output double)
	 * @param argumentValues array of values given as doubles
	 * @return mean as a double
	 * @throws IllegalArgumentException if array is empty
	 */
	public static double mean(Function<Double, Double> f, double[] argumentValues) {

		//loop to find the sum of the values
		//counter to find n number of values
		double sum = 0;
		int counter = 0;
		for (int i = 0; i < argumentValues.length; i++) {
			sum += f.apply(argumentValues[i]);
			counter++;
		}
		//return mean
		double mean = sum / counter;

		if (mean < 0 || mean >=0) {
			return mean; 
		} else {
			throw new IllegalArgumentException ();
		}
	}

	/**
	 * Calculates standard deviation for an array of doubles that have a function applied to each value
	 * @param f is a function (given double, output double)
	 * @param argumentValues array of values given as doubles
	 * @return standard deviation as a double
	 * @throws IllegalArgumentException if array is empty
	 */
	public static double standardDeviation(Function<Double, Double> f, double[] argumentValues) {
		
		//find mean of array
		double mean = mean(f, argumentValues);
		//loop to find the sum of the square difference between the value and the mean
		//counter to find n number of values
		double sumSquares = 0;
		int counter = 0;
		for (int i = 0; i < argumentValues.length; i++) {
			sumSquares += (f.apply(argumentValues[i]) - mean) * (f.apply(argumentValues[i]) - mean);
			counter++;
		}
		// return standard deviation
		double stDev = Math.sqrt(sumSquares / counter);
		if (stDev < 0 || stDev >=0) {
			return stDev; 
		} else {
			throw new IllegalArgumentException ();
		}
	}

}
