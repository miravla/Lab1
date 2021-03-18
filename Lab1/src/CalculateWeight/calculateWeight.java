package CalculateWeight;

import weight.weight;

public class calculateWeight {
public void weight() {};

	
	public static void main(String[] args) {
		weight a=new weight(60.0);
		weight b=new weight(40);
		weight c=new weight(85.6);
		
		//add into array
		weight list [] = new weight [3];
		list[0] = a;
		list[1] = b;
		list[2] = c;
		
		//calculate for each weight
		for(int i=0; i<3;i++)
		{
			list[i].calculateWeight();
			System.out.print("Weight "+i+" in Earth :");
			System.out.println(list[i].getWeightInEarth());
			System.out.print("Weight "+i+" in Mars :");
			System.out.println(list[i].getWeightInMars());
		}
		
		
		}
	
		
	
}
