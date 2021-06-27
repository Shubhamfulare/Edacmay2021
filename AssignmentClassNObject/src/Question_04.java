/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' with constructor having the three sides as its parameters.*/
class Triangle1{
	int area;
	int length;
	int height;
	int breadth;
	public Triangle1(int a,int b,int c) {
		length=a;
		height=b;
		breadth=c;
		}
	public void area() {
		area=(int) (0.5*length*height);
		System.out.println("Area : "+area);
	}
	public void perimeter() {
		int perimeter=(length+height+breadth);
		System.out.println("Perimeter : "+perimeter);
	}
}
public class Question_04 {

	public static void main(String[] args) {
	Triangle1 t=new Triangle1 (3,4,5);
	
	t.area();
	t.perimeter();
	}
}