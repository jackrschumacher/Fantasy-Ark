public class BaseStats
{
	//	--------------------------------------
	//	Properties
	private String name;

	private int baseHealth;
	private int baseAttack;
	private int baseDefense;
	private int baseSpecialAttack;
	private int baseSpecialDefense;
	private int baseSpeed;
  private int baseMana;


	public BaseStats(String name, int baseHealth, int baseAttack, int baseDefense, int baseSpecialAttack, int baseSepcialDefense, int baseSpeed, int baseMana)
	{
		this.name = name;
		this.baseHealth = baseHealth;
		this.baseAttack = baseAttack;
		this.baseDefense = baseDefense;
		this.baseSpecialAttack = baseSpecialAttack;
		this.baseSpecialDefense = baseSpecialDefense;
		this.baseSpeed = baseSpeed;
		this.baseMana = baseMana;
	}

	
}