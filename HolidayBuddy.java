package ac.in.kletech;


	import java.util.Scanner;

	public abstract class HolidayBuddy {
		static int count;
		double packageAmt;
		
		Customer c = new Customer("Sumeet", "Hubli", 95645768765, "Female");
		Scanner sc = new Scanner(System.in);
		
		void display(){
			System.out.println("Customer Details:");
			System.out.println("Name: "+c.sName);
			System.out.println("Address: "+c.sAddress);
			System.out.println("Contact No: "+c.lTeleNo);
			System.out.println("Gender: "+c.gender);
		}
		double checkGender(double packageAmt, String gender) {
			
			double discount;
			double totAmt;
			if(c.gender=="Female"){
				discount=packageAmt*0.02;
				totAmt = packageAmt-discount;
				System.out.println("Discount (based on gender)= Rs."+discount);
				return totAmt;
			}
			else{
				discount=0;
				System.out.println("Discount(based on gender) = Rs."+discount);
				totAmt=packageAmt-discount;
				return totAmt;
		
			}
		}

		void calDisc(double totalAmt){
			double disc;
		
			if(count>=2){
				disc=totalAmt*0.10;
				totalAmt=totalAmt-disc;
				System.out.println("Total Amount (the customer has visited more than one time)= Rs."+totalAmt);
			}
			else{
				disc=0;
				System.out.println("Total Amount (the customer has visited only once) = Rs."+ totalAmt);
			}
			
		}
		
		
	}


	class TravelOnly extends HolidayBuddy{
		double dist;
		double CostFor1Km=2;
		double amt(){
			System.out.println("Enyer the distance (in Kms) between the cities");
			dist = sc.nextDouble();
			
			packageAmt=CostFor1Km*dist;
			
			System.out.println("Package Amount = Rs."+ packageAmt);
			return packageAmt;
			
		}
		
		
		
		
	}

	class HolidayPackage extends HolidayBuddy{
		double dist;
		int noOfDays;
		double CostFor1Km=2;
		double AmtFor1Day=700;
		
		double amt(){
			System.out.println("Enter the distance(in KMs) and no of days of travel");
			dist=sc.nextDouble();
			noOfDays=sc.nextInt();
			
			packageAmt=((CostFor1Km*dist)+(AmtFor1Day*noOfDays)+100);
			
			System.out.println("Package Amount = Rs."+packageAmt);
			return packageAmt;
		}

		
		
	}

	class BedAndBreakfast extends HolidayBuddy{
		int noOfDays;
		double Amtfor1day=800;
		double amt(){
			System.out.println("Enter the no of days");
			noOfDays=sc.nextInt();
			
			packageAmt=noOfDays*Amtfor1day;
			
			System.out.println("Package Amount = Rs."+packageAmt);
			return packageAmt;
		}
		
	}

	
						amt = t.amt();
						t.calDisc(amt);
						System.out.println(t.checkGender(amt, "Female"));
						break;
				case 2: System.out.println("holiday package is booked");
						HolidayPackage h = new HolidayPackage();
						h.display();
						amt = h.amt();
						h.calDisc(amt);
						System.out.println(h.checkGender(amt, "Female"));
						break;
				case 3: System.out.println("Bed and Breakfast package is booked");
						BedAndBreakfast b= new BedAndBreakfast();
						b.display();
						amt = b.amt();
						b.calDisc(amt);
						System.out.println(b.checkGender(amt, "Female"));
						break;
				default: System.out.println("Wrong choice");		
				
				
						
			}
			
			
		}

	


	
	
	
	
	
	


