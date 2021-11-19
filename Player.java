import java.util.ArrayList;

public class Player
{
	//	--------------------------------------
	//	Properties

	private ArrayList<Item> inventory;

	private String name;

	private int maxHP;
	private int currentHP;
	private int maxMana;
	private int currentMana;
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
		specialDefense = baseSpecialDefense;
	}

	public void setSpecialAttack(int baseSpecialAttack)
	{
		specialAttack = baseSpecialAttack;
	}
	
	public void setSpeed(int baseSpeed)
	{
		speed = baseSpeed;
	}
	public void setMana(int baseMana)
	{
		maxMana = baseMana;
		currentMana = baseMana;
	}

	public int getCurrentHealth()
	{
		return currentHP;
	}

	public int getMaxHealth()
	{
		return maxHP;
	}

	public int getAttack()
	{
		return attack;
	}

	public int getDefense()
	{
		return defense;
	}

	public int getSpecialAttack()
	{
		return specialAttack;
	}

	public int getSpecialDefense()
	{
		return specialDefense;
	}

	public int getSpeed()
	{
		return speed;
	}

	public int getMaxMana()
	{
		return maxMana;
	}

	public int getCurrentMana()
	{
		return currentMana;
	}

}