import java.io.File;
//import java.io.IOException;
import java.util.Scanner;


public class Searchfile {
  static void methodA() {
	  String path="C:\\Users\\91799\\Desktop\\caltech\\";
		try (Scanner sc = new Scanner(System.in)) {
			String filenamesearch=sc.next();
			File file=new File(path);
			//display operation
			File filename[]=file.listFiles();
			//for-each
			int flag=0;
			for(File ff:filename) {
				if(ff.getName().equals(filenamesearch)) {
					flag=1;
					break;
				}
				else {
					flag=0;
				}
			}
			
			if(flag==1) {
				System.out.println("file is found");
				System.out.println("file name --> " + filenamesearch);
			}
			else {
				System.out.println("file is not found");
			}
		}
		
  }
  
}
