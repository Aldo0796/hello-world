package helloWorld;
import java.util.Scanner;
public class Mbetesi{

public static void main(String arg[]){
		int numripar, numridyt, iploti ,mbetesi;
		Scanner inputet = new Scanner(System.in);
		System.out.println("Fut numrin e pare: ");
		numripar = inputet.nextInt();
		System.out.println("Fut numrin e dyte: ");
		numridyt = inputet.nextInt();
		iploti = numripar / numridyt;
		mbetesi = numripar % numridyt;
		System.out.println("Ky eshte nr i plote nga pjestimi: " + iploti
);
		System.out.println("Ky eshte mbetesi : " + mbetesi);
		System.out.println("Kjo ishte detyra ime per sot Aldo.");
		System.out.println("Shef mjaft me kaq!!");
				
	}

}

