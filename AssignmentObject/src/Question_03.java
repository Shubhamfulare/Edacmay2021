//Write a program to calculate the average height of all the students of a class. The number of students and their heights in a class are entered by user.

class Height{
float Height;
static float total;
static int n;
	public Height() {
		int n=Myscanner.getInt("Enter number of student");
		this.n=n;
		for(int i=0;i<n;i++) {
			float s1=Myscanner.getInt((i+1)+":"+"Enter height of student in cm");
		this.Height=s1;
		this.total=+Height;
		}
	}	
	public void display() {
		//System.out.println(total);
		System.out.println("avg height of student "+n+":"+(total/n)+"cm");
		}
}
public class Question_03 {

	public static void main(String[] args) {
		
			Height h=new Height();
			h.display();
	}
}
