class Node{
	Node head;
	int data;
	Node link;
	
	Node(){}
	Node(int d){
		data=d;
		link=null;
		head=null;
	}
	public void addElement(int d){
		if (head==null){
			head=new Node(d);
		}
		else {
			Node temp1=head;
			Node new_node=new Node(d);
			while(temp1.link!=null){
				temp1=temp1.link;
			}
			temp1.link=new_node;
		}
	}
	
	public void display(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data+" ");
			temp=temp.link;
		}
	}
	
	public void delete(){
		head=head.link;
	}
	
}
class LinkedListQ{
	public static void main(String []args){
		Node n=new Node();
		n.addElement(10);
		n.addElement(20);
		n.addElement(30);
		n.delete();
		n.display();
	} 
}