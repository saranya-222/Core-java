package practicals;
import java.util.HashMap;
import java.util.Scanner;
public class BowlingGame {
	 HashMap<String, Integer> players;
	    BowlingGame() {
	        players = new HashMap<String, Integer>();
	    }
	    public void addPlayer(String name, int p) {
	        players.put(name, p);
	    }
	    public void getWinner()
	    {
	 //      for (HashMap<String,Integer> list : playe
	    		   //rs) {
			
		}
	   // }
	    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BowlingGame game = new BowlingGame();
	        Scanner sc = new Scanner(System.in);

	        for(int i=0;i<3;i++) {
	            String input = sc.nextLine();
	            String[] values = input.split(" ");
	            String name = values[0];
	            int points = Integer.parseInt(values[1]);
	            game.addPlayer(name, points);
	        }
	        game.getWinner();
	    }
	

	}

