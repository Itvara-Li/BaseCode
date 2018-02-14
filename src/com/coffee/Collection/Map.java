package com.coffee.Collection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.Map<Integer, String> map=new HashMap<Integer, String>();
map.put(1, "liu");
map.put(2, "liu1");
map.put(3, "liu2");
map.put(4, "liu3");
map.put(5, "liu4");
map.put(6, "liu5");
map.put(7, "liu6");
Set<Integer> i=map.keySet();
Iterator<Integer> s=i.iterator();
while (s.hasNext()) {
	Integer integer = (Integer) s.next();
	System.out.println(integer);
}

Collection<String> collection=map.values();
Iterator<String> xIterator=collection.iterator();
while (xIterator.hasNext()) {
	String string = (String) xIterator.next();
	System.out.println(string);
}
//if (map.containsKey(9)) {
//	
//} else {
//
//}
//	}
	}
}
