package com.anushachandran1502.quizapplication.loginpage;

import java.util.Scanner;


public class LoginView {
	private LoginViewModel loginViewModel;
	
	public LoginView()
	{
		 loginViewModel = new LoginViewModel(this);
	}

	public void isvalidUser() {
	
	}

	public void login() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a User Name");
		String userName=scanner.nextLine();
		System.out.println("Enter a Password only 8 Characters");
		String password=scanner.nextLine();
		
		//String isValid=loginViewModel.isValidUser(userName,password);
		loginViewModel.isValidUser(userName,password);
	}

}
