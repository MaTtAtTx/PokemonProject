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
		
		healthLabel = new JLabel("Health");
		attackLabel = new JLabel("Attack");
		modifierLabel = new JLabel("Modifier");
		numberLabel = new JLabel("Number");
		nameLabel = new JLabel("Name");
		evolvableLabel = new JLabel("Evolvable");
		iconLabel = new JLabel("Pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/logo.png")), JLabel.CENTER);
		
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

		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void updatePokedexInfo(int index)
	{
		//Update basic fields
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		
		//Update text areas
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current + "\n");
		}
	}

	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void updateTypePanels()
	{
		String [] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		if (types[0].equals("Electric"))
		{
			firstType.setBackground(new Color(248,208,48));
		}
		else if(types[0].equals("Dragon"))
		{
			firstType.setBackground(new Color(112,56,248));
		}
		else if(types[0].equals("Flying"))
		{
			firstType.setBackground(new Color(168,144,240));
		}
		else
		{
			firstType.setBackground(Color.WHITE);
		}
		
		if (types.length > 1)
		{
			if (types[1].equals("Electric"))
			{
				secondType.setBackground(new Color(248,208,48));
			}
			else if(types[1].equals("Dragon"))
			{
				secondType.setBackground(new Color(112,56,248));
			}
			else if(types[1].equals("Flying"))
			{
				secondType.setBackground(new Color(168,144,240));
			}
			else
			{
				secondType.setBackground(Color.WHITE);
			}
			
			if (types.length == 3)
			{
				if (types[2].equals("Electric"))
				{
					thirdType.setBackground(new Color(248,208,48));
				}
				else if(types[2].equals("Dragon"))
				{
					thirdType.setBackground(new Color(112,56,248));
				}
				else if(types[2].equals("Flying"))
				{
					thirdType.setBackground(new Color(168,144,240));
				}
				else
				{
					thirdType.setBackground(Color.WHITE);
				}
			}
		}
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setSize(500,400);
		this.setBackground(new Color(128, 60, 128));
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
	
	private void updateImage()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "logo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		
		iconLabel.setIcon(pokemonIcon);
	}

	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel, -98, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 0, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, typeArea, 0, SpringLayout.EAST, descriptionArea);
		appLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, -47, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, -47, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -38, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, -15, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -25, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, -5, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -7, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 0, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 30, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -130, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 40, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 40, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 40, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 40, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 40, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, -3, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, -4, SpringLayout.WEST, modifierField);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
	}

	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
	}
}
