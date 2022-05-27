package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double feeding() {
		return beer*5.00 + softDrink*3.00 + barbecue*7.00;
	}
	
	public double cover() {
		if (feeding() > 30) {
			return 0;
		}
		else {
			return 4.00;
		}
	}
	
	public double ticket() {
		if (gender == 'M') {
			return 10.00;
		}
		else {
			return 8.00;
		}
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}
}
