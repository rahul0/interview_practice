package code;

import java.util.Arrays;

public class MergeArray {
	 public static void merge(int A[], int m, int B[], int n) {
	        
	        
	        if(m==0 && n==0){
	            return;
	        }
	        if(n==0){
	            return;
	        }
	        if(m==0){
	            for(int i=0;i<n;i++){
	                A[i]=B[i];
	            }
	            return;
	        }

	        int b_ptr=n-1;
	        int a_ptr=m-1;
	        int big_ptr=m+n-1;
	        
	        while(big_ptr >=0){
	          
	          if(a_ptr==-1){
	              A[big_ptr--] =B[b_ptr--];
	          }else if(b_ptr==-1){
	              big_ptr=-1;
	          }else{
	              if(A[a_ptr] < B[b_ptr]){
	                  A[big_ptr--] =B[b_ptr--];
	              }else{
	                  A[big_ptr--] =A[a_ptr--];
	              } 
	          }
	          
	        }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] A= new int[3];
        A[0]=1;
        int[] B= new int[1];
        B[0]=2;
        MergeArray.merge(A, 1, B, 1);
        System.out.println(Arrays.toString(A));
 }
}
