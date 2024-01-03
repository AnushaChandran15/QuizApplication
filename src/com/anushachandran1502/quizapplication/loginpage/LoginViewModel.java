package com.anushachandran1502.quizapplication.loginpage;

import com.anushachandran1502.quizapplication.repository.Repository;
import com.anushachandran1502.quizapplication.topic.TopicView;

public class LoginViewModel {
	private LoginView loginview;
	private Repository repo;
	
	public LoginViewModel(LoginView logInView) {
		this.loginview=logInView;
		repo=Repository.getInstance();
	}
	public void isValidUser(String userName, String password) {
		TopicView view=new TopicView();
			view.showTopics();
	}
}
