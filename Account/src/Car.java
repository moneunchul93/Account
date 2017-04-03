
public class Car implements Valuable{
	private String name;
	private double price;
	private int checkinitial = 0;
	
	public double EstimateValue(int month){
		if(checkinitial == 0){
			price = price - price*0.2;
			checkinitial = 1;
		}
		for(int i = 0; i < month; i++){
			price = price - price*0.01;
		}
		return price;
	}
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String toString(){
		return String.format("car name: %s\ninitial price: %f", name, price);
	}
}
