package com.anushachandran1502.quizapplication.dto;

import java.util.List;

public class QuizQuestion {
	private String question;
	private String options;
	private String correctAns;
	
	public QuizQuestion(String question,String options, String correctAns) {
		this.question=question;
		this.options=options;
		this.correctAns=correctAns;
	}
	public QuizQuestion() {
		
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption() {
		return options;
	}
	public void setOption(String option) {
		this.options = option;
	}
	public String getCorrectAns() {
		return correctAns;
	}
	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}
	

}
