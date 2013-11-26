package si1.lab1;

import java.util.Scanner;

public class Main {
	
	private static Number2Words n2w; 
	

	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in );
		
		System.out.println("Informe um numero:");
		String input = sc.next();
		
		try {
			n2w = new Number2Words(input);
			System.out.println(n2w.generateOutput());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			main(args);
		}
		
		

	}

}
