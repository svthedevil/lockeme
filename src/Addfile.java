import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public interface Addfile {
	static void methodA(){
		String path="C:\\Users\\91799\\Desktop\\caltech\\";
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the file name to be created");
			String filename=sc.next();
			String finalpath=path+filename;
			//create a file
			File file=new File(finalpath);
			 try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("file gets created sucessfully");
		
	}


		
	}

// hello world

// i want to learn git 
