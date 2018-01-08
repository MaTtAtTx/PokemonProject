package pokemon.controller;

import pokemon.model.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pokemon.view.PokemonFrame;

public class PokemonController
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public void buildPokedex()
	{
		pokedex.add(new Dratini());
		pokedex.add(new Dragonair());
		pokedex.add(new Dragonite());
		pokedex.add(new Raikou());
		pokedex.add(new Rayquaza());
		pokedex.add(new Salamence());
		pokedex.add(new Zapdos());
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		boolean valid = false;

		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "Only integer values are valid: " + input + " is not.");
		}

		return valid;
	}
	
	public boolean isValidDouble(String input)
	{
		boolean valid = false;

		try
		{
			Boolean.parseBoolean(input);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(appFrame, "Only boolean values are valid: " + input + " is not.");
		}

		return valid;
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
}

