import java.util.Scanner;
import java.util.HashMap;

class Main
{
  public static void main(String[] args)
	{
		//	Useful things
		Scanner in = new Scanner(System.in);
		Player player = new Player();
		
		//	Classes of Charachters
		HashMap<String,BaseStats> Classes = new HashMap(2);
		Classes.put("Swordsman", new BaseStats(14, 4, 3, 3, 2, 3, 1));
		Classes.put("Marzahl", new BaseStats(10, 10, 10, 10, 10, 10, 10));

		//	Title
    System.out.println("\nWelcome to \n-----Fantasy Ark-----");
		
  	//	Name
    System.out.print("Please enter Name: ");
		player.setName(in.nextLine());

		//	Class
		System.out.println("Please enter Class");
		System.out.println("(Swordsman)");
		player.setBaseStats(Classes.get(in.nextLine()));

		// GAME!



  }
}