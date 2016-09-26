package ac.in.kletech;



	public class Library {
	             int referencetime;
	             int lendingtime;
	             int digitaltime;
	             
	             Library(int referencetime,int lendingtime,int digitaltime){
	            	 this.referencetime=referencetime;
	            	 this.lendingtime=lendingtime;
	            	 this.digitaltime=digitaltime;
	             }
	             
	             void Reference(){
	            	 if(referencetime>4)
	            		 System.out.println("sitting more than 4hrs is not allowed");
	            	 else
	            		 System.out.println("U can sit only for 4hrs");
	             }
	             
	             void Lendingbook(){
	            	 if(lendingtime<15)
	            		 System.out.println("No penalty");
	            	 else if(lendingtime>15 && lendingtime<=22)
	            		 System.out.println("Penalty:" + (lendingtime-15)*20);
	            	 else if(lendingtime>22 && lendingtime<=29)
	            		 System.out.println("Penalty:" + ((lendingtime-21)*50+(7*20)));
	            	 else if(lendingtime>29 && lendingtime<=37)
	            		System.out.println("Penalty:"+ ((lendingtime-29)*30+(lendingtime-21)*50+(7*20)));
	            	 else if(lendingtime>38)
	            		 System.out.println("Penalty:" +((lendingtime-38)*300+(lendingtime-29)*30+(lendingtime-21)*50+140));
	             }
	             
	             void Digital(){
	            	 if(digitaltime>4 && digitaltime<6)
	            		 System.out.println("Digital section is open");
	            	 else
	            		 System.out.println("Digital section is closed");
	             }
	             
	             void Questionpaper(){
	            	 System.out.println("Computer science: year:2015");
	             }
	             
	}
	
	

