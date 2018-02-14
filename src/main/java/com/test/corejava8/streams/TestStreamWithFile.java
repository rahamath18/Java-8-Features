package com.test.corejava8.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamWithFile {

	public static void main(String[] args) {
		
		// java.io.BufferedReader is being used to read a file since JDK 1.1 released 2014
		
		String fileName = "/Users/rahamathullahrahamathullah/Documents/workspace/test/src/com/test/corejava8/streams/test.txt";

		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			
			List<String> list = new ArrayList<>();
			list = stream
					.filter(line -> !line.startsWith("don't")) //1. filter line 3
					.map(String::toUpperCase)				   //2. convert all content to upper case
					.collect(Collectors.toList());			   //3. convert it into a List
			
			list.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
			List<String> list = new ArrayList<>();
			//br returns as stream and convert it into a List
			list = br.lines().collect(Collectors.toList());
			list.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}