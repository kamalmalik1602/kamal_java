package javaGradedAssignment8;

import java.io.*;
import java.io.IOException;
public class FileCreator {

	public static void main(String[] args) throws IOException {
		String fileName="MapFiles.txt";
		
		File file=new File(fileName);
       try {
    	   if(file.exists()) {
    		   System.out.println("File Already Exists");
    	   }else {
    		   file.createNewFile();
    		   System.out.println("File Created Successfully");
    	   }
       }catch(IOException e) {
    	   e.printStackTrace();
       }
	}

}
