package meTeper;
import java.util.Random;
public class Rand1 {

public static void main(String args[]){
	
	Random zaret  = new Random();
	int numrat;
	for (int rradha = 1; rradha<=3;rradha++){
	numrat = 1+  zaret.nextInt(6);
	System.out.println(numrat);
}
	}
}
