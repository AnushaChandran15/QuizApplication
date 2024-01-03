package com.anushachandran1502.quizapplication.topic;

import java.util.Scanner;

import com.anushachandran1502.quizapplication.addquestion.AddQuestionView;

public class TopicView {
	Scanner scan=new Scanner(System.in);
	
	public void showTopics() {
				boolean terminate=true;
				TopicView topicView=new TopicView();
				AddQuestionView addQues=new AddQuestionView();
		while(terminate)
	{
			System.out.println("1.Java1\n2.Java2\n3.Java3");
			int choice=scan.nextInt();
		switch(choice)
		{
			case 1:
				terminate=false;
				addQues.addQuestion();
				break;
			case 2:
				terminate=false;
				addQues.addQuestion();
				break;
			case 3:
				terminate=false;
				addQues.addQuestion();
				break;
			case 0:
				terminate=false;
				System.out.println("Exit...");
				break;
				default:
					System.out.println("wrong....");		
		}
	}
	
	}
	private void addquestion() {
		AddQuestionView view=new AddQuestionView();
		TopicView Tview=new TopicView();
		System.out.println("1.Add Question\n2.back\n0.exit");
		int option=scan.nextInt();
		scan.next();
		switch(option)
		{
			case 1: 
				view.addQuestion();
				break;
			case 2:
				Tview.showTopics();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Wrong input ....");
		}
		
	}
}
