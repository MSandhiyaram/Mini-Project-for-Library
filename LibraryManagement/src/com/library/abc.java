package com.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class abc 
{

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
	try
	{
		
		Library1 lib=new Library1();
		lib.getDetails();
		lib.insertlibrary();
		

	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

   }
}


class Library1
{
	
	private String stuName;
	private String fname;
	private String univName;
	private int stuId;
	private String bookName;
	private double bookPrize;
	private int bookNo;
	private int bookId;
	
	public void getDetails()
	{
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("******Library Management System******");
	
	System.out.println("Enter Student's name: ");
	 stuName = scan.next();
	System.out.println("Enter Student's Father name: ");
	fname = scan.next();
	System.out.println("Enter University name: ");
	 univName = scan.next();
	
	System.out.println("Enter stuId Id: ");
	 stuId = scan.nextInt();
	System.out.println("Enter Book Name: ");
	 bookName = scan.next();
	System.out.println("Enter Book Price: ");
	 bookPrize = scan.nextDouble();
	System.out.println("Enter Book No: ");
	 bookNo = scan.nextInt();
	System.out.println("Enter Book ID: ");
	 bookId = scan.nextInt();
	
	}
	
	public void insertlibrary() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");  
		System.out.println("myConnection.....................");
		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/library1","root","Sandhiya@0104");  
		//here sonoo is database name, root is username and password  
		//Statement stmt=con.createStatement();

		//dbmsconnection dbmsconnect=new dbmsconnection("jdbc:mysql://localhost:3306/library1","root","Sandhiya@0104");
		//Connection con = dbmsconnect.getConnection();
		String sql="insert into libraryDetails(stuName,fName,uniName,stuId,bookName,bookPrize,bookNo,bookId) "
			+ "values(????????)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1,stuName);
		stmt.setString(2,fname);
		stmt.setString(3,univName);
		stmt.setInt(4,stuId);
		stmt.setString(5,bookName);
		stmt.setDouble(6,bookPrize);
		stmt.setInt(7,bookNo);
		stmt.setInt(8,bookId);
		stmt.execute();
		System.out.println("Record inserted successfully");
		con.close();
		
	}
}

class dbmsconnection
{
	String url;
	String username;
	String password;
	
	public dbmsconnection(String url, String username, String password) 
	{
		
		this.url = url;
		this.username = username;
		this.password = password;
	}


	public Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		Connection con=null;
		//Class.forName("jdbc:mysql://localhost:3306/library1").newInstance();
		con= DriverManager.getConnection("url,username,password"); 
		System.out.println("Connection Established Successfully");
		return con;
		}
	public void closeConnection(Connection con,Statement stmt) throws SQLException
	{
		stmt.close();
		con.close();
		System.out.println("The connection is closed");
	}
	
}

