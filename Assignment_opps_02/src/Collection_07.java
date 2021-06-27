import java.util.ArrayList;

//Write a Java program to search an element in an array list.
public class Collection_07 {

	public static void main(String[] args) {
		
		ArrayList <String> obj= new ArrayList<String>();
		
		obj.add("red");
		obj.add("yellow");
		obj.add("green");
		obj.add("black");
		
		int at=obj.indexOf("d");
		System.out.println(at);
		if (at == -1) {
			System.out.println("the element is not present");
		}
		else {
			System.out.println("the element is present");
		}
			
	}

}
