	package pokemon.model;

public abstract class Pokemon
{
	private int healthPoints;
	private int attackPoints;
	private double enchancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;
	
	public Pokemon(int number, String name)
	{
		this.number = number;
		this.name = name;
	}
	
	public final String[] getPokemonTypes()
	{
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		
		for(int index = 0; index < types.length; index++)
		{
			String currentInterface = types[index].getCanonicalName();
			currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".", "");
			pokeTypes[index] = currentInterface;
		}
		
		return pokeTypes;
	}
	
	public String toString()
	{
		String description = "Hi, I am a " + name + ", and my HP is " + healthPoints;
		
		return description;
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}

	/**
	 * @return the healthPoints
	 */
	public int getHealthPoints()
	{
		return healthPoints;
	}

	/**
	 * @return the attackPoints
	 */
	public int getAttackPoints()
	{
		return attackPoints;
	}

	/**
	 * @return the enchancementModifier
	 */
	public double getEnchancementModifier()
	{
		return enchancementModifier;
	}

	/**
	 * @return the number
	 */
	public int getNumber()
	{
		return number;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @return the canEvolve
	 */
	public boolean isCanEvolve()
	{
		return canEvolve;
	}

	/**
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}

	/**
	 * @param attackPoints the attackPoints to set
	 */
	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}

	/**
	 * @param enchancementModifier the enchancementModifier to set
	 */
	public void setEnchancementModifier(double enchancementModifier)
	{
		this.enchancementModifier = enchancementModifier;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @param canEvolve the canEvolve to set
	 */
	public void setCanEvolve(boolean canEvolve)
	{
		this.canEvolve = canEvolve;
	}
}
