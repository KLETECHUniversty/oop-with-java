package ac.in.kletech;
	public class Customer {
		     private int iCustID;
		     private String CustName;
		     private String CustAddress;
			 private int iTeleNo;

		     public int getICustID() {
				return iCustID;
			}
			public String getCustName() {
				return CustName;
			}
			public String getCustAddress() {
				return CustAddress;
			}
			public int getTeleNo() {
				return iTeleNo;
			}
			
			Customer(int iCustID,String CustName,String CustAddress,int iTeleNo){
				this.iCustID=iCustID;
				this.CustName=CustName;
				this.CustAddress=CustAddress;
				this.iTeleNo=iTeleNo;
			}
			
			boolean TeleNo(){
				if(iTeleNo/1000000000 <1 || iTeleNo/1000000000 >10)
					return false;
				else 
					return true;
			}
			
			boolean CustName(){
				  if(CustName.length()>4 && CustName.length()<20)
						  return true;
				  else 
					  return false;
			}
		     
		     	void display(){
		     		System.out.println("custId" +iCustID);
		     		System.out.println("custname" +CustName);
		     		System.out.println("teleno" +iTeleNo);
		     		System.out.println("address" +CustAddress);
		     	}

	}

	
	
	


