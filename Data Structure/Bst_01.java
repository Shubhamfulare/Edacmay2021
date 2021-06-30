class Node{
	Node root,left,right;
	int data;
	Node(){}
	Node(int key){
		data=key;
	}
	void insert(int key) { 
	root = insertData(root, key); 
	}
	Node insertData(Node root,int key){
		if (root==null){
			root=new Node(key);
			return root;
		}
		else{
			if(key<root.data){
				root.left=insertData(root,key);
			}
			else{
				root.right=insertData(root,key);
			}
		}
		return root;
	}
}
class Bst_01{
	public static void main(String []args){
		Node n= new Node();
		n.insert(50);
		n.insert(40);
		n.insert(80);
		n.insert(10);
		n.insert(25);
		n.insert(45);
	}
}