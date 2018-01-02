package pokemon.model;

public class Dragonite extends Dragonair implements Flying
{
	public Dragonite()
	{
		super(149, "Dragonite");
		setup();
	}
	
	public Dragonite(String name)
	{
		super(149, name);
		setup();
	}
	
	public Dragonite(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public void soar()
	{
		System.out.print("Soar");
	}
	
	public double hurricane(double wind)
	{
		double windSpeed = 0.0;
				
		return windSpeed;
	}
	
	public void twister()
	{
		System.out.print("Twister");
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setHealthPoints(525);
		this.setAttackPoints(255);
		this.setEnchancementModifier(3.75);
		this.setCanEvolve(false);
	}
}
