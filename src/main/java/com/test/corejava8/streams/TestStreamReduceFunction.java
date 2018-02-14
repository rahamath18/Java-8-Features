package com.test.corejava8.streams;

import java.util.ArrayList;
import java.util.List;

//import org.junit.Test;

public class TestStreamReduceFunction {

	public static void main(String[] args) {
		listToString();
	}
	
	//@Test
    public static void listToString() {
        List<String> mascots = new ArrayList<>();
        mascots.add("duke");
        mascots.add("juggy");

        String expected = "duke,juggy";
        String actual = mascots.stream().
                reduce((t, u) -> t + ", " + u).
                get();
        System.out.println(actual);
        //assertThat(actual, is(expected));
    }

}
