package ac.in.kletech;

public class Travelers {
	
	
	
	
	         private int iTravelerID;
	         private int iExpirydate;
	         private float fBaggageamount;
	         private boolean NOCstatus;
	         
	         Travelers(int iTravelerID,int iExpirydate,float fBaggageamount,boolean NOCstatus){
	        	 this.iTravelerID=iTravelerID;
	        	 this.iExpirydate=iExpirydate;
	        	 this.fBaggageamount=fBaggageamount;
	        	 this.NOCstatus=NOCstatus;
	         }
			public int getiTravelerID() {
				return iTravelerID;
			}
			public int getiExpirydate() {
				return iExpirydate;
			}
			public float getfBaggageamount() {
				return fBaggageamount;
			}
			public boolean isNOCstatus() {
				return NOCstatus;
			}
	         
	         
	}



