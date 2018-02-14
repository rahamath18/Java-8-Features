package com.test.corejava8.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReaderWithFile {

	public static void main(String[] args) {

		// java.io.BufferedReader is being used to read a file since JDK 1.1 released February 19, 1997
		
		String fileName = "/Users/rahamathullahrahamathullah/Documents/workspace/test/src/com/test/corejava8/streams/test.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
