package com.notebookpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IntergerOccurence {
	
	public static void main(String[] args) {
		//int[]input=new int[] { 1,4,5,2,3,5,1,6,4,7,1,3,6,8,2,5};
		int[]input= { 1,4,5,2,3,5,1,6,4,7,1,3,6,8,2,5};
		Map<Integer, Integer>countMap=new HashMap<Integer, Integer>();
		for(int i=0;i<input.length; i++) {
			int key=input[i];
			if(countMap.containsKey(key)) {
				int count=countMap.get(key);
				count++;
				countMap.put(key, count);
			}
			else {
				countMap.put(key, 1);
			}
		}
		for(Entry<Integer, Integer>val:countMap.entrySet()){
			System.out.println(val.getKey()+" occurs "+val.getValue()+"time(s)");
		}
	}

}
