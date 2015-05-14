package code;

public class Power1 {
    
	public static double pow(int base , int exponent) {
		
		if(exponent==0 ||  base==1){
			return 1d;
		}
		
		if(exponent%2==0){
			double  temp= pow(base, exponent/2);
			return temp*temp;
		}else{
			double temp= pow(base, exponent/2);
			return temp*temp* base;
		}				

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power1.pow(5, 7));

	}

}
