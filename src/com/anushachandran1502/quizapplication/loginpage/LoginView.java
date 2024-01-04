package com.anushachandran1502.quizapplication.loginpage;

import java.sql.SQLException;
import java.util.Scanner;

import com.anushachandran1502.quizapplication.signuppage.SignupView;
import com.anushachandran1502.quizapplication.topic.TopicView;


public class LoginView {
	private LoginViewModel loginViewModel;
	private int currentUser;
	public LoginView()
	{
		 loginViewModel = new LoginViewModel(this);
	}
	public int getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(int currentUser) {
		this.currentUser = currentUser;
	}
	
	public void isvalidUser() {
	
	}

	public void login() throws SQLException {
		TopicView topicView=new TopicView();
		SignupView signupView=new SignupView();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a User Name");
		String userName=scanner.nextLine();
		System.out.println("Enter a Password only 8 Characters");
		String password=scanner.nextLine();
		boolean user=loginViewModel.isValidUser(userName,password);
		//System.out.println(this.currentUser);
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
