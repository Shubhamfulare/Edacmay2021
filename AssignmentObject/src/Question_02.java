//Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.
class Student{
	static int[]avg=new int[2];
	String name;
	int physics;
	int chemistry;
	int mathematics;
	static int i;
	 public void setDetails(String name,int physics,int chemistry,int mathematics) 	 		{
		 
		this.name=name;
		this.physics=physics;
		this.chemistry=chemistry;
		this.mathematics=mathematics;
		
	 	}
	 public void avgMarks() {
		
		// System.out.println(physics+chemistry+mathematics);
		  avg[i]=((physics+chemistry+mathematics)/3);
		// System.out.println(avg[i]+" "+i);
		  i++;
	 } 
	 
	 public void display() {
		 for(int j=0;j<avg.length;j++) {
			 	System.out.println("roll no : "+(j+100));
				System.out.println("avg marks : "+this.avg[j]);
				
			}
	 }
}
public class Question_02 {
     static void Input() {
    	 for(int i=0;i<2;i++) {
 			String name=Myscanner.getString("Enter name of student");
 			int Physics=Myscanner.getInt("Enter marks of physics");
 			int chemisrty=Myscanner.getInt("Enter marks of chemisrty");
 			int mathematics=Myscanner.getInt("Enter marks of mathematics");
 			Student st=new Student();
 			st.setDetails(name, Physics, chemisrty, mathematics);
 			st.avgMarks();
 		}
     }
	public static void main(String[] args) {
		Student st=new Student();
		Question_02.Input();
		st.display();
	}

}
