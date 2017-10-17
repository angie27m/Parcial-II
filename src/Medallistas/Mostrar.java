package Medallistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Mostrar extends JPanel {
	public ArrayList<Object[]> ref_arr = new ArrayList<Object[]>();
	public int c = 0;
	private DefaultTableModel referencia_tabla_model1 = new DefaultTableModel();
	private DefaultTableModel referencia_tabla_model2 = new DefaultTableModel();
	private DefaultTableModel referencia_tabla_model3 = new DefaultTableModel();
	public String[] columnas1 = { "Nombre", "Apellido", "Tipo", "Numero", "Edad", "Peso", "Altura", "Celular",
			"Dirección", "Puesto" };
	public String[][] filas1 = {
			{ "Nombre", "Apellido", "Tipo", "Numero", "Edad", "Peso", "Altura", "Celular", "Dirección", "Puesto" } };
	public String[] columnas2 = { "Nombre", "Apellido", "Tipo", "Numero", "Edad", "Peso", "Altura", "Celular",
			"Dirección", "Puesto" };
	public String[][] filas2 = {
			{ "Nombre", "Apellido", "Tipo", "Numero", "Edad", "Peso", "Altura", "Celular", "Dirección", "Puesto" } };
	public String[] columnas3 = { "Nombre", "Apellido", "Tipo", "Numero", "Edad", "Peso", "Altura", "Celular",
			"Dirección", "Puesto" };
	public String[][] filas3 = {
			{ "Nombre", "Apellido", "Tipo", "Numero", "Edad", "Peso", "Altura", "Celular", "Dirección", "Puesto" } };
	private JTable tabla_oro, tabla_plata, tabla_bronce;
	private Object[][] tableContents1, tableContents2, tableContents3;

	public Mostrar() {
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

		tableContents1 = new Object[0][0];
		referencia_tabla_model1 = new DefaultTableModel(tableContents1, columnas1);
		tabla_oro = new JTable(referencia_tabla_model1);
		tabla_oro.setBackground(Color.black);
		tabla_oro.setForeground(Color.white);
		this.add(new JScrollPane(tabla_oro));
		constraint.gridx = 0;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(tabla_oro, constraint);

		JLabel oro = new JLabel();
		ImageIcon icono1 = new ImageIcon("img/oro.jpg");
		oro.setIcon(icono1);
		constraint.gridx = 1;
		constraint.gridy = 1;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(oro, constraint);

		tableContents2 = new Object[0][0];
		referencia_tabla_model2 = new DefaultTableModel(tableContents2, columnas2);
		tabla_plata = new JTable(referencia_tabla_model2);
		tabla_plata.setBackground(Color.black);
		tabla_plata.setForeground(Color.white);
		//this.add(new JScrollPane(tabla_plata));
		constraint.gridx = 1;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(tabla_plata, constraint);

		JLabel plata = new JLabel();
		ImageIcon icono2 = new ImageIcon("img/plata.jpg");
		plata.setIcon(icono2);
		constraint.gridx = 0;
		constraint.gridy = 2;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(plata, constraint);

		tableContents3 = new Object[0][0];
		referencia_tabla_model3 = new DefaultTableModel(tableContents3, columnas3);
		tabla_bronce = new JTable(referencia_tabla_model3);
		tabla_bronce.setBackground(Color.black);
		tabla_bronce.setForeground(Color.white);
		//this.add(new JScrollPane(tabla_bronce));
		constraint.gridx = 0;
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(tabla_bronce, constraint);

		JLabel bronce = new JLabel();
		ImageIcon icono3 = new ImageIcon("img/bronce.jpg");
		bronce.setIcon(icono3);
		constraint.gridx = 1;
		constraint.gridy = 3;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(bronce, constraint);

		JButton mostrar = new JButton("Mostrar Medallistas");
		constraint.gridx = 0;
		constraint.gridy = 4;
		constraint.fill = GridBagConstraints.BOTH;
		insets = new Insets(5, 10, 5, 10);
		constraint.insets = insets;
		add(mostrar, constraint);

		mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		}

		);
	}

	public Mostrar(ArrayList<Object[]> ref_arr) {

		super();
		this.ref_arr = ref_arr;

		this.setVisible(true);
	}

	// Metodo para actualizar mi tabla, recibe el arrayList con las aves registradas
	public void refrescarLista(ArrayList<Medallista> ave) {

		tableContents1 = new Object[ave.size()][10];
		for (int i = 0; i < ave.size(); i++) {
			tableContents1[i][9] = ave.get(i).getPuesto();
			if (tableContents1[i][9].equals("Puesto 1")) {
				for (int j = 0; j < ave.size(); j++) {
					tableContents1[j][0] = ave.get(j).getNombre();
					tableContents1[j][1] = ave.get(j).getApellido();
					tableContents1[j][2] = ave.get(j).getTipo();
					tableContents1[j][3] = ave.get(j).getNumero();
					tableContents1[j][4] = ave.get(j).getEdad();
					tableContents1[j][5] = ave.get(j).getPeso();
					tableContents1[j][6] = ave.get(j).getAltura();
					tableContents1[j][7] = ave.get(j).getCelular();
					tableContents1[j][8] = ave.get(j).getDireccion();
					tableContents1[j][9] = ave.get(j).getPuesto();
				}
				referencia_tabla_model1.setDataVector(tableContents1, columnas1);
			} else if (tableContents1[i][9].equals("Puesto 2")) {
				for (int j = 0; j < ave.size(); j++) {
					tableContents2[j][0] = ave.get(j).getNombre();
					tableContents2[j][1] = ave.get(j).getApellido();
					tableContents2[j][2] = ave.get(j).getTipo();
					tableContents2[j][3] = ave.get(j).getNumero();
					tableContents2[j][4] = ave.get(j).getEdad();
					tableContents2[j][5] = ave.get(j).getPeso();
					tableContents2[j][6] = ave.get(j).getAltura();
					tableContents2[j][7] = ave.get(j).getCelular();
					tableContents2[j][8] = ave.get(j).getDireccion();
					tableContents2[j][9] = ave.get(j).getPuesto();
				}
				referencia_tabla_model2.setDataVector(tableContents2, columnas2);
			} else if (tableContents1[i][9].equals("Puesto 3")) {
				for (int j = 0; j < ave.size(); j++) {
					tableContents3[j][0] = ave.get(j).getNombre();
					tableContents3[j][1] = ave.get(j).getApellido();
					tableContents3[j][2] = ave.get(j).getTipo();
					tableContents3[j][3] = ave.get(j).getNumero();
					tableContents3[j][4] = ave.get(j).getEdad();
					tableContents3[j][5] = ave.get(j).getPeso();
					tableContents3[j][6] = ave.get(j).getAltura();
					tableContents3[j][7] = ave.get(j).getCelular();
					tableContents3[j][8] = ave.get(j).getDireccion();
					tableContents3[j][9] = ave.get(j).getPuesto();
				}
				referencia_tabla_model3.setDataVector(tableContents3, columnas3);
			}
		}

	}
}
