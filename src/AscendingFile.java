
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//display the files in an ascending order
public interface AscendingFile{ 
	static void methodA() {
		String path="C:\\Users\\91799\\Desktop\\caltech\\";
		File file=new File(path);
		//display operation
		File filename[]=file.listFiles();
		//for-each
		System.out.println("the list of files in asscending order in the "+ path +"is");
		for(File ff:filename) {
			System.out.println(ff.getName());
		}
		
		
	}

}

