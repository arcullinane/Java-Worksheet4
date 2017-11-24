/**
 * Class to make exam simple questions
 * @author andrew cullinane
 */
public class ExamQuestion {

	//field variables
	private String questionText;
	private int maximalMark;
	
	/**
	 * Constructor for ExamQuestion class
	 * @param questionText as String
	 * @param maximalMark as int
	 */
	public ExamQuestion(String questionText, int maximalMark) {
		this.questionText = questionText;
		this.maximalMark = maximalMark;
	}
	
	/**
	 * getter for questionText
	 * @return question text as String
	 */
	public String getQuestionText() {
		return questionText;
	}
	
	/**
	 * getter for maximalMark
	 * @return maximal mark as int
	 */
	public int getMaximalMark() {
		return maximalMark;
	}
	
	/**
	 * setter for questionText
	 * @param newQuestionText as String
	 */
	public void setQuestionText(String newQuestionText) {
		this.questionText = newQuestionText;
	}
	
	/**
	 * setter for maximalMark
	 * @param newMaximalMark as int
	 */
	public void setMaximalMark(int newMaximalMark) {
		this.maximalMark = newMaximalMark;
	}
	
	/**
	 * @return text output as String
	 */
	public String toString() {
		return "Question (Maximal mark:  " + maximalMark + "):  " + questionText; 
	}

}
