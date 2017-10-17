package Medallistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Registro extends JPanel{
	private VentanaParcial ref;
	public Registro (VentanaParcial _ref) {
		ref = _ref;	
	
	setLayout(new GridBagLayout());
	this.setBackground(Color.BLACK);
	
	Border borde = BorderFactory.createTitledBorder("");
	setBorder(borde);
	
	GridBagConstraints constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 0;
	constraint.fill = GridBagConstraints.BOTH;
	Insets insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	
	
	
	JLabel imagen = new JLabel();
	ImageIcon icono = new ImageIcon("img/logo.jpg");
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 1;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	imagen.setIcon(icono);
	add(imagen, constraint);
	
	JLabel nombre1 = new JLabel("Visualizador de medallistas ");
	nombre1.setForeground(Color.white);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 2;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(nombre1, constraint);
	
	JLabel nombre2 = new JLabel("Registo Medaliista");
	nombre2.setForeground(Color.white);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 3;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(nombre2, constraint);
	
	JLabel nombre = new JLabel("Nombre                                ");
	nombre.setForeground(Color.cyan);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 4;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(nombre, constraint);

	JTextField nom = new JTextField();
	constraint = new GridBagConstraints();
	constraint.gridx = 1;
	constraint.gridy = 4;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(nom, constraint);
	}

}
