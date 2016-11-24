import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class RandomizedAlgorithm 
{

	public static void main(String[] args) 
	{
		HashMap<String, Integer> precedence;
		int i, randomValue;
		ArrayList<Integer> usedValues;
		Iterator<String> it;
		String presentations[] = 
			{
				"DnD",
				"RDOC",
				"AEOP",
				"NDBM / FGBOM",
				"PQM",
				"Test Drive",
				"PPM / Block",
				"Software Content Management",
				"RCD",
				"BOM [Industry/Dell Imple]",
				"Engineering Collaboration",
				"Big Data / Hadoop",
				"PLM Integrations",
				"Cloud",
				"MDS",
				"High Availability",
				"SDLC"			
			};
		
		precedence = new HashMap<>();
		usedValues = new ArrayList<>();
		for(i=0; i<presentations.length; i++)
		{
			do
			{
				randomValue = (int) (Math.random()*presentations.length) + 1;
			} 
			while(usedValues.contains(randomValue));
			
			precedence.put(presentations[i], randomValue);
			
			usedValues.add(randomValue);
		}
		
		it = precedence.keySet().iterator();
		while(it.hasNext())
		{
			String temp = it.next();
			
			System.out.println(temp + " \t-----\t " + precedence.get(temp));
		}
	}

}
