package cat.xavigimenez.debuggerExerciseOne;

public class Cat {
	private String name ="";
	private int weight = 4;
	private int live = 7;
	
	
	public Cat(String n, int w) {
		this.name = n;
		this.weight = w;
	}
	
	public void miaow() {
		if (this.live >=4) {
			System.out.println(this.name +" says: Miaow");
		} else if (this.live>=2 & this.live <4 ) {
			System.out.println(this.name +" says: Miaaaaaaaaaaoooooooooooooooow!!");
		}else {
			System.out.println(this.name +" says: MIAAAAAAAAAOOOOOOOOOWWWWWWWWWW!!!!!");
		}
		
	}
	
	public void feed(int crunchy) {
		this.weight += crunchy / 2;
		if (weight > 15) {
			System.out.println(this.name + " says: I'm vomiting. I can't eat more!!!!!");
			this.miaow();
		} else {
			System.out.println(this.name + " says: I want more meal");
		}
	}
	
	public void jump(int height) {
		if (height > 7) {
			this.live -= height* 0.5;
			this.miaow();
		}else {
			System.out.println(this.name + "says: I like jumping, it's funny!");
		}
	}
	
	public boolean isAlive(){ 
		if (this.live <=0 ) {
			return false;
		}else {
			return true;
		}				
	}	

}
