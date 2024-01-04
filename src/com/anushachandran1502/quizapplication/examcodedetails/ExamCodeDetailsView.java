package com.anushachandran1502.quizapplication.examcodedetails;

public class ExamCodeDetailsView {
		private ExamCodeViewDetailsViewModel viewModel;
	public ExamCodeDetailsView()
	{
		viewModel=new ExamCodeViewDetailsViewModel(this);
	}
	public void showTheExamCodeDetails(String code, int topicNo) {
		String topic=viewModel.getTopicName(topicNo);
		if(!topic.equals(""))
		{
		System.out.println("Topic : " +topic);
		System.out.println("Exam_Code : "+code);
		}
	}
}


