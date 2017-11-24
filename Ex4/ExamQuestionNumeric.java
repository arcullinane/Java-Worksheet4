/**
 * Class to make exam questions with numeric input
 * subclass of ExamQuestion
 * @author andrew cullinane
 */
public class ExamQuestionNumeric extends ExamQuestion {

	//field variables
	private int answer;

	/**
	 * Constructor for ExamQuestionNumeric class
	 * @param questionText as String
	 * @param maximalMark as int
	 * @param answer as int
	 */
	public ExamQuestionNumeric(String questionText, int maximalMark, int answer) {
		super(questionText, maximalMark);
		this.answer = answer;
	}

	/**
	 * method to calculate mark to be given
	 * @param value for answer as int
	 * @return mark as int
	 */
	public int mark(int value) {

		if (value == answer) {
			return getMaximalMark();
		} else {
			return 0;
		}
	}

	/**
	 * toString method to output text
	 * @return output text
	 */
	@Override
	public String toString() {
		return super.toString() + " Correct answer is:  " + answer;
	}

}
