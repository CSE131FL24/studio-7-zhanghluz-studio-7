package studio7;

public class Die {
   private int n;
   public Die(int sides) {
	 n = sides;
	 
			
   }
   public int random() {
   
	return ((int)(Math.random()*n + 1));   
   }
	public static void main(String[] args) {
		Die lucky = new Die(9);
		System.out.print(lucky.random());
		// TODO Auto-generated method stub

	}

}
