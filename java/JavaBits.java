package code;

import java.util.BitSet;

public class JavaBits {
	public static int bitsToModify(int number1, int number2) {
		int temp = number1 ^ number2;
		System.out.println("\n"+Integer.toBinaryString(temp));
		// the number of 1 bits in temp
		int bits = 0;
		while(temp != 0) {
		++bits;
		temp = (temp - 1) & temp;
		}
		return bits;
		}
	public static void main(String[] args) {

		int x=10;
		int y=-2;
		System.out.format("%d: %s\n", x,Integer.toBinaryString(x));
		System.out.format("%d: %s\n", y,Integer.toBinaryString(y));
		System.out.println(bitsToModify(x, y));
				
      
	}

}

