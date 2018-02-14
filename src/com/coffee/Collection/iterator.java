package com.coffee.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<String>();
		s.add("liu");
		s.add("liu1");
		s.add("liu2");
		s.add("liu3");
		s.add("liu4");
		s.add("liu5");
		Iterator<String> iter=s.iterator();
		while (iter.hasNext()) {
			String ss=iter.next();
			if ("liu1".equals(ss)) {
				iter.remove();
			} else {
				System.out.println(ss);
			}
			
		}
	}

}
