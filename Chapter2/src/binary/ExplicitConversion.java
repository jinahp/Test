package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);

		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);
		System.out.println(num2);
		// 결과가 다른 이유: num1 = 3+0 = 3, num2 = 3.14 + 0.9 = 4.23 => 4
	}

}
