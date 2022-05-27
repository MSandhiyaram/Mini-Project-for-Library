package com.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class myJDBC 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String stuName="";
		String stuFatherName="";
		String uniName="";
		int stuId;
		int sem;
		String bookName;
		String authourName="";
		double bookPrice;
		int bookId;
		String issueDate="";
		int totBookIssued;
		String retDate="";
		
		System.out.println("stuName:");
		stuName=sc.next();
		System.out.println("stuFatherName:");
		stuFatherName=sc.next();
		System.out.println("uniName:");
		uniName=sc.next();
		System.out.println("stuId:");
		stuId=sc.nextInt();
		System.out.println("sem:");
		sem=sc.nextInt();
		System.out.println("bookName:");
		bookName=sc.next();
		System.out.println("authourName:");
		authourName=sc.next();
		System.out.println("bookPrice:");
		bookPrice=sc.nextDouble();
		System.out.println("bookId:");
		bookId=sc.nextInt();
		System.out.println("issueDate:");
		issueDate=sc.next();
		System.out.println("totBookIssued:");
		totBookIssued=sc.nextInt();
		System.out.println("retDate:");
		retDate=sc.next();
		
		
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/library","root","Sandhiya@0104");  
			  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from library");  
			
			
			while(rs.next())
			{
				stuName = rs.getString("stuName");
				stuFatherName = rs.getString("stuFatherName");
				uniName = rs.getString("uniName");
				stuId = rs.getInt("stuId");
				sem = rs.getInt("sem");
				bookName=rs.getString("bookName");
				authourName = rs.getString("authourName");
				bookPrice = rs.getDouble("bookPrice");
				bookId = rs.getInt("bookId");
				issueDate = rs.getString("issueDate");
				totBookIssued = rs.getInt("totBookIssued");
				retDate = rs.getString("retDate");
			}
			con.close();
			
			System.out.println("stuName"+stuName);
			System.out.println("stuFatherName"+stuFatherName);
			System.out.println("uniName"+uniName);
			System.out.println("stuId"+stuId);
			System.out.println("sem"+sem);
			System.out.println("bookName"+bookName);

			System.out.println("authourName"+authourName);
			System.out.println("bookPrice"+bookPrice);
			System.out.println("bookId"+bookId);
			System.out.println("issueDate"+issueDate);
			System.out.println("totBookIssued"+totBookIssued);
			System.out.println("retDate"+retDate);
			
			
			//String insQuery = "INSERT INTO `foods` (`stuName`, `stuFatherName`, `uniName`, `stuId`,'sem','bookName','authourName','bookPrice','bookId','issueDate','') VALUES ('"+ITEM_ID+"', '"+ITEM_NAME+"', '"+ITEM_UNIT+"', '"+COMPANY_ID+"');";

		
		
		String insQuery="insert into libraryDetails values('Sandhiya', 'Murugan', 'Anna University',1, 1, 'Compuer Architecture', 'R S Aggarwal', 390, 420421, 10-02-2022, 2, 15-02-2022 );";
				
				stmt.executeUpdate(insQuery);
	}
		catch(Exception e)
		{ 
			System.out.println(e);
		} 

	}

}
