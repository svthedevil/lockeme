import java.util.Scanner;
import java.io.*;
public class File {
	public File(String finalpath) {
	}

	public static void main(String[] args) throws IOException {
		System.out.println("LOCKME.COM");
		System.out.println("By Sachin Verma");
		System.out.println(" 1 --> Show all files in ascending order");
		System.out.println(" 2 --> Sub menu");
		System.out.println("        1 --> Add the files ");
		System.out.println("        2 --> Delete the files ");
		System.out.println("        3 --> Search the files ");
		System.out.println("        4 --> EXIT ");
		System.out.println(" 3 --> Exit the programme");
		System.out.println("enter the option no. to proceed");
		
		try (Scanner sc = new Scanner(System.in)) {
			int option = sc.nextInt();
			
			switch (option) {
			  case (1):
			    System.out.println("Files in the folder are arranged in ascending order below");
			   AscendingFile.methodA();
			    break;
			  case (2):
			  {System.out.println("enter the Sub menu option no. to proceed");
				  int option1 = sc.nextInt();
				  switch (option1) {
				  case (1):
					  Addfile.methodA();
					  break;
				  case (2):
					  Deletefile.methodA();
					   break;
				  case (3):
					    System.out.println("Enter the file name to search");
				      Searchfile.methodA();
					    break;
				  case (4):
					    System.out.println("Successfully exit");
				  System.exit(0);
					    break;
				  default:
					  
				    System.out.println("Invalid Selection");		  
			  }
			    break;
			  }
			  case (3):
				  System.out.println("Successfully exit ");
				  System.exit(0);
			  
				    break;
			  default:
				  
			    System.out.println("Invalid Selection");
			}
		}
				
	}

	
	}



