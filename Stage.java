public class Stage
{
  private String name;
  private Battle[] battles;
	private EnemyPool pool;

  public Stage(String name, int numBattles, EnemyPool pool, Player player)
  {
    this.name = name;
		this.pool = pool;
		battles = new Battle[numBattles];

		for (int i = 0; i < numBattles; i++)
		{
			battles[i] = new Battle(pool.getEnemy(), player);
		}
		
  }
}