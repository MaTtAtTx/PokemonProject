package pokemon.model;

public class Dratini extends Pokemon implements Dragon
{
	public Dratini()
	{
		super(147, "Dratini");
		setup();
	}
	
	public Dratini(String name)
	{
		super(147, name);
		setup();
	}
	
	public Dratini(int number, String name)
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
	
	protected void setup()
	{
		this.setHealthPoints(100);
		this.setAttackPoints(100);
		this.setEnchancementModifier(1.0);
		this.setCanEvolve(true);
	}
}
