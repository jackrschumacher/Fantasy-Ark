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
		HashMap<String,BaseStats> classes = new HashMap<String,BaseStats>(2);
		Classes.put("Swordsman", new BaseStats(14, 4, 3, 3, 2, 3, 1));
		Classes.put("Marzahl", new BaseStats(10, 10, 10, 10, 10, 10, 10));

		HashMap<String,Enemy> enemies = new HashMap<String,Enemy>(1);
		enemies.put();

		HashMap<String,EnemyPool> pools = new HashMap<String,EnemyPool>(1);
		pools.put("Plains Easy", new EnemyPool())

		ArrayList<Area> Areas = new ArrayList<Area>();
		Areas.add(new Area("Plains", [
			new Stage("Temp Name", 1, /**/, player)
		]));


		//	Title
    System.out.println("\nWelcome to \n-----Fantasy Ark-----");
		
  	//	Name
    System.out.print("Please enter Name: ");
		player.setName(in.nextLine());

		//	Class
		System.out.println("Please enter Class");
		System.out.println("(Swordsman)");
		playerclass = in.nextLine();
		player.setBaseStats(classes.get(playerclass));

		//	Intro
		System.out.println("");
		System.out.println("" + player.getName() + "" + playerclass + "");
		System.out.println("" + player.getName() + "");


		// GAME!
		while(player.getCurrentHealth() > 0)
		{
			for(Area a : Areas)
			{
				for(Stage s : a.getStages())
				{
					
				}
			}
		}


  }
}