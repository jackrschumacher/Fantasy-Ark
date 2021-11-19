import java.util.ArrayList;

public class Player
{

	//	--------------------------------------
	//	Properties

	private ArrayList<Item> inventory;

	private String name;

	private int maxHP;
	private int currentHP;
	private int mana;
	private int attack;
	private int defense;
	private int specialAttack;
  private int specialDefense;
  private int speed;

	private BaseStats baseStats;
  
	//	--------------------------------------
	//	Constructors

	public Player()
	{}


	//	--------------------------------------
	//	Methods

	public void setName(String name)
	{
		this.name = name;
	}

	public void setBaseStats(BaseStats baseStats)
	{
		this.baseStats = baseStats;
		baseStats.setStats(this);
	}

	//	--------------------------------------
	//	Getters & Setters
	public void setHealth(int baseHealth)
	{
		maxHP = baseHealth;
		currentHP = baseHealth;
	}

	public void setAttack(int baseAttack)
	{
		attack = baseAttack;
	}

	public void setDefense(int baseDefense)
	{
		defense = baseDefense;
	}

	public void setSpecialDefense(int baseSpecialDefense)
	{
		defense = baseSpecialDefense;
	}

	public void setSpecialAttack(int baseSpecialAttack)
	{
		defense = baseSpecialAttack;
	}
	
	public void setSpeed(int baseSpeed)
	{
		defense = baseSpeed;
	}
	public void setMana(int baseDefense)
	{
		defense = baseDefense;
	}
}