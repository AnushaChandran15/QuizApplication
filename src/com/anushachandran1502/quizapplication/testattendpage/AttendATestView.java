package com.anushachandran1502.quizapplication.testattendpage;

import java.util.Scanner;

public class AttendATestView {
	private AttendATestViewModel viewModel;
	public AttendATestView()
	{
		viewModel=new AttendATestViewModel(this);
	}

	public void start() {
		Scanner scanner=new Scanner(System.in);
		AttendATestView view=new AttendATestView();
		boolean terminate=true;
		while(terminate)
		{
		System.out.println("Enter the Code");
		String code=scanner.nextLine();
		
		System.out.println("Enter the Your Name");
		String name=scanner.nextLine();
		System.out.println("Enter the Email_Id");
		String email=scanner.nextLine();
			boolean valid=viewModel.verification(code,name,email);
			if(valid)
			{
				terminate=false;
			}
		}
	}
}
