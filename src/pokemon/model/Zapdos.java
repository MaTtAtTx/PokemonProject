package pokemon.model;

public class Zapdos extends Pokemon implements Electric,Flying
{
	public Zapdos()
	{
		super(145, "Zapdos");
		setup();
	}
	
	public Zapdos(String name)
	{
		super(145, name);
		setup();
	}
	
	public Zapdos(int number, String name)
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
	
	protected void setup()
	{
		this.setHealthPoints(37755);
		this.setAttackPoints(143255);
		this.setEnchancementModifier(47.75);
		this.setCanEvolve(false);
	}
}
