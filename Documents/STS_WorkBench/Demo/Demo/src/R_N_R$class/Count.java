package R_N_R$class;

import java.io.FileInputStream;
import java.io.IOException;

 class Count{

	public static void main(String args[]) throws IOException 
	{
		//vars
	int ch;
	boolean prev= true;
	// counters
	int char_count=0;
	int word_count=0;
	int line_count=0;
	
	//attach the file args[0] to fileInputstream to read data
	//C:\Users\veeru\Documents\STS_WorkBench\Demo\Demo\resource\test.txt
	FileInputStream fin= new FileInputStream(args[0]);
	
	//read characters from the file till the end
	while((ch= fin.read()) != -1)
	{
		if(ch != ' ') ++char_count;
        if(!prev && ch== ' ') ++word_count;
        //dont count if previous char is space
       if(ch == ' ') prev =true; else prev = false;
       if( ch =='\n')++line_count;
	}
	//display the count of characters, word and lines
	char_count -= line_count*2;
	word_count += line_count;
	System.out.println("No.of chara="+char_count);
	System.out.println("No.of word="+word_count);
	System.out.println("No.of line="+line_count);
    		   
       //close the file
	fin.close();
		
	}

	}


