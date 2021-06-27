/*Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of
its length and breadth as parameters of its constructor and having a method named 'returnArea' which
returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.*/

class Area1{
	int area;
	int length;
	int breadth;
	public Area1(int a,int b) {
		length=a;
		breadth=b;
	}
	public int returnArea() {
		return (area=length*breadth);
		
	}
}
public class Question_07 {

	public static void main(String[] args) {
		Area1 re=new Area1(5,6);
		
		System.out.println("area of retangle : "+re.returnArea());
	}

}