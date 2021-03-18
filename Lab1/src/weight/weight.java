package weight;


public class weight {
	private double weightInMars;
	private double weightInEarth;
	public weight(double weight)
	{
		this.weightInEarth=weight;
	}

	
	public double getWeightInMars() {
		return weightInMars;
	}
	
	//calculate and get weight
	public void setWeightInMars(double weightInMars) {
		this.weightInMars =weightInEarth*0.38;
	}
	public double getWeightInEarth() {
		return weightInEarth;
	}
	public void setWeightInEarth(double weightInEarth) {
		this.weightInEarth = weightInEarth;
	}
	
	public void calculateWeight()
	{
		this.weightInMars=weightInEarth*0.38;
		
	}
	public static void hit(weight weight) {
		
		
	}
	
}
