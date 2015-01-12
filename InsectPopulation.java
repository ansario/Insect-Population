/*
 * @author Omar Ansari
 * @version 1.0 2/18/14
 * This class defines methods for TestInsectPopulation
 */
public class InsectPopulation {
	private double size;
	public InsectPopulation(double size){ //Construct InsectPopulation
		this.size = size;
	}
	public double breed(){ //Every breeding cycle, the population is doubled.
		return size = size*2;
	}
	public double spray(){ //Every spray cycle, the population loses 10%
		return size = size*.90;
	}
	public double getSize(){ //get the size of the population
		return size;
	}
	public void display(){//print size of population
		System.out.println(getSize());
	}
}
