/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' without any parameter in its constructor.*/
class Triangle{
	int area;
	int length;
	int height;
	int breadth;
	public void area() {
		area=(int) (0.5*length*height);
		System.out.println("Area : "+area);
	}
	public void perimeter() {
		int perimeter=(length+height+breadth);
		System.out.println("Perimeter : "+perimeter);
	}
	
}
public class Question_03 {

	public static void main(String[] args) {
	Triangle t=new Triangle ();
	t.length=3;
	t.height=4;
	t.breadth=5;
	t.area();
	t.perimeter();
	
		
	}

}
