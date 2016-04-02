package practise;

import java.util.ArrayList;

public class TowerOfHanoi {
	
	final static String moveA = "Move 1 ring from Stack 0 to Stack 1";
	final static String moveB = "Move 1 ring from Stack 0 to Stack 2";
	final static String moveC = "Move 1 ring from Stack 1 to Stack 2";
	
	ArrayList<String> log = new ArrayList<String>();
	
	public ArrayList<String> TowerofHanoi(Integer N, String from, String to,String spare){
		
		if(N==2)
		{
			log.add("Move 1 ring from "+from+" to "+spare);
			log.add("Move 1 ring from "+from+" to "+to);
			log.add("Move 1 ring from "+spare+" to "+to);	
			
			return log;
		}		
	
			TowerofHanoi((N-1), from, spare, to);
			log.add("Move 1 ring from "+from+" to "+to);
			TowerofHanoi((N-1), spare, to, from);

		return log;
		
	}
	
	public static String helloing(){
		return "hello";
	}
	
	
	public static void main(String[] args) {
		
		TowerOfHanoi TowerOfHanoiObj = new TowerOfHanoi();
		ArrayList<String> instructions = TowerOfHanoiObj.TowerofHanoi(4, "Stack 0", "Stack 1", "Stack 2");
		print(instructions);
			
	}

	private static void print(ArrayList<String> instructions) {
		// TODO Auto-generated method stub
		for(String str: instructions)
			System.out.println(str);	
	}
}
