/*We want to calculate the total marks of each student of a class in
Physics,Chemistry and Mathematics and the average marks of
the class. The number of students in the class are entered by the
user. Create a class named Marks with data members for roll
number, name and marks. Create three other classes inheriting
the Marks class, namely Physics, Chemistry and Mathematics,
which are used to define marks in individual subject of each
student. Roll number of each student will be generated
automatically.*/
import java.util.*;
class Marks{
	static int rollNumber=1;
	String name; 
	int marks;
}	
class Physics extends Marks{
	static int totalPh;
	int Physics;
	public void setMarksPh(int ph) {
		totalPh=Physics+ph;
	}
}
class Chemistry extends Marks{
	static int toatalCh;
	int Chemistry;
	public void setMarksCh(int ch) {
		toatalCh=Chemistry+ch;
	}
}
 class Mathematics extends Marks{
	static int totalMa;
	int Mathematics;
	public void setMarksMa(int ma) {
		totalMa=Mathematics+ma;
	}
}

public class MarksOfStudents {
	
	
	static void read() {
		Marks obj=new Marks();
		Physics obj1=new Physics();
		Chemistry obj2=new Chemistry();
		Mathematics obj3=new Mathematics();
		String []arr=new String[2];
	
		for(int i=0;i<3;i++) {
			arr[i]=Myscanner.getString("Enter a name");
			int Ph= Myscanner.getInt("Enter physics marks");
			int ch=Myscanner.getInt("Enter chemistry marks");
			int ma=Myscanner.getInt("Enter math marks");
	
			
			obj1.setMarksPh(Ph);
			obj2.setMarksCh(ch);
			obj3.setMarksMa(ma);
		}
			for(int j=0;j<3;j++) {
				System.out.println("student "+j+" ="+arr[j]);
			}
			
		
	
	}
		static void Avg() {
			Physics obj1=new Physics();
			Chemistry obj2=new Chemistry();
			Mathematics obj3=new Mathematics();
			
			System.out.println("Total marks of physics"+(obj1.totalPh));
			System.out.println("Total marks of chemistry"+(obj1.totalPh/3));
			System.out.println("Total marks of mathematics"+(obj1.totalPh/3));
			System.out.println("Avg marks of physics"+(obj1.totalPh/3));
			System.out.println("Avg marks of chemistry"+(obj2.toatalCh/3));
			System.out.println("Avg marks of mathematics"+(obj3.totalMa/3));
			
		}
	
	public static void main(String[] args) {
		
		MarksOfStudents.read();
		MarksOfStudents.Avg();
		
		
		
		
	
	}	
		
}
