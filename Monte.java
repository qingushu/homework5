public class Monte{
	public static void main(String[] args){
		long allDots = 0;
		long i;
		long dotIn = 0;
		double ratio;
		double x, y;
		
		System.out.println("The ratio of the area of the top right quadrant of the circle to the square is:  " + Math.PI/4);
		
		for(i = 0; i < 4000000000L; i++){
			x = Math.random();
			y = Math.random();
			allDots++;
			if(x*x + y*y <= 1)
				dotIn++;


		}
		ratio = (double)dotIn/(double)allDots;
		System.out.println("Dots in the circle: " + dotIn);
		System.out.println("Dots in the square: " + allDots);		
		System.out.println("estimate ratio generated from the dots is " + ratio);
		System.out.println("The estimated value of PI = " + 4*ratio);


	}




}
