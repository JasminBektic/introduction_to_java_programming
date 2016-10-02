package binary_IO;

	/*
	 * @author Jasmin Bektic
	 * 
	 * 
	 * Suppose you want to back up a huge file (e.g., a 10-GB AVI file) to a CD-R. You can achieve it by splitting the 
	 * file into smaller pieces and backing up these pieces separately. Write a utility program that splits a large file 
	 * into smaller ones using the following command: java Exercise17_10 SourceFile numberOfPieces The command creates the files 
	 * SourceFile.1, SourceFile.2, . . . , SourceFile.n, where n is numberOfPieces and the output files are about the same size.
	 */

import java.io.*;

public class Exercise17_10 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf1 = new RandomAccessFile("d:\\" + args[0], "r");
		int num = Integer.valueOf(args[1]);
		
		//Determine the size of files
		long size = raf1.length() / num;
		long pointer = 0;
		String[] split = args[0].split("\\.");
		RandomAccessFile raf2 = null;
		
		//Start reading data at pointer = 0
		for (int i = 1; i <= num; i++) {
			raf1.seek(pointer);
			
			//Read data into byte array
			byte[] data = new byte[(int) size];
			raf1.read(data);
			raf2 = new RandomAccessFile("d:\\" + split[0] + "_" + i + "." + split[1], "rw");
			raf2.write(data);
			pointer += size;	//Set new pointer
		}
		raf1.close();
		raf2.close();
	}
}
