import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

class Main
{
	private static Scanner in = new Scanner(System.in);

  public static void main(String[] args)
	{
		//	Useful things
		Player player = new Player();
		
		//	Classes of Charachters
		HashMap<String,BaseStats> classes = new HashMap<String,BaseStats>(2);
		classes.put("Swordsman", new BaseStats(14, 4, 3, 3, 2, 3, 1));
		classes.put("Marzahl", new BaseStats(10, 10, 10, 10, 10, 10, 10));

		HashMap<String,Enemy> enemies = new HashMap<String,Enemy>(1);
		//	int HP, int attack, int defense, int specialAttack, int sepcialDefense, int speed, int mana, int gold, int XP
    // Individual Enemies
		enemies.put("Slime", new Enemy(5, 1, 1, 1, 1, 1, 0, 0, 0));
    enemies.put("Big Slime", new Enemy(10, 2, 3 ,2 ,3 ,2));
    enemies.put("Giant Slime", new Enemy(20, 4, 4, 4, 4, 3));
    enemies.put("Small Goblin", new Enemy(6, 2, 1, 2, 1, 2));
    enemies.put("Goblin", new Enemy(12, 3, 2, 3, 2, 2)):
    enemies.put("Goblin Warrior", new Enemy(18, 5, 3, 5, 3, 3)):
    enemies.put("Glot", new Enemy(33, 7, 8, 7, 8, 5));
    

		HashMap<String,EnemyPool> pools = new HashMap<String,EnemyPool>(1);
		pools.put("Plains Easy", new EnemyPool(
			enemies.get("Slime")
			));

		ArrayList<Area> Areas = new ArrayList<Area>();
		Areas.add(new Area("Plains",
			new Stage("", 1, pools.get("Plains Easy"), player)
			));

		//	Title
    System.out.println("\nWelcome to \n-----Fantasy Ark-----");
		
  	//	Name
    System.out.print("Please enter Name: ");
		player.setName(in.nextLine());

		//	Class
		System.out.println("Please enter Class");
		System.out.println("(Swordsman)");
		
		String playerclass = in.nextLine();
		player.setBaseStats(classes.get(playerclass));

		//	Intro
		System.out.println("Vanum needs a hero to put a end to the darkness.");
		System.out.println("This hero by the name of " + player.getName() + " is the world's best " + playerclass + ".");
		System.out.println("Now go on your journey, " + player.getName() + ", to end the darkness and save Vanum.");


		// GAME!
		while(player.getCurrentHealth() > 0)
		{
			for(Area a : Areas)
			{
				for(Stage s : a.getStages())
				{
					for(Battle b : s.getBattles())
					{
						b.run();
					}
				}
			}
		}
  }

	public static String getInput()
	{
		return in.nextLine();
	}
}