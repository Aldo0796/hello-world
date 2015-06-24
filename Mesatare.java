package meTeper;
import java.util.Scanner;
public class Mesatare {

	public static void main(String args[]){
		
		int nota;
		int totali=0;
		
		double mesatarja;
		Scanner inputet = new Scanner(System.in);
		System.out.println("Fut notat more djalo");
		for (int rradha = 0;rradha <10;rradha++ ){
			
			nota = inputet.nextInt();
			totali = totali + nota;
			
			
		}
		
		mesatarja = totali/10;
		System.out.println("Mesatarja jote eshte : " + mesatarja);
	}

}
