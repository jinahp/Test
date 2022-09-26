package loopexample;

public class ForExample {

	public static void main(String[] args) {
	
		int num;
		int sum;
		
//		while(num <= 10) {
//			sum += num;
//			num++;
		
		for(num = 1, sum = 0; num <= 10; num++) {
			sum += num;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
