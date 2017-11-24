import static org.junit.Assert.*;
import java.util.function.Function;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * Tests for Statistics Class
 * @author andrew cullinane
 */

public class Ex2Tests {

	@Rule public final ExpectedException exception = ExpectedException.none();
	
	private final static double EPSILON = 1e-6;
	
	//no function applied (x -> x)
	@Test
	public void test1() {
		
		Function<Double, Double> f1 = x -> x;
		double[] a = { 10, 20, 30, 40, 50 };

		double expectedMean = 30;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 14.142135623730951;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);
		
	}

	//addition
	@Test
	public void test2() {
		
		Function<Double, Double> f1 = x -> x + 10;
		double[] a = { -10, -10, 0, 0, 10, 10 };

		double expectedMean = 10;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 8.16496580927726;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);
		
	}	
	
	//negative numbers
	@Test
	public void test3() {
		
		Function<Double, Double> f1 = x -> x - 10;
		double[] a = { 1, 2, 3, 4, 5};

		double expectedMean = -7;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 1.4142135623730951;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);
		
	}	
	
	//multiplication
	@Test
	public void test4() {
		
		Function<Double, Double> f1 = x -> x * 5;
		double[] a = { 0, 5, 8, 7, 3};

		double expectedMean = 23;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 14.352700094407323;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);
		
	}	
	
	//division
	@Test
	public void test5() {
		
		Function<Double, Double> f1 = x -> x / 12;
		double[] a = { 0, 12, 24, 36, 48, 60};

		double expectedMean = 2.5;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 1.707825127659933;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);
		
	}	
	
	//square root
	@Test
	public void test6() {
		
		Function<Double, Double> f1 = x -> Math.sqrt(2 * x);
		double[] a = { 35, 16, 48, 84, 26, 89};

		double expectedMean = 9.555943582972647;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 2.8314793964246374;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);
		
	}	
	
	//empty array for exception testing
	@Test
	public void test7() {
		
		Function<Double, Double> f1 = x -> x + 10;
		double[] a = {};
		exception.expect(IllegalArgumentException.class);
		Statistics.mean(f1, a);
		Statistics.standardDeviation(f1, a);
		
	}
	
}
