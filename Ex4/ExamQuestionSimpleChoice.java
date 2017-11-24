import java.util.ArrayList;
/**
 * Class to make a simple choice exam question
 * parent class is ExamQuestion
 * @author andrew cullinane
 */
public class ExamQuestionSimpleChoice extends ExamQuestion {
	
	//field variables
	ArrayList<String> possibleAnswers;
	int correctAnswer;

	/**
	 * Constructor for ExamQuestionSimpleChoice
	 * @param questionText as String
	 * @param maximalMark as int
	 * @param a possible answers as ArrayList<String>
	 * @param correctAnswer as int
	 */
	public ExamQuestionSimpleChoice(String questionText, int maximalMark, ArrayList<String> a, int correctAnswer) {
		super(questionText, maximalMark);
		this.possibleAnswers = a;
		this.correctAnswer = correctAnswer;
	}

	/**
	 * method to calculate the mark to be given
	 * @param value for answer as int
	 * @return mark as int
	 */
	public int mark(int value) {

		if (value == correctAnswer) {
			return getMaximalMark();
		} else {
			return 0;
		}

	}

	/**
	 * toString method to output text
	 * @return output String
	 */
	@Override
	public String toString() {
		return super.toString() + "\nPossible Answers are:  " + possibleAnswers + "\nCorrect answer position is:  " + correctAnswer;
	}

}
