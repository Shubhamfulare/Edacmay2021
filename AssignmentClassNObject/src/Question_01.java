//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the
//value of roll_no as '2' and that of name as "John" by creating an object of the class Student

class Student{
	String name;
	int roll_no;
	public void set(String a,int b) {
		name=a;
		roll_no=b;
		System.out.println(name +" "+ roll_no);
	}
}
public class Question_01 {

	public static void main(String[] args) {
		Student st=new Student();
		st.set("John", 2);

	}

}
