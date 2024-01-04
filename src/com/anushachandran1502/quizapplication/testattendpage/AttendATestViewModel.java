package com.anushachandran1502.quizapplication.testattendpage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.anushachandran1502.quizapplication.dto.TestAttendCandidate;
import com.anushachandran1502.quizapplication.repository.Repository;

public class AttendATestViewModel {
	private AttendATestView view;
	private Repository repo;
	public AttendATestViewModel(AttendATestView attendATestView) {
		view=attendATestView;
		repo=Repository.getInstance();
	}
	public AttendATestViewModel() {
	}
	public boolean verification(String code,String name, String email) {
		AttendATestViewModel model=new AttendATestViewModel();
		boolean nameValid=model.isValidName(name); 
		boolean emailValid=model.isValidEmail(email);
		if( repo.isValidCode(code) && nameValid && emailValid)
		{
			TestAttendCandidate test=new TestAttendCandidate(code,name,email);
			return true;
		}
		return false;
	}
	private boolean isValidName(String name) {
		if(!name.equals("")&&name.length()>=1 && name.length()<=100)
		{
			return true;
		}
		return false;
	}
	
	private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
	}
	
}
