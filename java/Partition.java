package code;
import java.util.Arrays;
import java.util.Random;
public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Random r = new Random();
        int sz= 6;
        int topK= 4;
        //int topK=5;
        int[] arr= new int[sz];
        for (int i = 0; i < arr.length; i++) {
			arr[i]= r.nextInt(50);			
		}
        
        System.out.println("Before partition: " + Arrays.toString(arr) + "\nK=" + topK);        
        System.out.println("topk index: " + arr[get_topK(arr, 0, sz-1, topK-1)]);
        Arrays.sort(arr);
        System.out.println("\n\nSorted: " + Arrays.toString(arr));
	}
	
	public static  int get_topK(int [] arr,int start_index, int end_index, int topk){
		//int partition=-1;
		
		if(start_index==end_index){
		 return start_index;
		}
		
		int pivot_index=part(arr, start_index, end_index);
			
		if(pivot_index==topk){
			return  pivot_index;
		}else if(topk >pivot_index){
			return part(arr, pivot_index+1, end_index);
		}else{
			return part(arr, start_index, pivot_index-1);
		}		
	} 
	
	static  void  exchange (int[] arr, int idx_a, int idx_b) throws IndexOutOfBoundsException {		
			int temp= arr[idx_a];
			arr[idx_a]=arr[idx_b];
			arr[idx_b]=temp;		
		
	}
		
	public static  int part(int[]  arr, int start, int end){
		//exchange(arr, top_k-1, end);
		int pivot= arr[end];
		int less_index=start-1;
		
		for (int i = start; i < end; i++) {			
			if(arr[i] < pivot ){
				less_index+=1;
				exchange (arr, less_index, i);
			}			
		}		
		exchange(arr,less_index+1, end);
		return less_index+1; 
 
	}
	
	

}

