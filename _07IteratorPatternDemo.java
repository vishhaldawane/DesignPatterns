import java.util.ArrayList;
import java.util.Iterator;

public class _07IteratorPatternDemo {
	 public static void main(String[] args) 
	 {
		 //container | GLASS
	      NameRepository namesRepository = new NameRepository();
	     
	      //STRAW
	      MyIterator iter = namesRepository.getMyIterator();
	      
	      while(iter.hasNext())
	      {
	    	  String name = (String) iter.next();
	    	  System.out.println("name is "+name);
	      }
	  
	      ArrayList al = new ArrayList(); //same as line 7
	      Iterator iter2 = al.iterator(); //same as line 9
	      while(iter2.hasNext()) { //line 11
	    	  iter2.next(); //line 13
	      }
	      
	 }
}	
