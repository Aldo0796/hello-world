package meTeper;
import java.util.Scanner;
public class Interesi{
	 
	 public static void main(String args[]){
		 
		 double Pricipali;
		 double totali;
		 double rritja = .01;
		 int vit;
		 System.out.println("Fut sa lek do : ");
		 Scanner inputet = new Scanner(System.in);
		 Pricipali = inputet.nextDouble();
		 System.out.println("Fut per sa vite do ta llogatisesh: ");
		 Scanner inputet1 = new Scanner(System.in);
		 
		 vit = inputet1.nextInt();
		 inputet.close();
		
		 for (int vitet = 1; vitet <= vit; vitet++){
		 totali = Pricipali*Math.pow(1 + rritja , vitet);
		 System.out.println(vitet + "  " + totali);}
	 }
	 
 }

