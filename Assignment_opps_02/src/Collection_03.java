import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to insert an element into the array list at the first position.
public class Collection_03 {

	public static void main(String[] args) {
	ArrayList <String> list=new ArrayList<String>();
		
		list.add("mango");
		list.add("apple");
		list.add("kiwi");
		list.add("banana");
		
		list.add(2, "Strawberry");
		Iterator abc=list.iterator();  
		while(abc.hasNext()) {
		System.out.println(abc.next());	
		}

	}

}
