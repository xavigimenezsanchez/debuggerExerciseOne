package cat.xavigimenez.debuggerExerciseOne;

import java.util.ArrayList;
import java.util.Random;

public class CatFarm {
	private String [] names = {"Puppy","Pussy","Mikesch","Toby","Oliver","Leo","Blade","Milo","Harley","Tigger","Cassidy","Garfield"};
	
	private ArrayList<Cat> farm = new ArrayList<Cat>();
	
	private int numCats = 12;
	
	
	
	public CatFarm() {
		for (int i = 0;i<numCats;i++){
			farm.add(new Cat(names[i], 1));
		}
	}
	
	private void doSomething(Cat c) {
		Random rand = new Random(); 
		int doWhat = rand.nextInt(3);
		if (c.isAlive()) {
			switch (doWhat) {
				case 0: 
					c.feed((int) rand.nextInt(20));
					break;
				case 1: 
					c.jump((int) rand.nextInt(10));
					break;
				case 2: 
					c.miaow();
					break;
			}		
		}
		
	}
	
	private boolean areAllDeath(){
	
		for (Cat cat: this.farm){
			if (cat.isAlive()){
				return false;
			}
		}
		System.out.println("All the cats are death. You are the Devil or a Cendrassos DAW student!");
		return true;
		
		
	}
	
	public void production() {
		int counter = 0;
		do {
			
			counter++;
			for (Cat cat: this.farm) {
				
				this.doSomething(cat);
				
				
			}
			System.out.println("-----------------------------------------------"+counter);
		} while (!this.areAllDeath());
		
	}
}
