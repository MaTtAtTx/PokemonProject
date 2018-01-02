package pokemon.model;

public class Raikou extends Pokemon implements Electric
{
	public Raikou()
	{
		super(243, "Raikou");
		setup();
	}
	
	public Raikou(String name)
	{
		super(243, name);
		setup();
	}
	
	public Raikou(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public double electrocute(double voltage)
	{
		double volts = 0.0;
		
		return volts;
	}
	
	public void thunder()
	{
		System.out.print("Thunder");
	}
	
	public void flash()
	{
		System.out.print("Flash");
	}
	
	protected void setup()
	{
		this.setHealthPoints(2550);
		this.setAttackPoints(1250);
		this.setEnchancementModifier(7.75);
		this.setCanEvolve(false);
	}
}
