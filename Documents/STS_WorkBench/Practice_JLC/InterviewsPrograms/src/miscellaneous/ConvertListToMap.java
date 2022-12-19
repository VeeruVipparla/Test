package miscellaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertListToMap {

	public static void main(String[] args) {
		
		List<Students> list=new ArrayList<>();
		//Students d1=new Students(100, "Veeru");
		//Students d2=new Students(200,"Punith");
		//list.add(d1);
		//list.add(d2);
		list.add(new Students(1, "Rahul"));
		list.add(new Students(2, "Shami"));
		list.add(new Students(3, "Siraj"));
		
		Map<Integer, String> map=new HashMap<>();
		
		
		for(Students d:list) {
		map.put(d.sid, d.name);
		}
		
		System.out.println("inserted into Map :: --->>> "+map);
		
		Set<Map.Entry<Integer, String>> s=map.entrySet();
		
		for (Entry<Integer, String> entry : s) {
			
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		/*
		 * for(Map.Entry<Integer, String> entry: map.entrySet()) {
		 * 
		 * }
		 */
		
		
		

	}

}
