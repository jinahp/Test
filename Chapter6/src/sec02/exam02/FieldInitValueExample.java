package sec02.exam02;

public class FieldInitValueExample {

	public static void main(String[] args) {
		
		FieldInitValue fiv = new FieldInitValue();
		System.out.println(fiv.byteField); // 초기값 0
		System.out.println(fiv.shortField); // 초기값 0
		System.out.println(fiv.intField); // 초기값 0
		System.out.println(fiv.longField); // 초기값 0
		System.out.println(fiv.booleanField); // 초기값 false
		System.out.println(fiv.charField); // 초기값 공백
		System.out.println(fiv.doubleField); // 초기값 0.0
		System.out.println(fiv.floatField); // 초기값 0.0
		
		System.out.println(fiv.arrField); // 초기값 null
		System.out.println(fiv.strField); // 초기값 null
	}

}
