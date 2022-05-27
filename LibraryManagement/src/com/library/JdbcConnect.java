package com.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcConnect 
{

	public static void main(String[] args) 
	{
		String jdbcurl="jdbc:mysql://localhost:3306/lib";
		String userName="root";
		String password="Sandhiya@0104";
		
		//3rd
		//dynamic values
//		String stuName="Anu";
//		int stuId=1009;
//		String uniName="AU";
//		String bookName="SE";
//		String authourName="sharulatha";
//		int bookId=50008;
//		double bookPrize=680;
		
		//8th
		//Delete
		
		//String stuName="Ramya";
		
		//5th
		//scanner class
		Scanner sc = new Scanner(System.in);
		
		
			
//		System.out.println("Enter the student Name");
//		String stuName=sc.next();
//		System.out.println("Enter the student Id");
//		int stuId=sc.nextInt();
//		System.out.println("Enter the student University Name");
//		String uniName=sc.next();
//		
//
//		System.out.println("Enter the book Name");
//		String bookName=sc.next();
//		System.out.println("Enter the Author Name");
//		String authorName=sc.next();
//		System.out.println("Enter the bookId");
//		int bookId=sc.nextInt();
//		System.out.println("Enter the bookPrice");
//		double bookPrize=sc.nextDouble();
		
		
		
		try
		{
			
			
			//1st
//			Connection con=DriverManager.getConnection(jdbcurl,userName,password);
//			if(con!=null)
//			{
//				System.out.println("Connected.................");
//				con.close();
//			}
			
			
			
			//2nd
//			Connection con=DriverManager.getConnection(jdbcurl,userName,password);
//			
//			String sql="insert into libdetails(stuName,stuId,uniName,bookName,authourName,bookId,bookPrize) "
//					+ "values('Dharshini',1008,'MA','Maths','Agarwal',23451,800)";
//			Statement stmt=con.createStatement();
//			int rows=stmt.executeUpdate(sql);
//			if(rows>0)
//			{
//				System.out.println("A new User has been Inserted");
//			}
//			con.close();
//			
			
			
			
			//3rd
			//dynamic values
			
//			Connection con=DriverManager.getConnection(jdbcurl,userName,password);
//			
//			String sql="insert into libdetails(stuName,stuId,uniName,bookName,authourName,bookId,bookPrize) "
//					+ "values(?,?,?,?,?,?,?)";
//			
//			PreparedStatement stmt=con.prepareStatement(sql);
//			
//			stmt.setString(1, stuName);
//			stmt.setInt(2, stuId);
//			stmt.setString(3, uniName);
//			stmt.setString(4, bookName);
//			stmt.setString(5, authourName);
//			stmt.setInt(6, bookId);
//			stmt.setDouble(7, bookPrize);
//			
//			int rows=stmt.executeUpdate();
//			if(rows>0)
//			{
//				System.out.println("A new User has been Inserted");
//			}
//			con.close();
			
			
			//4th
			//Retrive the data from the database
//			Connection con=DriverManager.getConnection(jdbcurl,userName,password);
//			
//			String sql="select * from libdetails";
//			Statement stmt=con.createStatement();
//			ResultSet rs=stmt.executeQuery(sql);
//			while(rs.next())
//			{
//				String stuName=rs.getString("stuName");
//				String stuId=rs.getString("stuId");
//				String uniName=rs.getString("uniName");
//				String bookName=rs.getString("bookName");
//				String authourName=rs.getString("authourName");
//				String bookId=rs.getString("bookId");
//				String bookPrize=rs.getString("bookPrize");
//				
//				System.out.println(stuName + " , " + stuId + " , " + uniName + " , " + bookName + " , " + authourName + " , " + bookId + " , " + bookPrize);
//				
//			}
//			
//			con.close();
			
			
			//5th
			//Using scanner class
//			Connection con=DriverManager.getConnection(jdbcurl,userName,password);
//			
//			String sql="insert into libdetails(stuName,stuId,uniName,bookName,authourName,bookId,bookPrize) "
//			+ "values('"+stuName+"','"+stuId+"','"+uniName+"','"+bookName+"','"+authorName+"','"+bookId+"','"+bookPrize+"')";
//			Statement stmt=con.createStatement();
//			int rows=stmt.executeUpdate(sql);
//			if(rows>0)
//			{
//				System.out.println("A new User has been Inserted");
//		}
//			con.close();

		    
			
			//6th
			//Update
			Connection con=DriverManager.getConnection(jdbcurl,userName,password);
			String sql="update libdetails set uniName='Deemed' where stuName='Uma'";
			Statement stmt=con.createStatement();
			int rows=stmt.executeUpdate(sql);
			if(rows>0)
			{
				System.out.println("User Details is updated.....");
			}
			con.close();
			
			
			
			//7th****
			//update using prepared statement
//			Connection con=DriverManager.getConnection(jdbcurl,userName,password);
//			String sql="update libdetails set uniName='Deemed' where stuName='Uma'";
//		PreparedStatement stmt=con.prepareStatement(sql);
			
			
			//8th
			//Delete
			
//			Connection con=DriverManager.getConnection(jdbcurl,userName,password);
//			String sql="delete from libdetails where stuName=?";
//		    PreparedStatement stmt=con.prepareStatement(sql);
//		    stmt.setString(1, stuName);
//		    
//		    int rows=stmt.executeUpdate();
//		    if(rows>0)
//		    {
//		    	System.out.println("The Student Information has been Deleted.........");
//		    }
//		    con.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
