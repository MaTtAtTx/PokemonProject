package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokedexPanel extends JPanel
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
	private JPanel thirdType;
	private JPanel fourthType;
	
	private SpringLayout appLayout;

	public PokedexPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		healthLabel = new JLabel("health");
		attackLabel = new JLabel("attack");
		modifierLabel = new JLabel("modifier");
		numberLabel = new JLabel("number");
		nameLabel = new JLabel("name");
		evolvableLabel = new JLabel("evolvable");
		iconLabel = new JLabel("pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/logo.png")), JLabel.CENTER);
		
		healthField = new JTextField("hp");
		attackField = new JTextField("ap");
		modifierField = new JTextField("mod");
		numberField = new JTextField("##");
		nameField = new JTextField("name");
		evolvableBox = new JCheckBox();
		
		descriptionArea = new JTextArea(5,10);
		typeArea = new JTextArea(4,15);
		
		saveButton = new JButton("save");
		clearButton = new JButton("clear");
		pokedexDropdown = new JComboBox();
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		appLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setBackground(new Color(((int) (Math.random() * 256)), ((int) (Math.random() * 256)), ((int) (Math.random() * 256))));
		this.add(healthLabel);
		this.add(healthField);
		this.add(attackLabel);
		this.add(attackField);
		this.add(modifierLabel);
		this.add(modifierField);
		this.add(numberLabel);
		this.add(numberField);
		this.add(nameLabel);
		this.add(nameField);
		this.add(evolvableLabel);
		this.add(evolvableBox);
		this.add(iconLabel);
		this.add(pokedexDropdown);
		this.add(saveButton);
		this.add(clearButton);
		this.add(descriptionArea);
		this.add(typeArea);
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
