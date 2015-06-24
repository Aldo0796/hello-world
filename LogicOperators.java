package helloWorld;
import java.util.Scanner;
public class Logicoperators {

   public static void main(String args[]) { 
		int boys, girls ;
		String pergjigje;
	Scanner inputet =  new Scanner(System.in);
	System.out.println("Jeni cift apo tek pull? ");
	pergjigje = inputet.nextLine();
	if (pergjigje == "tekpull"){
		System.out.println("Sa vjec jeni? ");
		boys = inputet.nextInt();
		girls = inputet.nextInt();
		inputet.close();
		if (boys < 25){
			System.out.println("Shko mer kalamo muti");
			
		}
else
		{
				System.out.println("Hajtper hajer ,ishalla kap gjo");
			}
				
			}
else 
			{
				
				
				System.out.println("Mund t'iu bej nje pyeteje te nderuar?");
				System.out.println("Sa vjec jeni?");	
				boys = inputet.nextInt();
				girls = inputet.nextInt();
				if (boys <18 || girls <16){
				    
					System.out.println("Shkoni mer kalamaqer dashkeni te beni gilivili ju");	
				}
else
				{
					System.out.println("Mbremje te kendshme!");
					inputet.close();
				}
				
			}
	
			}
   	
	}
	
		
	


