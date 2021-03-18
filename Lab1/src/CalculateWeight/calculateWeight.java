package CalculateWeight;

import java.util.ArrayList;
import java.util.Vector;

import weight.weight;

public class calculateWeight {
public void weight() {};

	
	public static void main(String[] args) {
		weight a=new weight(60.0);
		weight b=new weight(40);
		weight c=new weight(85.6);
		
		Vector<Double> list = new Vector<Double>();
		list.add(60.0);
		list.add(41.0);
		list.add(85.6);
		
		
		for (int i = 0; i < list.size(); i++)
		{
			
			System.out.print("Weight "+(i+1)+" in Earth :");
			System.out.println(list.get(i));
		}
	
		//add into array
				weight marsList [] = new weight [3];
				marsList[0] = a;
				marsList[1] = b;
				marsList[2] = c;
				
		//calculate for each weight
		for(int i=0; i<3;i++)
		{
			marsList[i].calculateWeight();
			System.out.print("Weight "+(i+1)+" in Mars :");
			System.out.println(marsList[i].getWeightInMars());
		}
		
		
		}




	private static double calculateWeight(Double weight) {
		// TODO Auto-generated method stub
		
	}
	
		
	
}
