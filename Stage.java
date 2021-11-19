public class Stage
{
  private String name;
  private Battles[] battles;
	private EnemyPool pool;

  public Stage(String name, Battles[] battles, EnemyPool pool)
  {
    this.battles = battles;
    this.pool = pool;
    
  }
}