package com.anushachandran1502.quizapplication.addquestion;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.anushachandran1502.quizapplication.dto.QuizQuestion;
import com.anushachandran1502.quizapplication.examcodedetails.ExamCodeDetailsView;
import com.anushachandran1502.quizapplication.repository.Repository;

public class AddQuestionViewModel {
	private Repository repo;
	private AddQuestionView quesView;
	public AddQuestionViewModel(AddQuestionView addQuestionView) {
		quesView=addQuestionView;
		repo=Repository.getInstance();
	}
	public AddQuestionViewModel() {
	}
	public void quizQutions(List<QuizQuestion> questionList, int current,int topicNo) {
		AddQuestionViewModel model=new AddQuestionViewModel();
		ExamCodeDetailsView examCode=new ExamCodeDetailsView();
		String code=model.generateCode();
		try {
			boolean added=repo.addQuestionsToDb(questionList,code,current);
			if(added)
			{
				repo.insertExamCodeUserID(current,code);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		examCode.showTheExamCodeDetails(code,topicNo);
	}
	private String generateCode() {
		UUID uuid= UUID.randomUUID();
		String uuidString= uuid.toString();
		String code=uuidString.split("-")[0];
		return code;
	}
}
