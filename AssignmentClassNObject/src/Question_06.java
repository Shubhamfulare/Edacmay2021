/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
First method named as 'setDim' takes length and breadth of rectangle as parameters and the second
method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are
entered through keyboard.*/
class Area{
	int length;
	int breadth;
	public void setDim(int a,int b) {
		length=a;
		breadth=b;
	}
	public void getArea() {
		int area=length*breadth;
		System.out.println("area of retangle : "+area);
	}
}
public class Question_06 {

	public static void main(String[] args) {
		Area re=new Area();
		re.setDim(5,6);
		re.getArea();
	}

}
