import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to retrieve an element (at a specified index) from a given array list.
public class Collection_04 {

	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<String>();
		
		list.add("mango");
		list.add("apple");
		list.add("kiwi");
		list.add("banana");
		
		System.out.println(list.get(2));
	}	
//		for(String ab:list) {
//			System.out.println(list.get(2));
//		}	

}


