package pokemon.model;

public class Salamence extends Pokemon implements Dragon,Flying
{
	public Salamence()
	{
		super(373, "Salamence");
		setup();
	}
	
	public Salamence(String name)
	{
		super(373, name);
		setup();
	}
	
	public Salamence(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public void roar()
	{
		System.out.print("Roar");
	}
	
	public double breathFire(double heat)
	{
		double temperature = 0.0;
		
		return temperature;
	}
	
	public void fly()
	{
		System.out.print("Fly");
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
		this.setHealthPoints(1750);
		this.setAttackPoints(550);
		this.setEnchancementModifier(2.25);
		this.setCanEvolve(false);
	}
}
