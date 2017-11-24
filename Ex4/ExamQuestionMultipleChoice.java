import java.util.ArrayList;

/**
 * Class to make exam questions where a choice of answers can be given 
 * subclass of ExamQuestion class
 * @author andrew cullinane
 */

public class ExamQuestionMultipleChoice extends ExamQuestion {

	//field variables
	ArrayList<String> possibleAnswers;
	ArrayList<Integer> correctAnswers;

	/**
	 * Constructor for ExamQuestionMultipleChoice class
	 * @param questionText as String
	 * @param maximalMark as int
	 * @param possibleAnswers as an array list of Strings
	 * @param correctAnswers as an array list of Intergers
	 */
	public ExamQuestionMultipleChoice(String questionText, int maximalMark, ArrayList<String> possibleAnswers,
			ArrayList<Integer> correctAnswers) {
		super(questionText, maximalMark);
		this.possibleAnswers = possibleAnswers;
		this.correctAnswers = correctAnswers;
	}

	/**
	 * method to calculate the mark that should be awarded for each question
	 * @param answersProvided array list of answers 
	 * @return mark as an int
	 */
	public int mark(ArrayList<Integer> answersProvided) {

		// for loop to look through answersProvided array list to check if answers are present in correctAnswers array list
		// works out how many answers provided are correct
		// checks if an answer has been given more than once (answerAlreadyGiven and repeatAnswers) 
		int correct = 0;
		ArrayList<Integer> answerAlreadyGiven = new ArrayList<Integer>(); 
		boolean repeatAnswers = false;
		for (int i = 0; i < answersProvided.size(); i++) {
			// answer in the correctAnswer array list, but not in the answerAlreadyGiven array list
			if (correctAnswers.contains(answersProvided.get(i)) && !answerAlreadyGiven.contains(answersProvided.get(i))) {
				correct++;
				answerAlreadyGiven.add(answersProvided.get(i));
			// answerAlreadyGiven makes repeatAnswers true
			} else if (answerAlreadyGiven.contains(answersProvided.get(i))) {
				repeatAnswers = true;
			}
		}

		// for working out mark
		double ratio = correct / (double) correctAnswers.size();
		double pointsPerAnswer = (double) getMaximalMark() / correctAnswers.size();
		int incorrect = answersProvided.size() - correct;
		
		//score calculation
		int score = 0;
		// all correct situation
		if (answersProvided.size() == correctAnswers.size() && correctAnswers.size() == correct) {
			score = getMaximalMark();
		// none correct
		} else if (correct == 0) {
			score = 0;
		// repeat answers situation
		} else if (answersProvided.size() == correctAnswers.size() && repeatAnswers == true) {
			score = (int) Math.round((ratio * getMaximalMark()));
		// too few answers situation
		} else if (answersProvided.size() < correctAnswers.size()) {
			score = (int) Math.round((ratio * getMaximalMark()));
		// too many answers situation
		} else if (answersProvided.size() >= correctAnswers.size()) {
			score = (int) Math.round(((ratio * getMaximalMark()) - (pointsPerAnswer * incorrect)));
		}

		// ensures no negative scores
		if (score < 0) {
			score = 0;
		}

		return score;
	}

}
