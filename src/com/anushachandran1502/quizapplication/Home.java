package com.anushachandran1502.quizapplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.anushachandran1502.quizapplication.base.BaseView;
import com.anushachandran1502.quizapplication.loginpage.LoginView;
import com.anushachandran1502.quizapplication.signuppage.SignupView;

public class Home {

    public Home() {
    	
    }
    public static void main(String[] args) {
    	BaseView baseview=new BaseView();
    	baseview.start();
    }
}
