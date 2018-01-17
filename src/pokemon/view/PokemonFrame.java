package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.JFrame;

/**
 * The JFrame subclass for the pokemon project.
 * 
 * @author Matthew Johnsen
 * @version 12/18/17 1.2
 */

public class PokemonFrame extends JFrame
{
	private PokemonController appController;
	private PokedexPanel appPanel;

	public PokemonFrame(PokemonController appController)
	{
		super();
		this.appController = appController;
		appPanel = new PokedexPanel(appController);

		setupFrame();
	}

	/**
	 * This helper method setups the frame and makes it visible while putting the panel into it.
	 */
	private void setupFrame()
	{
		this.setSize(500, 400);
		this.setTitle("Pokedex");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
}
