package assistedprojectsPhase1;
import java.util.*;
public class Map7 {

	public static void main(String[] args) {
	
       //Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"sushmi");    
	      hm.put(2,"pavi");    
	      hm.put(3,"vinod");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"latha");  
	      ht.put(5,"peddabba");  
	      ht.put(6,"anusha");  
	      ht.put(7,"poojitha");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"susi");    
	      map.put(9,"Carlotte");    
	      map.put(10,"anu");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	     
	      
	}
}
}


