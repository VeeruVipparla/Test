package com.jlc.map.intrface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Lab646 {
public static void main(String []args) {
	Map map=new LinkedHashMap<>();
	map.put("eId::", 12345);
	map.put("eFName::", "Veeru");
	map.put("eLName::", "Vipparla");
	map.put("Salary::", 50000);
	map.put("Address::", "Guntur");
	map.put("Gender::", "Male");
	
	System.out.println(map);
	
	Set set=map.entrySet();
	Iterator it=set.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
/*		Object obj=it.next();
		Map.Entry entry=(Entry) obj;
		Object  key=entry.getKey();
		Object  val=entry.getValue();
		System.out.println(key+"--"+val);  */
}
}
}