import java.util.ArrayList;

public class MoteurInference {
	
	public MoteurInference() {
			}
	
	public static boolean chainageavant(ArrayList<RegleSimple>BR,ArrayList<String>BF, String Propverif) {
		RegleSimple r=new RegleSimple();
		boolean found= true; 
		while(BF.contains(Propverif)== false && found == true ) {
			found = false;
		for ( int i=0; i<BR.size(); i++) {
			r = BR.get(i);
			if(BF.contains(r.getPremisse())==true )
				found=true;
				BF.add(r.getConclusion());
			    BR.remove(i);
		}
		}
		if (BF.contains(Propverif)==true)
			return true;
		else {
			return false;
		}	

	}
	@SuppressWarnings("unlikely-arg-type")
	public static boolean chainageavantCom(ArrayList<RegleComposee>BR,ArrayList<String>BF, String Propverif) {
		RegleComposee r=new RegleComposee();
		boolean found= true; 
		while(BF.contains(Propverif)== false && found == true ) {
			found = false;
		for ( int i=0; i<BR.size(); i++) {
			r = BR.get(i);
			if(BF.contains(r.getPremisse())==true )
				found=true;
				BF.add(r.getConclusion());
			    BR.remove(i);
		}
		}
		if (BF.contains(Propverif)==true)
			return true;
		else {
			return false;
		}	

	}
	
}
