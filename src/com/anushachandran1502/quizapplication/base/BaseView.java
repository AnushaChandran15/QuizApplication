package com.anushachandran1502.quizapplication.base;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.anushachandran1502.quizapplication.loginpage.LoginView;
import com.anushachandran1502.quizapplication.signuppage.SignupView;
import com.anushachandran1502.quizapplication.testattendpage.AttendATestView;

public class BaseView {

	public void start() {
      SignupView signupView = new SignupView();
      LoginView loginView = new LoginView();
      AttendATestView test=new AttendATestView();
          System.out.println("\t\t\t Welcome");
      	
      System.out.println("\t\t\t---------");
       
      System.out.println();
      LocalDate currentDate = LocalDate.now();

      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
String formattedDate = currentDate.format(formatter);
System.out.println("\t\t\t\t\t\t\t\t | Date: " + formattedDate +" |");
	try
	{
      int choice=0;
      Scanner scanner=new Scanner(System.in);
      System.out.println("1.SignUp\n2.Login\n3.Attend a Test");
      choice=scanner.nextInt();
      boolean terminate=true;
      while(terminate)
      {
      	switch(choice)
      	{
      		case 1: signupView.signup();
      			break;
      		case 2:
      			loginView.login();
      			break;
      		case 3:
      			terminate=false;
      			test.getUserDeatils();
      			break;
      		default:
      			System.out.println("Wrong option select...");
      			break;
      	}
      }
	}
	catch(Exception e)
	{
		e.getStackTrace();
	}
}

}
