package com.anushachandran1502.quizapplication.signuppage;

import java.sql.SQLException;
import java.util.Scanner;

import com.anushachandran1502.quizapplication.signuppage.SignupViewModel;
import com.anushachandran1502.quizapplication.topic.TopicView;

public class SignupView {
	private SignupViewModel signup;
	
	private int currentUser;
	private SignupView signupView;
	public int getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(int currentUser) {
		this.currentUser = currentUser;
	}


	public SignupView() {
		this.signup = new SignupViewModel(this);
	}

	public void signup() throws SQLException {
		TopicView topicView=new TopicView();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a User Name");
		String userName=scanner.nextLine();
		System.out.println("Enter a Password only 8 Characters");
		String password=scanner.nextLine();
		scanner.nextLine();
		
		boolean user=signup.isValidUser(userName,password);
		if(user)
		{
			topicView.showTopics(this.currentUser);
		}
		else
		{
			signupView.signup();
		}
	}
}
