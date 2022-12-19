package com.java8.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEmpty {

	public static void main(String[] args) {
		
		 Stream s=Stream.empty();
		 
		 System.out.println(s.count());//0

	}

}
