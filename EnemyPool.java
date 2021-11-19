public class EnemyPool
{
	//	------------------------------------------------------
	//	Properties
	private Enemy[] enemies;
	private int enemyCount;

	//	------------------------------------------------------
	//	Constructors

	public EnemyPool(Enemy[] enemies)
	{
		this.enemyCount = enemyCount;
		this.enemies = enemies;
	}

	public Enemy getEnemy()
	{
  	return enemies[(int) (Math.random() * enemies.length)];
	}

}