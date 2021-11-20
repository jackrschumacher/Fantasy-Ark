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
		//	int HP, int attack, int defense, int specialAttack, int sepcialDefense, int speed, int mana, int gold, int XP
		enemies.put("Slime", new Enemy(5, 1, 1, 1, 1, 1, 0, 0, 0));

		HashMap<String,EnemyPool> pools = new HashMap<String,EnemyPool>(1);
		pools.put("Plains Easy", new EnemyPool([
			enemies.get("Slime")
			]));

		ArrayList<Area> Areas = new ArrayList<Area>();
		Areas.add(new Area("Plains", [
			new Stage("Temp Name", 1, pools.get("Plains Easy"), player)
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
		System.out.println("Vanum needs a hero to put a end to the darkness.");
		System.out.println("This hero by the name of " + player.getName() + " is the world's best " + playerclass + ".");
		System.out.println("Now go on your journey, " + player.getName() + ", to end the darnlness and save Vanum.");


		// GAME!
		while(player.getCurrentHealth() > 0)
		{
			for(Area a : Areas)
			{
				for(Stage s : a.getStages())
				{
					for(Battle b : s.getBattles())
				}
			}
		}


  }
}