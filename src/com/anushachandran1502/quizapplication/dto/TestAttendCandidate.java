package com.anushachandran1502.quizapplication.dto;

public class TestAttendCandidate {
	private String code;
	private String name;
	private String email;
	private String score;
	private String Answer;
	public TestAttendCandidate(String code,String name, String email) {
		this.code=code;
		this.name=name;
		this.email=email;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
}
