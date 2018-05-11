import java.util.ArrayList;
import java.util.Scanner;

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
			boolean flag = false;
			for(int j=0;j<r.getPremisse().length; j++) {
				String premisse = r.getPremisse()[j];
				
				if(BF.contains(premisse)==false) {
				flag = true;
				break;
				}
			}
			if(flag==false) {
				found=true;
				BF.add(r.getConclusion());
			    BR.remove(i);
			 	}
			}
			

		}
		if (BF.contains(Propverif)==true)
			return true;
		else {
			return false;
		}
	
	}
	public static boolean verifier() {
	Scanner scan = new Scanner(System.in);
	System.out.println("We are having a problem finding it, are you sure about this? y/n ");
	String answer = scan.nextLine();
	boolean answer1 = true;
	if(answer.equals("y")) {
		answer1 = true;
	}else if(answer.equals("n")){
		answer1 = false;
	}else {
		System.out.println("answer with: 'y' or  'n' ");
	}
	return answer1;
	}
	public static boolean chainagearriere(ArrayList<RegleSimple> BR,ArrayList<String> BF, String Propverif) {
		boolean fin=false;
				if (BF.contains(Propverif)==true) {
					fin = true;
				}else {
					RegleSimple r=new RegleSimple();
					String Propverif1 = Propverif;
					boolean flag = true;
					
						for ( int i=0; i<BR.size(); i++) {
							r = BR.get(i);
							if(Propverif1.equals(r.getConclusion())==true ) {
								flag = false;
								Propverif1=r.getPremisse();
							    
							    MoteurInference.chainagearriere(BR, BF,Propverif1);
							    break;
							}
							
						}
					
					if (flag==true){
						Scanner scan = new Scanner(System.in);
						System.out.println("We are having a problem finding it, are you sure about this? y/n ");
						String answer = scan.nextLine();
						
						if(answer.equals("y")) {
							fin = true;
						}else if(answer.equals("n")){
							fin = false;
						}else {
							System.out.println("answer with: 'y' or  'n' ");
						}
					}
				
				}
				return fin;	
	}
}

