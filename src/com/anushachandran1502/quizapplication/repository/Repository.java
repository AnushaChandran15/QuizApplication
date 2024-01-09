package com.anushachandran1502.quizapplication.repository;


import java.sql.*;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.anushachandran1502.quizapplication.dto.Admin;
import com.anushachandran1502.quizapplication.dto.QuizQuestion;

public class Repository {
	static Repository repository;
	static Connection con;
	private Repository()
	{
		 String url = "jdbc:mysql://localhost:3306/quizquestion";
		 String userName = "Anusha";
		 String passWord = "";
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 this.con = DriverManager.getConnection(url, userName, passWord);
		 }
		 catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Repository getInstance()
	{
		if(repository==null)
		{
			repository=new Repository();
		}
		return repository;
	}
	public boolean addQuestionsToDb(List<QuizQuestion> questionList,String code, int current) throws SQLException {
		PreparedStatement pre;
		for(int i=0;i<questionList.size();i++)
		{
			String query="Insert into questions values(?,?,?,?,?,?)";
			pre=con.prepareStatement(query);
			pre.setString(1, code);
			pre.setString(2, questionList.get(i).getQuestion());
		//	String jsonValue = "[" + String.join(",",  questionList.get(i).getOption()) + "]";
			pre.setString(3, questionList.get(i).getOption());
			pre.setString(4, questionList.get(i).getCorrectAns());
			pre.setInt(5, current);
			pre.setString(6, "Java1");
			int rowAffected=pre.executeUpdate();
			return rowAffected>0?true:false;
		}
		return false;	
	}
	public boolean insertUser(Admin admin) throws SQLException {
		String sql="select*from users where user_Name=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1, admin.getuserName());
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next())
        {
            System.out.println("Username '"  + "' already exists.");
        	return false;
        } else {
            System.out.println("Username '" +  "' is available.");
            String query = "INSERT INTO users (user_Name, password) VALUES (?, ?)";
            PreparedStatement preparedStatement1 = con.prepareStatement(query);
            preparedStatement1.setString(1, admin.getuserName());
            preparedStatement1.setString(2, admin.getPassword());
            preparedStatement1.executeUpdate();
            return true;
           
        }
       // return false;
	}
	public int isValidUserQA(String username, String password) {
		int id = 0;
	    try {
	        String query = "SELECT * FROM users WHERE user_Name = '"+username+"' AND password = '"+password+"'";
	        Statement s = con.createStatement();
	        ResultSet rs = s.executeQuery(query);
	        while(rs.next())
	        {
	        	id = rs.getInt("id");
	        }
	        return id;
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return 0;
	}
	public String getTopicNameInDB(int topicNo) {
		String topic="";
	    try {
	        String query = "SELECT topics FROM  topic_table WHERE id='"+topicNo+"'";
	        Statement s = con.createStatement();
	        ResultSet rs = s.executeQuery(query);
	        while(rs.next())
	        {
	        	topic=rs.getString(topicNo);
	        }
	       return topic;
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
		return null;
	}
	public boolean isValidCode(String code) {
		String topic="";
	    try {
	        String query = "SELECT Exam_codes FROM users  WHERE id='"+code+"'";
	        Statement s = con.createStatement();
	        ResultSet rs = s.executeQuery(query);
	        while(rs.next())
	        {
	        	if(query.contains(code))
	        	{
	        		return true;
	        	}
	        }
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	}
		return false;
	}
	public boolean insertExamCodeUserID(int current, String code) throws SQLException {
		String sql="update users set exam_codes=? where id=?";
		PreparedStatement pre;
			pre = con.prepareStatement(sql);
		pre.setInt(1,current);
		pre.setString(2,code);
		int rowAffected=pre.executeUpdate();
		return rowAffected>0?true:false;
	}
}



//package com.anushachandran1502.quizapplication.repository;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import com.anushachandran1502.quizapplication.dto.QuizQuestion;
//
//public class QuizRepository {
//	static QuizRepository repository;
//	Map<String,List<QuizQuestion>> map=new HashMap<>();
//	
//	private QuizRepository()
//	{
//	map.put("Java",Arrays.asList(new QuizQuestion[]{new QuizQuestion("Which method can be used to find the length of a string?","1.getSize()\n2.length\n3.length()\n4.len()",(byte)3),new QuizQuestion("Which operator can be used to Compare two Values?","1. ==\n2.>>\n3.=\n4.><",(byte)1),new QuizQuestion("Array index start with ?","1.1\n2.-1\n3.0\n4.2",(byte)3),new QuizQuestion("Which method can be used to find the highest value of x and y?","1.Math.max(x,y)\n2.Math.maximum(x,y)\n3.Math.largest(x,y)\n4.Math.maxNum(x,y)",(byte)1),
//	new QuizQuestion("Which Java keyword is used to implement multiple inheritance?","1.implements\n2.extends\n3.interface\n4.abstract",(byte)3),
//	new QuizQuestion("What is the purpose of the break statement in Java?","1.To terminate the program.\n2.To exit the loop or switch statement.\n3.To skip the current iteration of a loop.\n4.To jump to a specific label.",(byte)2)}));
//	map.put("Java Script",Arrays.asList(new QuizQuestion[]{new QuizQuestion("Inside Which HTML element do we put the JavaScript?","1.<javascript>\n2.<script>\n3.<js>\n4.<scripting>",(byte)2),new QuizQuestion("How do you create a function in javascript?","1.function:myfunction()\n2.function=myfunction()\n3.function myfunction()\n4.myfunction()",(byte)3),new QuizQuestion("How do you round the number 7.25,to the nearest integer?","1.Math.round(7.25)\n2.Math.rnd(7.25)\n3.rnd(7.25)\n4.round(7.25)",(byte)1),new QuizQuestion("How do you declare a javascript variable?","1.variable name;\n2.var name;\n3.v name;\n4.varchar name;",(byte)2)}));
//	}
//	public static QuizRepository getInstance()
//	{
//		if(repository==null)
//		{
//			repository=new QuizRepository();
//		}
//		return repository;
//	}
//	public List<QuizQuestion> getTheQuestions(String topic) {
//		List<QuizQuestion> list=new ArrayList<QuizQuestion>();
//		for(QuizQuestion question:map.get(topic))
//		{
//			list.add(question);
//		}
//		return list;
//	}
//
//}
