package helloWorld;
import java.util.Scanner;
public class Ifstatement {

public static void main(String args[]){
	int test;
	Scanner inputet = new Scanner(System.in);
	System.out.println("Fut numrin e deshiruar:");
	test = inputet.nextInt();
	if (test < 9){
	System.out.println("eshte me e vogel se 9");
	
	}else {
		System.out.println("Eshte me e madhe se 9");
	}
	
}

}