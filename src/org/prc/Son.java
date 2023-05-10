package org.prc;

import java.util.ArrayList;
import java.util.List;

public class  Son {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("bharathi");
		a.add('g');
		a.add(29);
		a.add("lord");
		a.add('g');
		
		System.out.println(a);
		System.out.println(a.size());
		
	
		for (int i =0; i<a.size(); i++) {
			
				System.out.println(a.get(i));
			
			
		}
		System.out.println("=========================================");
	for (Object v : a) {
		System.out.println(v);
	}
	System.out.println("=========================================");
	
	
	a.add(4, "muthu");
	System.out.println(a);
	System.out.println("=========================================");
	
	a.remove(4);
	System.out.println(a);
	System.out.println("=========================================");
	
	a.set(3, "subhu");
	System.out.println(a);
	System.out.println("=========================================");
	
	System.out.println(a.indexOf('g'));
	
	System.out.println("=========================================");
	
	System.out.println(a.lastIndexOf('g'));
	System.out.println("=========================================");
	
    System.out.println(a.contains("muthu"));
    System.out.println("=========================================");
    
   
	
    List a2 = new ArrayList();
	a2.add("bathi");
	a2.add('g');
	a2.add(21);
	a2.add("murugan");
	a2.add('b');
	
	System.out.println(a2);
	System.out.println("=========================================");
	
	//a.addAll(a2);
	//System.out.println(a);
	//System.out.println("=========================================");
	
	//a.removeAll(a2);
	//System.out.println(a);
	//System.out.println("=========================================");
	
	a.retainAll(a2);
	System.out.println(a);
	System.out.println("=========================================");
	
	
	
	
	
	
	
	
	}
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

