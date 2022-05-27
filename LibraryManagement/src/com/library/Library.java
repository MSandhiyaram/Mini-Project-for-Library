package com.library;

import java.util.Scanner;

public class Library extends JdbcConnect
{

	static String book_name , issue_date, return_date;
	static int book_id , tot_issue_date;
	void add()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Book Name: ");
		String name = scan.nextLine();
		System.out.println("Enter Book Price: ");
		double book_prize = scan.nextDouble();
		System.out.println("Enter Book No: ");
		int book_no = scan.nextInt();
		
		System.out.println("Details of Book");
		System.out.println("Book Name: "+name);
		System.out.println("Book Price : "+book_prize);
		System.out.println("Book No : "+book_no);
		
		//scan.close();
		
	}
	void issue()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Book Name: ");
		book_name = scan.nextLine();
		System.out.println("Enter Book ID: ");
		book_id = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Issue Date: ");
		String issue_date = scan.nextLine();
		System.out.println("Total number of Books Issued: ");
		int tot_issue_date = scan.nextInt();
		scan.nextLine();
		System.out.println("Return book date: ");
		String return_date = scan.nextLine();
		
		//scan.close();
	}
	int getId()
	{
		return book_id;
	}
	void ret()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Student Name: ");
		String name = scan.nextLine();
		System.out.println("Enter Book Id: ");
		int book_Id = scan.nextInt();

		if(book_id == book_Id)
		{
			System.out.println("*********Total Details********");
			System.out.println("Book Name :: "+Library.book_name);
			System.out.println("Book Id :: "+Library.book_id);
			System.out.println("Issue Date :: "+Library.issue_date);
			System.out.println("Total number of Books Issued :: "+Library.tot_issue_date);
			System.out.println("Book Return Date :: "+Library.return_date);
		}
		else
		{
			System.out.println("Wrong ID, please enter correct ID");
		}
		//scan.close();
	}
	void detail()
	{
		System.out.println("Book Name :: "+Library.book_name);
		System.out.println("Book Id :: "+Library.book_id);
		System.out.println("Issue Date :: "+Library.issue_date);
		System.out.println("Total number of Books Issued :: "+Library.tot_issue_date);
		System.out.println("Book Return Date :: "+Library.return_date);
	}
	void exit()
	{
		System.exit(0);
	}
}


