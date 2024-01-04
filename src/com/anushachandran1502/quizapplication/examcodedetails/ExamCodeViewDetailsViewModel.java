package com.anushachandran1502.quizapplication.examcodedetails;

import com.anushachandran1502.quizapplication.repository.Repository;

public class ExamCodeViewDetailsViewModel {
	private ExamCodeDetailsView view;
	private Repository repo;
	public ExamCodeViewDetailsViewModel(ExamCodeDetailsView examCodeDetailsView) {
		view=examCodeDetailsView;
		repo=Repository.getInstance();
	}

	public String getTopicName(int topicNo) {
		return repo.getTopicNameInDB(topicNo);
	}
		
}
