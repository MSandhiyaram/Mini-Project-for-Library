package com.library;
import java.util.*;
import java.util.Scanner;

public class LibraryMain extends JdbcConnect
{

	public static void main(String[] args) 
	{
		
		String r="";
		//char r='y';
		Scanner scan = new Scanner(System.in);
		do
		//while(r=='y' || r=='Y')
		{
			
			System.out.println("******Library Management System******");
			Library sd = new Library();
			System.out.println("Enter Student's name: ");
			String name = scan.nextLine();
			System.out.println("Enter Student's Father name: ");
			String fname = scan.nextLine();
			System.out.println("Enter University name: ");
			String univ_name = scan.nextLine();
			
			System.out.println("Enter User Id: ");
			int user_id = scan.nextInt();
			
			
			System.out.println("In which semester do you study: ");
			int sem = 0;
			sem=scan.nextInt();
			System.out.println("Student Details");
			System.out.println("Student Name: "+name);
			System.out.println("Student Father's Name: "+fname);
			System.out.println("University Name: "+univ_name);
			System.out.println("User Id: "+user_id);
			System.out.println("Semester: "+sem);
			
			System.out.println("Press 1 to add Book");
			System.out.println("Press 2 to issue a Book");
			System.out.println("Press 3 to return a Book");
			System.out.println("Press 4 to print complete issue details");
			System.out.println("Press 5 to exit");
			System.out.println("Enter any Number: ");
			while(scan.hasNext())
			{
				int num=0;
			 num = scan.nextInt();
			System.out.println("**********");
			switch(num)
			{
			case 1:
				Library library1 = new Library();
				library1.add();
				
				break;
			case 2:
				Library library2 = new Library();
				library2.issue();
				break;
			case 3:
				Library library3 = new Library();
				library3.ret();
				break;
			case 4:
				Library library4 = new Library();
				library4.detail();
				break;
			case 5:
				Library library5 = new Library();
				library5.exit();
				break;
			default:
				System.out.println("Invalid number");
			}
			}
			System.out.println("you want to select next option Y/N");
			
			//r="y";
			//r = scan.next();
			//.charAt(0);
			
		
			//System.out.println("check "+r);
			
//			if(r=='n'||r=='N')
//			{
//				System.exit(0);
//			}
//			else
//			{
//				System.out.println("you want to select next option Y/N");
//			}
			System.out.println("r equa...sfrweifdgaaa"+scan.hasNext());
			while(scan.hasNext())
			{
			r = scan.next();
			System.out.println("r equals=="+r);
			
			}
			System.out.println("r equa"+r);
		
		}while(r.equals("y")||r.equals("n"));
		
		if(r.equals("y")||r.equals("n")||r.equals("Y")||r.equals("N")) 
		{
			Library lib = new Library();
			lib.exit();
		}
		//scan.close();
		
		
		
		
	}

	}


