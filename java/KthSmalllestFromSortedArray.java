package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.print.attribute.standard.Finishings;

/**
 * 
 * @author Rahul
 *
 */
public class KthSmalllestFromSortedArray {

	public static int find_kth(int[] arr1,int[] arr2, int arr1_start_index, int arr1_end_index,
			int arr2_start_index, int arr2_end_index, int k ){

		if(arr1.length+arr2.length < k){
			return Integer.MIN_VALUE;
		}

		int mid_index_A= (arr1_end_index+ arr1_start_index)/2;
		int mid_index_B= (arr2_end_index+ arr2_start_index)/2;

		int size=mid_index_A+mid_index_B+2;
		if(k==1 && size==0){
			return Math.min(arr1[mid_index_A], arr2[mid_index_B]);
		}  

		if(size==k){
			return Math.max(arr1[mid_index_A] , arr2[mid_index_B]);
		}
		
		//System.out.format("Arr1= (%d,%d) , Arr2=(%d,%d), size= %d\n", arr1_start_index,arr1_end_index, arr2_start_index,arr2_end_index, size);				
		System.out.format("mid_index_A=%d,  mid_index_B=%d , K=%d\n ", mid_index_A, mid_index_B, k);
						
		if(mid_index_A+ mid_index_B+2 <k){
			//increase the search space			
			System.out.format("Expand search space (%d,%d), (%d,%d)\n", mid_index_A, arr1_end_index, mid_index_B,arr2_end_index);
			return find_kth(arr1, arr2, mid_index_A,arr1_end_index, mid_index_B,arr2_end_index, k);
		}else{
			//decrease the search space 
			System.out.format("Compress search space: Arr1= (%d,%d) , Arr2=(%d,%d)\n", arr1_start_index,mid_index_A, arr2_start_index,mid_index_B);
			return  find_kth(arr1, arr2, arr1_start_index, mid_index_A,arr2_start_index, mid_index_B, k);
			
		}
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand= new Random();
		 int[] arr1= new int[rand.nextInt(10)+1];
		 for (int i = 0; i < arr1.length; i++) {
			arr1[i]=rand.nextInt(20);		
		}
		 
		 int[] arr2= new int[rand.nextInt(10)+1];
		 for (int i = 0; i < arr2.length; i++) {
			 arr2[i] =  rand.nextInt(30);
			
		}
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 ArrayList<Integer>  a = new ArrayList<>();
		 for(int j : arr1){
			 a.add(j);
		 }
		 for(int j : arr2){
			 a.add(j);
		 }
		 Collections.sort(a);
		 System.out.println(Arrays.toString(arr1));
		 System.out.println(Arrays.toString(arr2));		 
		 System.out.println(Arrays.toString(a.toArray()));
		 
		 int k=rand.nextInt(arr1.length+ arr2.length);		
		 System.out.format("k= %d. k_th largest element: %d\n",k, a.get(k-1) );
		 System.out.println("Algorithm output: "+find_kth(arr1, arr2, 0, arr1.length-1, 0, arr2.length-1, k));
	}

}

