package at.ac.tuwien.big.we15.lab2.api;

public class GameState {

	private int questionCount;
	/**
	 * True if the answer of the opponent is right, false otherwise
	 */
	private Boolean isOpponentAnswerRight;
	/**
	 * True if the answer of the player is right, false otherwise
	 */
	private Boolean isPlayerAnswerRight;
	// For display of last chosen question by opponent
	private String categoryChosenByOpponent;
	private int valueOfChosenQuestion;
	
	

	public GameState() {
		super();
		questionCount = 0;
	}

	public int getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}

	public Boolean getIsOpponentAnswerRight() {
		return isOpponentAnswerRight;
	}

	public void setIsOpponentAnswerRight(Boolean isOpponentAnswerRight) {
		this.isOpponentAnswerRight = isOpponentAnswerRight;
	}

	public Boolean getIsPlayerAnswerRight() {
		return isPlayerAnswerRight;
	}

	public void setIsPlayerAnswerRight(Boolean isPlayerAnswerRight) {
		this.isPlayerAnswerRight = isPlayerAnswerRight;
	}

	public String getCategoryChosenByOpponent() {
		return categoryChosenByOpponent;
	}

	public void setCategoryChosenByOpponent(String categoryChosenByOpponent) {
		this.categoryChosenByOpponent = categoryChosenByOpponent;
	}

	public int getValueOfChosenQuestion() {
		return valueOfChosenQuestion;
	}

	public void setValueOfChosenQuestion(int valueOfChosenQuestion) {
		this.valueOfChosenQuestion = valueOfChosenQuestion;
	}

}