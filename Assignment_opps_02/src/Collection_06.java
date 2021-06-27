import java.util.ArrayList;
import java.util.Arrays;

//Write a Java program to remove the third element from an array list.
public class Collection_06 {

	public static void main(String[] args) {
		ArrayList <String> obj= new ArrayList<String>();
		
		obj.add("red");
		obj.add("yellow");
		obj.add("green");
		obj.add("black");
		
		obj.remove(2);
		for(String list:obj) {
			System.out.println(list);
		}
		//ArrayList<String> obj2 = Arrays.asList({"white"});
		
	}

}
