package ac.in.kletech;

public class TravelerDemo {

	public static void main(String[] args) {
		
	
		              Travelers aa=new Travelers(19,2000,30,true);
		              
		              Check checkpoint=new Check();
		              
		              if(checkpoint.checkbaggage(aa) && checkpoint.checkImmigration(aa) && checkpoint.checkNOCstatus(aa)){
		            	  System.out.println("FLY");
		              }
		            else{
		            		  System.out.println("Stay Back");
		              }
		              
		              
			}

		
	
		

	}


