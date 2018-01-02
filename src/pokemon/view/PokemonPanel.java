package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The JPanel subclass for the Pokemon project.
 * 
 * @author Matthew Johnsen
 * @version 12/18/17 1.2
 */

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	private JComboBox test;

	/**
	 * This is the constructor for the GUIPanel where all the Panel components are initialized.
	 * @param appcontroller
	 */
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;

		//Initialize GUI data members
		appLayout = new SpringLayout();

		//call new helper methods
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * This helper method adds the specific components you want to the GUIPanel and you also must
	 * set the layout to the appLayout you made in this helper method.
	 */
	private void setupPanel()
	{
		this.setBackground(new Color(((int) (Math.random() * 256)), ((int) (Math.random() * 256)), ((int) (Math.random() * 256))));
		this.setLayout(appLayout);
	}

	/**
	 * All the constraints on the components of the panel go into this helper method. If you move
	 * components around in the WindowBuilder Editor, the coding of the constraints will move back to
	 * the chatPanel constructor.
	 */
	private void setupLayout()
	{

	}

	/**
	 * This helper method contains the action listeners you create, which are action for different things like
	 * clicking for buttons, etc.
	 */
	private void setupListeners()
	{
		
	}
}
