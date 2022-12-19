package com.interview.practice;

public class WordCountEx {

	static int WordCount(String str) {
		int count = 0;
		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (((i > 0) && (ch[i] !=' ') && (ch[i - 1] ==' ')) || ((ch[0] !=' ') && (i == 0)))
				
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		String str = "Veeru is A Good/Bad";
		System.out.println(WordCount(str));

	}

}
