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
	
	public void start()
	{
		addPokemon();
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public void addPokemon()
	{
		Dratini dratini = new Dratini();
		Dragonair dragonair = new Dragonair();
		Dragonite dragonite = new Dragonite();
		Raikou raikou = new Raikou();
		Rayquaza rayquaza = new Rayquaza();
		Salamence salamence = new Salamence();
		Zapdos zapdos = new Zapdos();
		
		pokedex.add(dratini);
		pokedex.add(dragonair);
		pokedex.add(dragonite);
		pokedex.add(raikou);
		pokedex.add(rayquaza);
		pokedex.add(salamence);
		pokedex.add(zapdos);
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
}
