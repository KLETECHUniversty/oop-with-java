package in.ac.kletech;

public class Patientdemo {

	public static void main(String[] args) {
           Patient p[]=new Patient[5];
           p[0]= new Patient("a","uid1",6554);
           p[1]=new Patient("b","uid2",6555);
           p[2]=new Patient("c","udi3",6556);
           p[3]=new Patient("d","uid4",6557);
           p[4]=new Patient("e","uid5",6558);
           
           Patient pp=Patient.search(p, 6554);
           if(pp==null)
        	   System.out.println("Patient not found");
           else
           {
        	    System.out.println("Patient Name:" +pp.Pname);
        	    System.out.println("Patient id:" +pp.uid);
        	    System.out.println("Patient mobno:" +pp.mobno);
           }
           
           
	}

}
