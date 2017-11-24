import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Tests for Car and Customer Classes and Sortable Interface
 * @author andrewcullinane
 */
public class Ex3Tests {

	public static final double EPSILON = 1e-6;
	
	//Car class 1
	@Test
	public void test1() {
		Car a1 = new Car(120.0, "AB01 CDE", "BMW");
		//test getter for maxSpeed
		assertEquals(120.0, a1.getMaxSpeed(), EPSILON);
		//test toString
		String expectedString = "Max Speed: 120.0, Car Number: AB01 CDE, Make: BMW.";
		assertEquals(expectedString, a1.toString());
		//test compareValue method
		assertEquals(a1.getMaxSpeed(), a1.compareValue(), EPSILON);
		
	}
	
	//Car class 2
	@Test
	public void test2() {
		Sortable a1 = new Car(120.0, "AB01 CDE", "BMW");
		Sortable a2 = new Car(130.50, "FG02 HIJ", "Audi");
		Sortable a3 = new Car(175.0, "KL03 MNP", "Ferrari");
		
		//test compareValue method
		assertEquals(120.0, a1.compareValue(), EPSILON);
		assertEquals(130.50, a2.compareValue(), EPSILON);
		assertEquals(175.0, a3.compareValue(), EPSILON);
		
		//test quicksort method
		Sortable[] a = {a2, a3, a1};
		Sortable[] expected = {a1, a2, a3};
		Sortable[] actual = Sorting.quickSort(a);
		assertArrayEquals(expected, actual);
		
	}
	
	//Customer class 1
	@Test
	public void test3() {
	 	Customer a4 = new Customer("John", 456.0, "100 Bristol Road");
	 	// test toString method
	 	String expectedString = "Name: John, Total Money Spent: 456.0, Address: 100 Bristol Road.";
	 	assertEquals(expectedString, a4.toString());
	 	//test compareValue method
	 	assertEquals(456.0, a4.compareValue(), EPSILON);
	}
	
	//Customer class 2
	 @Test
	 public void test4(){
	 	Sortable a4 = new Customer("John", 456.0, "100 Bristol Road");
	 	Sortable a5 = new Customer("Sarah", 407.0, "200 Pershore Road");
	 	Sortable a6 = new Customer("Mary", 568.70, "300 Hagley Road");
		
		//test compareValue method
		assertEquals(456.0, a4.compareValue(), EPSILON);
		assertEquals(407.0, a5.compareValue(), EPSILON);
		assertEquals(568.7, a6.compareValue(), EPSILON);
		
		//test quicksort method
		Sortable[] a = {a4, a5, a6};
		Sortable[] expected = {a5, a4, a6};
		Sortable[] actual = Sorting.quickSort(a);
		assertArrayEquals(expected, actual);
	 }
	 
	//Sortable interface 1
	 @Test
	 public void test5() {
		Sortable a1 = new Car(120.0, "AB01 CDE", "BMW");
		Sortable a2 = new Car(130.50, "FG02 HIJ", "Audi");
		Sortable a3 = new Car(175.0, "KL03 MNP", "Ferrari");
	 	Sortable a4 = new Customer("John", 156.0, "100 Bristol Road");
	 	Sortable a5 = new Customer("Sarah", 107.0, "200 Pershore Road");
	 	Sortable a6 = new Customer("Mary", 168.70, "300 Hagley Road");
	 	
		//test quicksort method
		Sortable[] a = {a1, a2, a3, a4, a5, a6};
		Sortable[] expected = {a5, a1, a2, a4, a6, a3};
		Sortable[] actual = Sorting.quickSort(a);
		assertArrayEquals(expected, actual);
	 }
	 
	//Sortable interface 2
	 @Test
	 public void test6() {
		//some compareValue values close together
		Sortable a1 = new Car(120.0, "AB01 CDE", "BMW");
		Sortable a2 = new Car(0.0, "FG02 HIJ", "Audi");
		Sortable a3 = new Car(175.0, "KL03 MNP", "Ferrari");
	 	Sortable a4 = new Customer("John", 0.01, "100 Bristol Road");
	 	Sortable a5 = new Customer("Sarah", 120.01, "200 Pershore Road");
	 	Sortable a6 = new Customer("Mary", 174.99, "300 Hagley Road");
	 	
		//test quicksort method
		Sortable[] a = {a1, a2, a3, a4, a5, a6};
		Sortable[] expected = {a2, a4, a1, a5, a6, a3};
		Sortable[] actual = Sorting.quickSort(a);
		assertArrayEquals(expected, actual);
	 }
	 
}
