package helloWorld;
import java.util.Scanner;
public class RealJavaCalc {
public static void main(String args[]){
		double numripar, numridyt, pergjigje;
		String veprimet ;
		System.out.println("Kjo eshte makina llogaristese!");
		System.out.println("Fut numrin e pare:");
		Scanner inputet = new Scanner(System.in);
		numripar = inputet.nextDouble();
		System.out.println("Fut numrin e dyte");
		numridyt = inputet.nextDouble();
		System.out.println("Fut veprimet +,-,*,/ ");
		
		veprimet = inputet.next();
		if (veprimet.equals("+"))
		{
			pergjigje = numripar + numridyt;
			System.out.println("Pergjigja eshte :" + pergjigje);
		}else if (veprimet.equals("-"))  {
			pergjigje = numripar * numridyt;
			System.out.println("Pergjigja eshte : " + pergjigje);
			}else if (veprimet.equals("*")) {
			 pergjigje = numripar * numridyt;
			 System.out.println("Pergjgija eshte : " +pergjigje);
			 }else if (veprimet.equals("/")){
				pergjigje = numripar / numridyt;
				System.out.println("Pergjigja eshte :" + pergjigje);
				
				
			}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Faleminderit per besimin !!");
			}
            }
	    
