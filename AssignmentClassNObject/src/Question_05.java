/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
creating a class named 'Rectangle' with a method named 'Area' which returns the area and length
and breadth passed as parameters to its constructor.*/

class Rectangle{
	int area;
	int length;
	int breadth;
	public Rectangle(int a,int b) {
		length=a;
		breadth=b;
	}
	public void area() {
		area=length*breadth;
		System.out.println("area of retangle : "+area);
	}
}
public class Question_05 {

	public static void main(String[] args) {
		Rectangle re=new Rectangle(4,5);
		re.area();
		Rectangle r=new Rectangle(5,8);
		r.area();
	}

}
