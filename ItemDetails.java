package ac.in.kletech;



public class ItemDetails {
	        private int itemID;
	        private double itemprice;
	        
	       ItemDetails(int itemID){
	    	   this.itemID=itemID;
	    	   ItemDetail(itemID);
	       }

		public int getItemID() {
			return itemID;
		}

		public double getItemprice() {
			return itemprice;
		}
	       
	       void ItemDetail(int itemID)
	       {
	    	   if(itemID==1001)
	    		   itemprice=10;
	    	   else if(itemID==1002)
	    		   itemprice=20;
	    	   else if(itemID==1003)
	    		   itemprice=30;
	    	   else if(itemID==1004)
	    		   itemprice=40;
	    	   else
	    		   System.out.println("Item is not found");
	       }
	       
	       void i1(){
	    	   System.out.println("Item price"+itemprice);
	    	   System.out.println("Item Id" +itemID);
	       }
	       
	     

}
