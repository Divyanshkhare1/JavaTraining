package com.mphasis.arrays;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pattern  pattern = Pattern.compile("[abc]");
		
	Matcher matcher = 	pattern.matcher("a1b2c3");
	
	while(matcher.find()) {
		System.out.println(matcher.start() + "" + matcher.group());
		
	}
	}

}
