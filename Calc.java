package ac.in.kletech;

public class Calc {

		public int inum1;
		public int inum2;
		public int inum3;

		Calc( int inum1, int inum2, int inum3){
			
				this.inum1=inum1;
				this.inum2=inum2;
				this.inum3=inum3;
				
			
		}
		
	int add(){
			
		return inum1+inum2+inum3;
		
		
	}
	int difference(){
		return inum1-inum2-inum3;
		
		
	}
	int multiplication(){
		
		
		return inum1*inum2*inum3;
		
		
	}
	
	double division(){
		
		return (inum1/inum2);
		
	}

	public int getInum1() {
		return inum1;
	}

	public int getInum2() {
		return inum2;
	}

	public int getInum3() {
		return inum3;
	}
		
		
		
		
}

