import java.util.Scanner;

public class Pirates {
	public static int u;
	public static Boolean winA = false;
	public static Boolean winB = false;
	public static Integer[] coastA = new Integer[30];
	public static Integer[] coastB = new Integer[30];
	public static Integer[] positionsA = new Integer[3];
	public static Integer[] positionsB = new Integer[3];
	public static String[] shipNamesA = { "Liberty", "Courage", "Freedom" };
	public static String[] shipNamesB = { "Blackbeard", "Harpy", "Poseidon" };
	public static Boolean[] shipsA = { false, false, false };
	public static Boolean[] shipsB = { false, false, false };
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

	

		for (int j = 0; j < coastA.length; j++) {

			coastA[j] = null;
			coastB[j] = null;

		}

		System.out.println("Coast is clear! Prepare to load ships!");
		System.out.println("-Player 1-");
		for (int x = 0; x < 3; x++) {
			System.out.println("Where to put Ship " + shipNamesA[x]);
			positionsA[x] = sc.nextInt();

		}
		clearScreen();
		System.out.println("-Player 2-");
		for (int x = 0; x < 3; x++) {
			System.out.println("Where to put Ship " + shipNamesB[x]);
			positionsB[x] = sc.nextInt();
		}
		clearScreen();

		play();

	}

	public static void play() {
		do {
			u++;
			if ((u % 2) != 0) {
			 winA =	checkForWinner(winA);
			}

			else {
			winB =	checkForWinner(winB);
			}
		} while (winA != true && winB != true);
		if(winA==true){
			System.out.println("The Good Guys Won!");
		}
		else{
			System.out.println("The Pirates Won!");
		}
	}

	private static Boolean checkForWinner(Boolean win) {
		int hit = 0;
		int p=0;
		System.out.println("What do you want to hit?");
		hit = sc.nextInt();
		
		if ((u % 2) != 0) {

			for(int o = 0; o < positionsA.length; o++){
				
				if(positionsB[o]==hit){
					shipsB[o] = true;
					System.out.println("Ship "+ shipNamesB[o]+" was hit! Sinking like the Titanic! ");
					break;
				}
				else if(o==3){
					System.out.println("No fish was harmed.");
				}
			}
			
			for(int z =0 ; z < shipsB.length ; z++){
				if(shipsB[z]==true){
					p++;
				}
			}
			
			
			}

			else {
			
				
				for(int o = 0; 0 < positionsA.length; o++){
					
					if(positionsA[o]==hit){
						shipsA[o] = true;
						System.out.println("Ship "+ shipNamesA[o]+" was hit! Sinking like the Titanic! ");
						break;
					}
					else  if(o==3){
						System.out.println("No fish was harmed.");
					}
					
				}
				
				for(int z =0 ; z < shipsA.length ; z++){
					if(shipsA[z]==true){
						p++;
					}
				}
				
			
			}
		
		if(p==3){
			win = true;
		}
		
		
		return win;
	}

	public static void clearScreen() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(" ");
		}
	}
}
