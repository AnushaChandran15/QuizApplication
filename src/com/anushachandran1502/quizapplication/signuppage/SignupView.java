package com.anushachandran1502.quizapplication.signuppage;

import java.sql.SQLException;
import java.util.Scanner;

import com.anushachandran1502.quizapplication.signuppage.SignupViewModel;

public class SignupView {
	private SignupViewModel signup;

	public SignupView() {
		signup=new SignupViewModel(this);
	}

	public void signup() throws SQLException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a User Name");
		String userName=scanner.nextLine();
		System.out.println("Enter a Password only 8 Characters");
		String password=scanner.nextLine();
		scanner.nextLine();
		signup.isValidUser(userName,password);
	}
}
