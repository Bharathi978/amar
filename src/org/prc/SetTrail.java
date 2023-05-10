package org.prc;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTrail {
public static void main(String[] args) {
	Set s = new LinkedHashSet();
	s.add(10);
	s.add(20);
	s.add(40);
	s.add(30);
	s.add(50);
	
	System.out.println(s);
	System.out.println("=================================");
	for (Object t : s) {
		System.out.println(t);
		
	}
	System.out.println("=================================");
	
System.out.println(s.size());	
System.out.println("=================================");

System.out.println(s.contains(20));
System.out.println("=================================");

s.remove(30);
System.out.println(s);
System.out.println("=================================");


		
	
	
	
	
	
	
	
}
}
