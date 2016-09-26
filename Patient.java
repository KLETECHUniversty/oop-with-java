package in.ac.kletech;

public class Patient {
            String Pname;
            String uid;
            int mobno;
            
            Patient(String Pname,String uid,int mobno){
            	this.Pname=Pname;
            	this.uid=uid;
            	this.mobno=mobno;
            }
            
            static Patient search(Patient[] p,int key){
            	Patient temp=null;
            	for(int i=0;i<p.length;i++){
            		if(p[i].mobno==key)
            		{
            			temp=p[i];
            			break;
            		}
            	}
            	return temp;
            	
            }
}
