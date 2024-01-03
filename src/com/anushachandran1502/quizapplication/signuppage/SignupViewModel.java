package com.anushachandran1502.quizapplication.signuppage;

import java.sql.SQLException;

import com.anushachandran1502.quizapplication.dto.Admin;
import com.anushachandran1502.quizapplication.repository.Repository;
import com.anushachandran1502.quizapplication.topic.TopicView;

public class SignupViewModel {
	SignupView view;
	Repository repo;
	public SignupViewModel(SignupView signupView) {
		view=signupView;
		repo=Repository.getInstance();
	}
	public void isValidUser(String userName, String password) throws SQLException {
		TopicView topic=new TopicView();
		if(!userName.equals("")&&(userName.length()>=1 &&userName.length()<=100))
		{
			if(password.length()==8)
			{
				
				repo.insertUser(new Admin(userName,password));
			}
		}
		else
		{
			view.signup();
		}
  //topic.showTopics();
	}
}
