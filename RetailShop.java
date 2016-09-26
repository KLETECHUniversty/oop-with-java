package ac.in.kletech;




public class RetailShop {

	public static void main(String[] args) {
		   Customer aa=new Customer(20,"suman","abc",1234567891);
		   if(aa.CustName() && aa.Teleno()){
			   aa.display();
			   purchase p=new purchase(12,3);
			   p.Purchasebill();
			   p.p1();
		   }
			   

	}

}
