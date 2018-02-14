package com.test.corejava8.streams;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestScannerWithFile {

	public static void main(String[] args) {
		// java.util.Scanner is being used to read a file since JDK 1.5 released September 30, 2004
		
		String fileName = "/Users/rahamathullahrahamathullah/Documents/workspace/test/src/com/test/corejava8/streams/test.txt";

		try (Scanner scanner = new Scanner(new File(fileName))) {

			while (scanner.hasNext()){
				System.out.println(scanner.nextLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
