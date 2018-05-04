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
		
		
		System.out.print( MoteurInference.chainageavant(BR, BF, "F"));
		
	}

}