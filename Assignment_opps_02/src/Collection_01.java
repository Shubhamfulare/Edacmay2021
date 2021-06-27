// Write a Java program to create a new array list, add some colors (string) and print out the collection


import java.util.ArrayList;

public class Collection_01 {

	public static void main(String[] args) {
		ArrayList <String> obj= new ArrayList<String>();
		
		obj.add("red");
		obj.add("yellow");
		obj.add("green");
		obj.add("black");
		
		for(String list:obj) {
			System.out.println(list);
		}
		
	}

}
