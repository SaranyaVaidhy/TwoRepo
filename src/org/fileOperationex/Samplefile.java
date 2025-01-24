package org.fileOperationex;

import java.io.File;
import java.io.IOException;

public class Samplefile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\sheel\\Desktop\\dd");//import file
		boolean folder = f.mkdir();//to create folder
		System.out.println(folder);
		boolean newFile = f.createNewFile();//to crate a file and throws
		System.out.println(newFile);
		boolean checkFile =f.isFile();//to check file is present or not
		System.out.println(checkFile);
		boolean dirFile =f.isDirectory();//to check whether its directory or not
		System.out.println(dirFile);
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		boolean read=f.canRead();//to check wherthere we can read into file
		System.out.println(read);
		
		boolean folder1 = f.mkdir();//to create folder
		System.out.println(folder1);
		boolean multifolder=f.mkdirs();//to create multiple folder
		System.out.println(multifolder);
		boolean execute=f.canExecute();//to check whether we can executee a file
		System.out.println(execute);
		
		
		
		
		
		
		
		
		
		
	}

}
