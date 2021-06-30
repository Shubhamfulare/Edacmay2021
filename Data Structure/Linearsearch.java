import java.util.*;
class Linearsearch {
    public static void main(String args[] ){
      Scanner s = new Scanner(System.in);
       int N=s.nextInt();
       int A[]={11,22,44,55,66};
       int K=s.nextInt();
       for(int i=0;i<N;i++){
           if(K== A[i]){
            System.out.println(i);
			break;
		   } 
	   }
    }
}