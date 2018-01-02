package pokemon.model;

public class Dragonair extends Dratini
{
	public Dragonair()
	{
		super(148, "Dragonair");
		setup();
	}
	
	public Dragonair(String name)
	{
		super(148, name);
		setup();
	}
	
	public Dragonair(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setHealthPoints(250);
		this.setAttackPoints(200);
		this.setEnchancementModifier(1.5);
		this.setCanEvolve(true);
	}
}
