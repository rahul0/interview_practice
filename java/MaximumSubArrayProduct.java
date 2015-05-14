package code;

import java.util.Arrays;

public class MaximumSubArrayProduct {

    private static void maxProduct(int[] nums) {
        int max_g=nums[0];
        int min=nums[0];
        int max_l=nums[0];
        
        for(int i=1; i<nums.length;i++){
            int val=nums[i];
            if(val>0){
                max_l= Math.max(val, max_l*val);
                min= min*val;
            }else if (val< 0){
                min= min==0 ?val:min*val;
                max_l=0;
            }else{
                //max_g=Math.max(max_g,0);
                max_l=0;
                min=0;
            }
            max_g=Math.max(Math.max(min,max_l),max_g);
        }
           System.out.println(max_g); 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {-2,-5,-10, -3,-1};
		System.out.println(Arrays.toString(a));
		maxProduct(a);				

	}

}
