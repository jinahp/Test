package sec03.exam03;

public class Car {
	//Field
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// Constructor
	Car() {
	} // 생성자1
	
	Car(String model) {
		this.model = model;
	} // 생성자2
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	} // 생성자3
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} // 생성자4
}
