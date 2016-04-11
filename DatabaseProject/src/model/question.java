package model;

public class question {
	private int question_id;
	private String question;

	//getter methods
	public int getQuestion_id()
	{
		return question_id;
	}
	
	public String getQuestion()
	{
		return question;
	}
	
	//setter methods
	
	public void setQuestion_id(int question_id)
	{
		this.question_id=question_id;
	}
	
	public void setQuestion(String question)
	{
		this.question = question;
	}
}
