import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Tests for Aircraft, Aeroplane, and HotAirBalloon classes
 * @author andrew cullinane
 */

public class Ex1Tests {

	private final static double EPSILON = 1e-6;
	
	//aircraft 1
	@Test
	public void test1() {
		
		Aircraft test1 = new Aircraft(300, 1500, 10);
		
		//test getter and toString methods
		assertEquals(300, test1.getMaxSpeed(), EPSILON);
		assertEquals(1500, test1.getMaxWeight(), EPSILON);
		assertEquals(10, test1.getMaxPersons(), EPSILON);
		String expectedString1 = "The aircraft has a maximal speed of 300.0 km/h and a maximal weight of 1500.0 kg. It can carry 10 persons.";
		assertEquals(expectedString1, test1.toString());
		
		//tests setter and toString methods
		//also tests for person vs person
		test1.setMaxSpeed(350);
		test1.setMaxWeight(1000);
		test1.setMaxPersons(12);
		String expectedString2 = "The aircraft has a maximal speed of 350.0 km/h and a maximal weight of 1000.0 kg. It can carry 12 persons.";
		assertEquals(expectedString2, test1.toString());
		
	}
	
	//aircraft 2
	@Test
	public void test2() {
		
		Aircraft test2 = new Aircraft(500, 500, 1);
		
		//test getter and toString methods with 1 person
		assertEquals(500, test2.getMaxSpeed(), EPSILON);
		assertEquals(500, test2.getMaxWeight(), EPSILON);
		assertEquals(1, test2.getMaxPersons(), EPSILON);
		String expectedString1 = "The aircraft has a maximal speed of 500.0 km/h and a maximal weight of 500.0 kg. It can carry 1 person.";
		assertEquals(expectedString1, test2.toString());
		
		//tests setter and toString methods with 0 as input parameters.
		//also tests for 0 persons
		test2.setMaxSpeed(0);
		test2.setMaxWeight(0);
		test2.setMaxPersons(0);
		String expectedString2 = "The aircraft has a maximal speed of 0.0 km/h and a maximal weight of 0.0 kg. It can carry 0 persons.";
		assertEquals(expectedString2, test2.toString());
	}

	//aeroplane 1
	@Test
	public void test3() {
		
		Aeroplane test3 = new Aeroplane(500, 15000, 200, 5000);
		
		//test getter methods for aircraft and aeroplane classes
		assertEquals(500, test3.getMaxSpeed(), EPSILON);
		assertEquals(15000, test3.getMaxWeight(), EPSILON);
		assertEquals(200, test3.getMaxPersons(), EPSILON);
		assertEquals(5000, test3.getRange(), EPSILON);
		//tests override for toString method
		String expectedString1 = "The aircraft has a maximal speed of 500.0 km/h and a maximal weight of 15000.0 kg. It can carry 200 persons. It has a range of 5000.0 km.";
		assertEquals(expectedString1, test3.toString());
		
		//test setters methods for Aircraft and Aeroplane classes
		test3.setMaxSpeed(400);
		test3.setMaxWeight(16000);
		test3.setMaxPersons(250);
		test3.setRange(4500);
		//tests override for toString method
		String expectedString2 = "The aircraft has a maximal speed of 400.0 km/h and a maximal weight of 16000.0 kg. It can carry 250 persons. It has a range of 4500.0 km.";
		assertEquals(expectedString2, test3.toString());

	}
	
	//aeroplane 2 - tests decimal values
	@Test
	public void test4() {
		
		Aeroplane test4 = new Aeroplane(123.45, 6789.01, 234, 5678.90);
		
		//test getter methods for aircraft and aeroplane classes
		assertEquals(123.45, test4.getMaxSpeed(), EPSILON);
		assertEquals(6789.01, test4.getMaxWeight(), EPSILON);
		assertEquals(234, test4.getMaxPersons(), EPSILON);
		assertEquals(5678.90, test4.getRange(), EPSILON);
		//tests override for toString method
		String expectedString1 = "The aircraft has a maximal speed of 123.45 km/h and a maximal weight of 6789.01 kg. It can carry 234 persons. It has a range of 5678.9 km.";
		assertEquals(expectedString1, test4.toString());
		
		//test setters methods for Aircraft and Aeroplane classes
		test4.setMaxSpeed(125);
		test4.setMaxWeight(6750);
		test4.setMaxPersons(250);
		test4.setRange(5500);
		//tests override for toString method
		String expectedString2 = "The aircraft has a maximal speed of 125.0 km/h and a maximal weight of 6750.0 kg. It can carry 250 persons. It has a range of 5500.0 km.";
		assertEquals(expectedString2, test4.toString());

	}
	
	//hot air balloon 1
	@Test
	public void test5() {
		
		HotAirBalloon test5 = new HotAirBalloon(50, 1000, 6, 1500);
		
		//test getter methods for Aircraft and HotAirBallon classes
		assertEquals(50, test5.getMaxSpeed(), EPSILON);
		assertEquals(1000, test5.getMaxWeight(), EPSILON);
		assertEquals(6, test5.getMaxPersons(), EPSILON);
		assertEquals(1500, test5.getGasTemperature(), EPSILON);
		//tests override for toString method
		String expectedString1 = "The aircraft has a maximal speed of 50.0 km/h and a maximal weight of 1000.0 kg. It can carry 6 persons. It has a gas temperature of maximally 1500.0\u00b0C.";
		assertEquals(expectedString1, test5.toString());
				
		//test setters methods for Aircraft and HotAirBallon classes
		test5.setMaxSpeed(30);
		test5.setMaxWeight(500);
		test5.setMaxPersons(2);
		test5.setGasTemperature(800);
		//tests override for toString method
		String expectedString2 = "The aircraft has a maximal speed of 30.0 km/h and a maximal weight of 500.0 kg. It can carry 2 persons. It has a gas temperature of maximally 800.0\u00b0C.";
		assertEquals(expectedString2, test5.toString());
		
	}
	
	//hot air balloon 2
	@Test
	public void test6() {
		
		HotAirBalloon test6 = new HotAirBalloon(50.45, 1000.79, 6, 1500.89);
		
		//test getter methods for Aircraft and HotAirBallon classes
		assertEquals(50.45, test6.getMaxSpeed(), EPSILON);
		assertEquals(1000.79, test6.getMaxWeight(), EPSILON);
		assertEquals(6, test6.getMaxPersons(), EPSILON);
		assertEquals(1500.89, test6.getGasTemperature(), EPSILON);
		//tests override for toString method
		String expectedString1 = "The aircraft has a maximal speed of 50.45 km/h and a maximal weight of 1000.79 kg. It can carry 6 persons. It has a gas temperature of maximally 1500.89\u00b0C.";
		assertEquals(expectedString1, test6.toString());
				
		//test setters methods for Aircraft and HotAirBallon classes
		test6.setMaxSpeed(45);
		test6.setMaxWeight(750);
		test6.setMaxPersons(3);
		test6.setGasTemperature(-1000);
		//tests override for toString method
		String expectedString2 = "The aircraft has a maximal speed of 45.0 km/h and a maximal weight of 750.0 kg. It can carry 3 persons. It has a gas temperature of maximally -1000.0\u00b0C.";
		assertEquals(expectedString2, test6.toString());
		
	}
	
}
