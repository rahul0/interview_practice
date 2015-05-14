package code;

public class SquareRoot {
    
	
	public static double squared_root(double number) {
		double eps=0.001;
		
		double sqrt_value=number/2;
		double  left_boundary=0;
		double  right_boundary=sqrt_value;
		while (java.lang.Math.abs(number -sqrt_value*sqrt_value)>eps){
			sqrt_value= (left_boundary+right_boundary)/2;
			System.out.format("Left: %f, Right: %f, SQRT= %f, SQUAREd= %f ",  left_boundary, right_boundary,sqrt_value, sqrt_value*sqrt_value);
			System.out.println();
			if(number> sqrt_value*sqrt_value ){
				left_boundary=sqrt_value;
			}else{
				right_boundary=sqrt_value;
			}
		} 
		
		return sqrt_value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(SquareRoot.squared_root(20));
	}

}
