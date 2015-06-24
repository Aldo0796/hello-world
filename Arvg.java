package meTeper;

import java.util.Scanner;
public class Avrg{
	
	public static void main(String args[]){
		
		int rradha = 0;
		int notat;
		int total = 0;
		double mesatarja;
		 System.out.println("Fut notat: ");
		while (rradha < 10){
			
			 Scanner inputet = new Scanner(System.in);
			 notat = inputet.nextInt();
			 total = total + notat;
			 
			 rradha++;
			 
			 
		 }
		 mesatarja = total/10;
		System.out.println("Mesatarja juaj eshte : " + mesatarja );
	}
	
	
}
