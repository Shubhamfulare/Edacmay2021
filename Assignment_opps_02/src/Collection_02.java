import java.util.ArrayList;
import java.util.Iterator;

// Write a Java program to iterate through all elements in an array list. 


public class Collection_02 {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<String>();
		
		list.add("mango");
		list.add("apple");
		list.add("kiwi");
		list.add("banana");
		
		Iterator abc=list.iterator();  
		while(abc.hasNext()) {
		System.out.println(abc.next());	
		}
	}

}
