package ac.in.kletech;

public class purchase {

	         private int iBillID;
	         private int Qty;
	         private double Billamt;



	         public int getIBillID() {
				return iBillID;
			}

			public int getQty() {
				return Qty;
			}

			public double getBillamt() {
				return Billamt;
			}

			public Itemdetails getItem() {
				return item;
			}

			purchase(int iBillID,int Qty){
	        	 this.iBillID=iBillID;
	        	 this.Qty=Qty;
	         }

	         Itemdetails item=new Itemdetails(1001);

	         void Purchasebill(){
	        	 if(Qty<0 || Qty>5)
	        		 System.out.println("Quantity should be less than 5");
	        	 else
	        		 {
	        		   billamt=Qty * item.getItemprice();
	        		   if(Billamt>=1000)
	        			   Billamt-=0.1;
	        		   else if(Billamt>=500)
	        			   Billamt-=0.05;

	        		 }
	        	 item.i1();
	         }

	         void  p1(){
	        	 System.out.println("BillID" +iBillID);
	        	 System.out.println("Quantity"+Qty);
	        	 System.out.println("total amount" +Billamt);
	         }

}
