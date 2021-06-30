class StackQ{
	int arr1[];
	int top;
	StackQ(){
		cap=5;
		top=-1;
		arr1=new int[5];
	}
	public void push(int d){
		if(isFull){
			System.out.println("Stack is full");
		}
		else
		arr[++top]=d;
		System.out.println(arr[top]);	
	}
	public int pop(){
		if (isEmpty){
			System.out.println("stack is empty");
		}
		else
			return arr[top--];
	}	
	public boolean isEmpty(){
		return top==-1;
		}	
	public boolean isFull(){
		return top==cap;
		}	
	public void stackToQ(){
		for(int i=0;i<5;i++){
			push(pop());
			
		}
	}
}
class StackUsingQ{
	public static void main(String []args){
		StackQ st=new StackQ();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.stackToQ();
		
	}
	
}