package ac.in.kletech;

public class Check {
	
	
		
		boolean checkbaggage(Travelers aa){
			if(aa.getfBaggageamount()>=0 && aa.getfBaggageamount()<=40)
				return true;
			else 
				return false;
		}
		
		boolean checkImmigration(Travelers aa){
			if(aa.getiExpirydate()>=2001 && aa.getiExpirydate()<=2025)
				return true;
			else
				return false;
		}
		
		boolean checkNOCstatus(Travelers aa){
			if(aa.isNOCstatus()==true)
				return true;
			else
				return false;
		}

	}



