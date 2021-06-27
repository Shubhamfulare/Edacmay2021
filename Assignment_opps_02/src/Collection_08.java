//. Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;


public class Collection_08 {

	public static void main(String[] args) {
		ArrayList<String> obj= new ArrayList<String>();
		
		obj.add("red");
		obj.add("yellow");
		obj.add("green");
		obj.add("black");
		
		Collections.sort(obj);
		System.out.println(obj);
		
	}

}
