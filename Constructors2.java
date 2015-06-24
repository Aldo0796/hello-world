package meTeper;

public class Constructors{
	private String girlName;
	public Constructors(String name){
		girlName = name;
}
	public void getName(String name){
	girlName = name	;
	
}public String setName(){
	
	return girlName;
}
	
	public void sayname(){
		
		System.out.printf("Une bera sher me bira dhe fitoi %s\n", setName());
	}
	
	
}