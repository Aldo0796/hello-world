package meTeper;
import java.util.Scanner;
public class Iintegruari {
public static void main(String[] args){
	
	System.out.print("Ky eshte nje program i integruar ku une ");
	System.out.println("shfaq ato qe kam mesuar deri tani!!!!!!");
	
    Integer numripar, numridyt;
	Scanner inputet = new Scanner(System.in);
	System.out.println("Fut numrin e par te deshiruar: ");
	numripar = inputet.nextInt();
	System.out.println("Fut numrine  dyte : ");

    numridyt = inputet.nextInt();
   
  
         	
    Teintegruar Pergjigje = new Teintegruar(); 	
   
    
    Integer iploti = numripar / numridyt;
    Integer mbetesi = numripar % numridyt;
    if (iploti > 25 && mbetesi > 2) {
    	
    	System.out.println("Po ti paske per te llogqarit shume gjera!!");
    } else {
    	System.out.println("Ik or djal mos u merr me vocerrima!!");
    }
    
    Pergjigje.funksionidyt(mbetesi);
    Pergjigje.funksionipar(iploti);	
    
}
}
