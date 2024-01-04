package com.anushachandran1502.quizapplication.addquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.anushachandran1502.quizapplication.dto.QuizQuestion;
import com.anushachandran1502.quizapplication.examcodedetails.ExamCodeDetailsView;
import com.anushachandran1502.quizapplication.loginpage.LoginViewModel;

public class AddQuestionView {
		AddQuestionViewModel addQuesViewModel;
		public AddQuestionView()
		{
			 addQuesViewModel = new AddQuestionViewModel(this);
		}

	public void addQuestion(int current,int topicNo) {
		Scanner scanner=new Scanner(System.in);
		ExamCodeDetailsView examCode=new ExamCodeDetailsView();
		List<QuizQuestion> questionList=new ArrayList<QuizQuestion>();
		boolean terminate=true;
		do {
			//ArrayList<String> list=new ArrayList<String>();
			String options="";
			System.out.println("Enter the question");
			String Question=scanner.nextLine();
			System.out.println("1.MCQ\n2.True/false\n3.Fillup");
			int noOfOptions=0;
			int OptionType=scanner.nextInt();
			scanner.nextLine();
			switch(OptionType)
			{
			case 1:
				noOfOptions=4;
				break;
			case 2:
				noOfOptions=2;
				break;
			case 3:
				noOfOptions=0;
				break;
			}
		
			for(int i=0;i<noOfOptions;i++)
			{
				System.out.println("Option :"+(i+1));
				String option=scanner.nextLine();
				options+=option+",";
				//list.add(option);
			}
			System.out.println("Enter the Correct Answer");
			String ans=scanner.nextLine();
			questionList.add(new QuizQuestion(Question,options, ans));
			System.out.println("1.Add next Question\n2.Submit");
			int n=scanner.nextInt();
			scanner.nextLine();
			switch(n)
			{
				case 1:
					terminate=true;
					break;
				case 2:
					terminate=false;
					addQuesViewModel.quizQutions(questionList,current,topicNo);
					//examcode.showExamCodeDeatails(code,);
					break;
			}
		}
		while(terminate);
	}

	
	

}
