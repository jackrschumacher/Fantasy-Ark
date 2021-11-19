public class Area
{
	private String name;
	private Stage[] stages;

  public Area(String name, Stage[] stages)
	{
    this.name = name;
    this.stages = stages;
  }

	public Stage[] getStages()
	{
		return stages;
	}  
}