package weight;


public class weight {

	public weight(double weight)
	{
		this.weightInEarth=weight;
	}
	private double weightInMars;
	private double weightInEarth;
	
	public double getWeightInMars() {
		return weightInMars;
	}
	public void setWeightInMars(double weightInMars) {
		this.weightInMars = weightInMars;
	}
	public double getWeightInEarth() {
		return weightInEarth;
	}
	public void setWeightInEarth(double weightInEarth) {
		this.weightInEarth = weightInEarth;
	}
	
	public void calculateWeight()
	{
		weightInMars=weightInEarth*0.38;
	}
	
}
