package pokemon.model;

public class Rayquaza extends Pokemon implements Dragon,Flying
{
	public Rayquaza()
	{
		super(384, "Rayquaza");
		setup();
	}
	
	public Rayquaza(String name)
	{
		super(384, name);
		setup();
	}
	
	public Rayquaza(int number, String name)
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
		this.setHealthPoints(26250);
		this.setAttackPoints(152500);
		this.setEnchancementModifier(25.75);
		this.setCanEvolve(false);
	}
}
