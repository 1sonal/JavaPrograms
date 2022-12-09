package demo2;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		double random=Math.random();
		System.out.println(random);
		
		Random randomInt=new Random();
		System.out.println(randomInt.nextInt(80));
		
		System.out.println(randomInt.nextBoolean());
		
		System.out.println(randomInt.nextInt(9));

	}

}
