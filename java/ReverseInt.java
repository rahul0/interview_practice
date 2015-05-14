package code;

public class ReverseInt {
    
    public static  int reverse(int x) {
        
        int result=0;
        boolean  isNegative=  x<0? true: false; 
        x= isNegative? -x:x;
        while(x>0){
            result=result*10+x%10;
            x=x/10;
            if( !isNegative &&  x>0 &&x< 10 && result >(Integer.MAX_VALUE-(x%10))/10 ){
                result=0;
                break;
            }
        }
        
        return isNegative? -result: result;
   }
	public static void main(String [] args) {
		int number=563847412;
		System.out.println(ReverseInt.reverse(number));
	}
}
