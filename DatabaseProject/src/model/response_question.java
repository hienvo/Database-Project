package model;

public class response_question {
	private int response_question_id;
	private String answer_question;

	//getter methods
	public int getResponse_question_id()
	{
		return response_question_id;
	}
	
	public String getAnswer_question()
	{
		return answer_question;
	}
	
	//setter methods
	
	public void setResponse_question_id(int response_question_id)
	{
		this.response_question_id=response_question_id;
	}
	
	public void setAnswer_question(String answer_question)
	{
		this.answer_question = answer_question;
	}

}
