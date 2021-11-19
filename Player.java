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
	}

	public void getClass() {return baseStats;}

}