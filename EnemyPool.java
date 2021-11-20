public class EnemyPool
{
	//	------------------------------------------------------
	//	Properties
	private Enemy[] enemies;

	//	------------------------------------------------------
	//	Constructors

	public EnemyPool(Enemy... enemies)
	{
		this.enemies = enemies;
	}

	public Enemy getEnemy()
	{
  	return enemies[(int) (Math.random() * enemies.length)].clone();
	}

}