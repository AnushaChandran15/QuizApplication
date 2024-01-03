//package com.anushachandran1502.quizapplication.quizpage.quizviewmodel;
//
//import java.util.List;
//
//import com.anushachandran1502.quizapplication.dto.QuizQuestion;
//import com.anushachandran1502.quizapplication.quizpage.quizview.QuizView;
//import com.anushachandran1502.quizapplication.repository.Repository;
//
//public class QuizViewModel {
//	private QuizView view;
//	Repository repository;
//	public QuizViewModel(QuizView quizView) {
//		view=quizView;
//		repository=Repository.getInstance();
//	}
//	public List<QuizQuestion> getTheQuizQuestions(String topic) {
//		List<QuizQuestion> question=null;
//		if(!topic.isEmpty())
//		{
//			question=repository.getTheQuestions(topic);
//		}
//		return question;
//	}
//	public static boolean isCorrect(byte ans, byte correctAns) {
//		return ans==correctAns;
//	}
//	public String yourLevel(int correctAns) {
//		if(correctAns<=1)
//		{
//			return "Improve your skills...All the best";
//		}
//		else if(correctAns>=2 && correctAns<=3)
//		{
//			return "Good";
//		}
//		else
//		{
//			return "Excellent";
//		}
//	}
//}
//
//
