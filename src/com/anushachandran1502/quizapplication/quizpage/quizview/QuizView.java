//package com.anushachandran1502.quizapplication.quizpage.quizview;
//
//import java.util.List;
//import java.util.Scanner;
//
//import com.anushachandran1502.quizapplication.dto.QuizQuestion;
//import com.anushachandran1502.quizapplication.quizpage.quizviewmodel.QuizViewModel;
//
//public class QuizView {
//	private QuizViewModel viewModel;
//
//	public QuizView() {
//		viewModel = new QuizViewModel(this);
//	}
//
//	public void prmStart() {
//		System.out.println(".......Quiz Test.......");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter Your Name ");
//		String name = scanner.nextLine();
//		System.out.println("***********************");
//		System.out.println("Choose the Quiz Topic");
//		System.out.println("***********************");
//		System.out.println("1.Java");
//		System.out.println("2.Java Script");
//		System.out.println("3.Html/Css");
//		int choice = scanner.nextInt();
//		String topic = "";
//	
//		switch (choice) {
//		case 1:
//			topic = "Java";
//			break;
//		case 2:
//			topic = "Java Script";
//			break;
//		case 3:
//			topic = "Html/Css";
//			break;
//		default:
//			System.out.println("Inavlid");
//		}
//		int correctAns = 0;
//		
//		List<QuizQuestion> ques = null;
//		ques = viewModel.getTheQuizQuestions(topic);
//		int total=ques.size();
//
//		correctAns = 0;
//		
//		int i = 1;
//		for (QuizQuestion q : ques) {
//			System.out.println(i + "." + q.getQuestion());
//			i++;
//			System.out.println(q.getOption());
//
//			byte ans = 0;
//
//			try {
//				do{
//					System.out.print("Enter Your option : ");
//					ans = scanner.nextByte();
//					if (ans <= 0 || ans > 4) {
//						System.out.println("you choosed incorrect option");
//					}
//				} while (ans < 0 || ans > 4);
//			} 
//			catch (Exception e) {
//				System.out.println("Invalid input");
//				scanner.nextLine();
//		}
//
//			boolean crt = QuizViewModel.isCorrect(ans, q.getCorrectAns());
//			if (crt)
//				correctAns++;
//		}
//		scanner.close();
//		System.out.println("Hello," + name + " Your,");
//		String result = viewModel.yourLevel(correctAns);
//		System.out.println("Correct Answer : " + correctAns);
//		System.out.println("Wrong Answer :" + (total- correctAns));
//		System.out.println(result);
//		System.out.println("Thank you.....");
//
//	}
//
//	}
