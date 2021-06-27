import java.util.ArrayList;

// Write a Java program to update specific array elements by a given element.
public class Collection_05 {

	public static void main(String[] args) {
		ArrayList <String> obj= new ArrayList<String>();
		
		obj.add("red");
		obj.add("yellow");
		obj.add("green");
		obj.add("black");
		
		obj.remove(2);
		obj.add(2,"white");
	//	obj.set(2, "white");
		for(String list:obj) {
			System.out.println(list);
		}
	}

}
