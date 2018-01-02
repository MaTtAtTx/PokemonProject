package pokemon.controller;

import pokemon.model.Pokemon;
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
}
