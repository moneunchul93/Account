
public class Car implements Valuable{
	private String name;
	private double price;
	private int checkinitial = 0;
	
	public double EstimateValue(int month){
		double temp = price;
		
		if(checkinitial == 0){
			temp = temp - temp*0.2;
		}
		for(int i = 0; i < month; i++){
			temp = temp - temp*0.01;
		}
		return temp;
	}
	
	//overloading
	public double EstimateValue(){
		double temp = price;
		
		if(checkinitial == 0){
			temp = temp - temp*0.2;
		}
		for(int i = 0; i < 1; i++){
			temp = temp - temp*0.01;
		}
		return temp;
	}
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public String toString(){
		return String.format("car name: %s\ninitial price: %f", name, price);
	}
}
