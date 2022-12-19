package com.veeru.java.collection;

class StudentOne implements Comparable{
	int sid;
	String name;
	StudentOne (int sid, String name){
		this.sid= sid;
		this.name=name;
	}
	public int compareTo (Object obj) {
		if (obj instanceof StudentOne) {
		StudentOne st= (StudentOne)obj;
		//return this.sid-st.sid;
		return this.name.compareTo(st.name);
		}
		return 0;
	}
	public String toString() {
		return sid + "\t"+name;
		
			
		}
	}

