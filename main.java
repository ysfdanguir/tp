import java.util.ArrayList;

public class main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegleSimple r1 = new RegleSimple("P","Q");
		RegleSimple r2 = new RegleSimple("Q","R");
		
		
		ArrayList <String> BF = new ArrayList<String>();
		ArrayList<RegleSimple> BR = new ArrayList<RegleSimple>();
		
		BR.add(r1);
		BR.add(r2);
		
		BF.add("P");
		
		//COMPOSEE
		System.out.print( MoteurInference.chainageavant(BR, BF, "F"));
		
		RegleSimple r3 = new RegleSimple("P&J","Q");
		RegleSimple r4 = new RegleSimple("Q&K","R");
		
		
		ArrayList <String> BF1 = new ArrayList<String>();
		ArrayList<RegleSimple> BR1 = new ArrayList<RegleSimple>();
		
		BR.add(r3);
		BR.add(r4);
		
		BF.add("P");
		
		
		System.out.print( MoteurInference.chainageavant(BR1, BF1, "P"));
	}

}