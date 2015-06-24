package meTeper;

import java.util.Scanner;

public class Class2 {
 
	public void funksionkot() {
		System.out.println("Ky eshte nje koment i integruar!!!!");
		int arrow;
		Scanner inputet = new Scanner(System.in);
		System.out.println("For what age are you interested? ");
		arrow = inputet.nextInt();
		switch (arrow) {
		case 1:
			System.out.println("You are a baby");
		break;
		case 2:
			System.out.println("You are 2 ye3ars old!");
		break;
		case 3:
			System.out.println("You can barely walk");
			break;
		case 4:
			System.out.println("You can speak fluently");
		break;
		case 5:
			System.out.println("You arematurated now");
		default:
			System.out.println("Shko re pirdhu!!!");
	}

	}}
