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
	public boolean isValidUser(String userName, String password) {
		int id=repo.isValidUserQA( userName,password);
		if(id==0)
		{
			return false;
		}
		this.loginview.setCurrentUser(id);
		return true;
	}
}
