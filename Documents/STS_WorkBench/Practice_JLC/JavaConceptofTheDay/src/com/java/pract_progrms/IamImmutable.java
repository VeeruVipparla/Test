package com.java.pract_progrms;

import java.util.HashMap;
import java.util.Map.Entry;

public final class IamImmutable {
	  private int i;
	  private String s;
	  private HashMap<String, String> h;

	  public IamImmutable(int i, String s, HashMap<String, String> h) {
	    this.i = i;
	    this.s = s;

	    this.h = new HashMap<String, String>();
	    for (Entry<String, String> entry: h.entrySet()) {
	      this.h.put((entry.getKey()), entry.getValue());
	    }
	  }

	  public int getI() {
	    return i;
	  }

	  public String getS() {
	    return s;
	  }

	  public HashMap<String, String> getH() {
	    return h;
	  }
	}