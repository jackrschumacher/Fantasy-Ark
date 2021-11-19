public class Enemy
{
	//	--------------------------------------
	//	Properties
	private String name;

	private int maxHP;
	private int currentHP;
  private int gold;
  private int XP;
	private int maxMana;
	private int currentMana;
	private int attack;
	private int defense;
	private int specialAttack;
  private int specialDefense;
  private int speed;
  
	//	--------------------------------------
	//	Constructors

	public Enemy(int HP, int attack, int defense, int specialAttack, int sepcialDefense, int speed, int mana, int gold, int XP)
	{
		this.maxHP = HP;
		this.currentHP = HP;
		this.attack = attack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialDefense = specialDefense;
		this.speed = speed;
		this.maxMana = mana;
		this.currentMana = mana;
    this.gold = gold;
    this.XP = XP;

	}


	//	--------------------------------------
	//	Methods

	public void setName(String name)
	{
		this.name = name;
	}

	//	--------------------------------------
	//	Getters & Setters
	public void setHP(int HP)
	{
		maxHP = HP;
		currentHP = HP;
	}

	public void setAttack(int Attack)
	{
		attack = Attack;
	}

	public void setDefense(int Defense)
	{
		defense = Defense;
	}

	public void setSpecialDefense(int SpecialDefense)
	{
		specialDefense = SpecialDefense;
	}

	public void setSpecialAttack(int SpecialAttack)
	{
		specialAttack = SpecialAttack;
	}
	
	public void setSpeed(int Speed)
	{
		speed = Speed;
	}
	public void setMana(int Mana)
	{
		maxMana = Mana;
		currentMana = Mana;
	}
  public void setGold(int Gold)
  {
    gold = gold;
  }

	public int getCurrentHP()
	{
		return currentHP;
	}

	public int getMaxHP()
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
  public int getCurrentGold()
  {
    return gold;
  }
  public int getCurrentXP()
  {
    return XP;
  }
}