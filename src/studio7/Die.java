package studio7;

public class Die {

	public int max;
	
	public Die(int max) {
		this.max = max;
	}
	
	public int roll() {
		return (int) (Math.random()*max+1);
	}
	
}
