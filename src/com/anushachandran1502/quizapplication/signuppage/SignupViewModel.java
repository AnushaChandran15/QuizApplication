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
	public boolean isValidUser(String userName, String password) throws SQLException {
		TopicView topic=new TopicView();
		int id=0;
		if(!userName.equals("")&&(userName.length()>=1 &&userName.length()<=100))
		{
			if(password.length()==8)
			{
				boolean isAvaliable=repo.insertUser(new Admin(userName, password));
					id=repo.isValidUserQA( userName,password);
					if(id==0)
				{
					return false;
				}
				 this.view.setCurrentUser(id);
			return true;
			}
		}
	return false;
}
	}

