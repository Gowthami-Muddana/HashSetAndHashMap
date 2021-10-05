package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;



public class HashMapANDHaashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");
		  set.add(null);
		  set.add("Ravi");  
		  set.add("Ajay"); 
		  set.add(null);
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple"); 
		   map.put(null, null);
		   map.put(3,"Banana");   
		   map.put(4,"Grapes"); 
		   map.put(null, "pink");
		   map.put(5, null);
		   map.put(null, "Grapes");
		   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	}

}
