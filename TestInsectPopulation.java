/*
 * @author Omar Ansari
 * @version 1.0 2/18/14
 * This class loops a breed and spray cycle for an insect population
 */
public class TestInsectPopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsectPopulation population = new InsectPopulation(10);//Construct new population with 10 insects. 
		for (int count = 0; count <8; count++) { //for loop iterates 8 times
		population.breed(); //calls methods from InsectPopulation class
		population.spray();
		population.display();
}




	}

}
