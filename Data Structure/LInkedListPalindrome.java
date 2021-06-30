import java.util.*;
class List{
	Node head;
}
class Node extends List{
	char data;
	Node link;
	int len;
	String str;
	Node(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name");
		 str=s.nextLine();
		 this.str=str;
		 len=str.length();
		for(int i=0;i<str.length();i++){
			inseart(str.charAt(i));
		}
	}
	Node(char d){
		data=d;
		link=null;
		
	}
	public void inseart(char d){
		if(head==null){
			head=new Node(d);
		}
		else{
			Node temp1=head;
			while(temp1.link!=null){
				temp1=temp1.link;
			}
			Node new_node=new Node(d);
			temp1.link=new_node;
			
		}
	}
	
	public void isEmpty(){
		if(head==null){
			System.out.println("is palindrome");
		}else{
			System.out.println("is not a palindrome");
		}
	}
	public void delete(){
		
		while(head.data==str.charAt(--len)){
			//System.out.println(head.data+" "+len);
			head=head.link;
			}
	}
	public void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data);
			temp=temp.link;
		}
	}
}
class LinkedListPalindrome{
	public static void main(String [] args){
		List l=new List();
		Node n=new Node();
		
		n.delete();	
		n.isEmpty();
		
		//n.display();
	}
}