import java.io.File;
//import java.io.IOException;
import java.util.Scanner;

public interface Deletefile {
	static void methodA(){
		String path="C:\\Users\\91799\\Desktop\\caltech\\";
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the file name to be deleted");
			String filename=sc.next();
			String finalpath=path+filename;
			File file=new File(finalpath);
			file.delete();
		}
		System.out.println("file gets deleted sucessfully");

	}
	

}