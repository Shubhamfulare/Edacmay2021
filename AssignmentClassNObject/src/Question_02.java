//Assign and print the roll number, phone number and address of two students having names "Sam"
//and "John" respectively by creating two objects of class 'Student'.
class Student1{
	String name;
	int rollNo;
	long phoneNo;
	String address;
	public void set(String na,int a,long b,String c) {
		name=na;
		rollNo=a;
		phoneNo=b;
		address=c;				
	}
	public void get() {
		System.out.println("Name :"+name);
		System.out.println("Roll Number :"+rollNo);
		System.out.println("Phone Number :"+phoneNo);
		System.out.println("Address :"+address);
	}
}
public class Question_02 {

	public static void main(String[] args) {
		Student1 sd=new Student1();
		sd.set("Sam",1, 8147454655L,"Mumbai" );
		sd.get();
		Student1 sc=new Student1();
		sc.set("John",2, 9960068855L,"Aurangabad" );
		sc.get();
	}

}
