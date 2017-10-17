package Medallistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class VentanaParcial extends JFrame {
	private int c = 0;
	Registro registro;
	Mostrar mostrar;
	ArrayList<Medallista> medallista;
	private DefaultTableModel ref_tab;

	private ArrayList<Medallista> ave;

	VentanaParcial() {
		super("Medallistas");
		iniciar();
		componente();
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}

	public VentanaParcial iniciar() {

		Dimension dims = new Dimension(750, 700);
		//this.getContentPane().setBackground(Color.black);
		this.setSize(dims);
		this.setPreferredSize(dims);
		/*
		 * Ordenamiento del Jframe
		 */
		this.getContentPane().setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}

	public void componente() {
		medallista = new ArrayList<Medallista>();

		registro = new Registro(this);
		add(registro, BorderLayout.WEST);

		mostrar = new Mostrar();
		add(mostrar, BorderLayout.CENTER);

	}

	/*public void agregarAve(String nom, String esp, int edad, int puntos) {
		if (c == 0) {
			Aves ave1 = new Aves("piolin", "canario", 12, 98);
			ave.add(ave1);
			Aves ave2 = new Aves("kevin", "guacamaya", 34, 39);
			ave.add(ave2);
			Aves ave3 = new Aves("carioca", "aguila", 3, 1);
			ave.add(ave3);
			Aves ave4 = new Aves("scuttle", "loro", 71, 63);
			ave.add(ave4);
			Aves ave5 = new Aves("valiant", "paloma", 20, 5);
			ave.add(ave5);
			Aves nuevaAve = new Aves(nom, esp, edad, puntos);
			ave.add(nuevaAve);
			c++;
			actualizarTabla();
		} else {
			Aves nuevaAve = new Aves(nom, esp, edad, puntos);
			ave.add(nuevaAve);
			actualizarTabla();
		}
	}

	public void actualizarTabla() {
		// Vamos a enviar el arrayList (personas) para poder pintarlo en mi tabla que
		// esta en la clase Listado
		listado.refrescarLista(ave);

	}*/

}
