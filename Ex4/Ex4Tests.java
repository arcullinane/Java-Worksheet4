import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for ExamQuestion, ExamQuestionNumeric, ExamQuestionSimpleChoice, and ExamQuestionMultipleChoice classes
 * @author andrew cullinane
 */
public class Ex4Tests {

	//Setup for ExamQuestionMultipleChoice
	private ExamQuestionMultipleChoice q5; 
	@Before
	public void setup() {
		ArrayList<String> possible = new ArrayList<String>();
		possible.add("-6");
		possible.add("-3");
		possible.add("3");
		possible.add("6");
		ArrayList<Integer> correct = new ArrayList<Integer>();
		correct.add(1);
		correct.add(4);
		q5 = new ExamQuestionMultipleChoice("What is x * x = 12?", 10, possible, correct);
	}
	
	//ExamQuestion
	@Test
	public void test() {
		ExamQuestion q1 = new ExamQuestion("What is 2 + 3?", 5);
		//getQuestionText
		assertEquals("What is 2 + 3?", q1.getQuestionText());	
		//getMaximalMark
		assertEquals(5, q1.getMaximalMark());
		//setQuestionText
		String expectedString = "What is 3 + 3?";
		q1.setQuestionText("What is 3 + 3?");
		assertEquals(expectedString, q1.getQuestionText());
		//setMaximalMark
		q1.setMaximalMark(10);
		assertEquals(10, q1.getMaximalMark());
		//toString
		String expectedString2 = "Question (Maximal mark:  10):  What is 3 + 3?";
		assertEquals(expectedString2, q1.toString());
	}
	
	//ExamQuestionNumeric - correct
	@Test
	public void test2() {
		ExamQuestionNumeric q2 = new ExamQuestionNumeric("What is 2 + 3?", 10, 5);
		String expectedString = "Question (Maximal mark:  10):  What is 2 + 3? Correct answer is:  5";
		assertEquals(10, q2.mark(5));
		assertEquals(expectedString, q2.toString());
	}

	//ExamQuestionNumeric - incorrect
	@Test
	public void test3() {
		ExamQuestionNumeric q3 = new ExamQuestionNumeric("What is 4 x 3?", 10, 12);
		String expectedString = "Question (Maximal mark:  10):  What is 4 x 3? Correct answer is:  12";
		assertEquals(0, q3.mark(16));
		assertEquals(expectedString, q3.toString());
	}
	
	//ExamQuestionSimpleChoice - correct
	@Test
	public void test4() {
		ArrayList <String> a = new ArrayList<String>();
		a.add("1"); 
		a.add("2");
		a.add("3");
		a.add("4");
		ExamQuestionSimpleChoice q4 = new ExamQuestionSimpleChoice("What is 2 + 2?", 10, a, 4);
		assertEquals(10, q4.mark(4));
		String expectedString = "Question (Maximal mark:  10):  What is 2 + 2?\nPossible Answers are:  [1, 2, 3, 4]\nCorrect answer position is:  4";
		assertEquals(expectedString, q4.toString());
	}
	
	//ExamQuestionSimpleChoice - incorrect
	@Test
	public void test5() {
		ArrayList <String> a = new ArrayList<String>();
		a.add("2"); 
		a.add("4");
		a.add("6");
		a.add("8");
		ExamQuestionSimpleChoice q4 = new ExamQuestionSimpleChoice("What is 2 * 2?", 5, a, 2);
		assertEquals(0, q4.mark(1));
		String expectedString = "Question (Maximal mark:  5):  What is 2 * 2?\nPossible Answers are:  [2, 4, 6, 8]\nCorrect answer position is:  2";
		assertEquals(expectedString, q4.toString());
	}	
	
	//ExamQuestionMultipleChoice - all correct
	@Test
	public void test6() {
		ArrayList<Integer> given = new ArrayList<Integer>();
		given.add(1);
		given.add(4);
		int actual = q5.mark(given);
		assertEquals(10, actual);
	}
	
	//ExamQuestionMultipleChoice - none correct
	@Test
	public void test7() {
		ArrayList<Integer> given = new ArrayList<Integer>();
		given.add(2);
		given.add(3);
		int actual = q5.mark(given);
		assertEquals(0, actual);
	}	
	
	//ExamQuestionMultipleChoice - too many answers + non negative answer given
	@Test
	public void test8() {
		ArrayList<Integer> given = new ArrayList<Integer>();
		given.add(2);
		given.add(3);
		given.add(5);
		int actual = q5.mark(given);
		assertEquals(0, actual);
	}
	
	//ExamQuestionMultipleChoice - too few answers
	@Test
	public void test9() {
		ArrayList<Integer> given = new ArrayList<Integer>();
		given.add(4);
		int actual = q5.mark(given);
		assertEquals(5, actual);
	}
	
	//ExamQuestionMultipleChoice - repeat answers
	@Test
	public void test10() {
		ArrayList<Integer> given = new ArrayList<Integer>();
		given.add(1);
		given.add(1);
		given.add(4);
		given.add(4);
		int actual = q5.mark(given);
		assertEquals(0, actual);
	}
	
}
