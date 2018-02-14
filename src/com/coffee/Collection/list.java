package com.coffee.Collection;


import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list=new ArrayList<String>();//vector
list.add("liu");
list.add("wei");
list.add("liu");
for (int i = 0; i < list.size(); i++) {
	System.out.println(list.get(i));
}
System.out.println(list.toString());
System.out.println(list.indexOf("wei"));
list.removeAll(list);
System.out.println(list.toString());

	}

}
