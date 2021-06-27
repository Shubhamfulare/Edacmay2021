import java.util.Scanner;

//Add two distances in inch-feet by creating a class named 'AddDistance'.
class AddDistance{
	double feet;
	
	public AddDistance(int a) {
		feet=a*0.0833333;
		System.out.println("The values in feet : "+feet);
	}
}
public class Question_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values in inch : ");
		int a=sc.nextInt();
		AddDistance ad=new AddDistance(a);
	}

}
