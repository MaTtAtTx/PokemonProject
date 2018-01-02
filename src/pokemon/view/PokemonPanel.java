package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel modifierLabel;
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolvableLabel;
	private JLabel iconLabel;

	private JTextField healthField;
	private JTextField attackField;
	private JTextField modifierField;
	private JTextField numberField;
	private JTextField nameField;
	private JCheckBox evolvableBox;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thridType;
	private JPanel fourthType;
	private JPanel fifthType;
	private JPanel extraType;
	
	private SpringLayout appLayout;

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

	private void setupPanel()
	{
		this.setBackground(new Color(((int) (Math.random() * 256)), ((int) (Math.random() * 256)), ((int) (Math.random() * 256))));
		this.setLayout(appLayout);
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{
		
	}
	
	private void updatePokedexInfo(int index)
	{
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
	}
}
