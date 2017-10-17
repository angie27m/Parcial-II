package Medallistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class VentanaParcial extends JFrame {
	Medallista med;
	private int c = 0;
	Registro registro;
	Mostrar mostrar;
	private DefaultTableModel ref_tab;

	private ArrayList<Medallista> medallista;

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

	public void agregarMedallista(String nom, String apellido, String tipo, int numero, int edad, int peso, int altura, int celular, String direccion, String puesto) {
		if (c == 0) {
			Medallista med1 = new Medallista("Usain", "Bolt", "Cedula", 107626262, 32, 78, 185, 310001722, "Calle 12 #34-5", "Puesto 1");
			medallista.add(med1);
			Medallista med2 = new Medallista("Mariana", "Pajón", "Cedula", 145926262, 27, 58, 167, 323401722, "Calle 1 #10-5", "Puesto 1");
			medallista.add(med2);
			Medallista med3 = new Medallista("Eduard", "Fierron", "Cedula", 1070178280, 18, 50, 172, 320601722, "Cra 3 #9-5", "Puesto 1");
			medallista.add(med3);
			Medallista nuevaAve = new Medallista(nom, apellido, tipo, numero, edad, peso, altura, celular, direccion, puesto);
			medallista.add(nuevaAve);
			c++;
			actualizarTabla();
		} else {
			Medallista nuevaAve = new Medallista(nom, apellido, tipo, numero, edad, peso, altura, celular, direccion, puesto);
			medallista.add(nuevaAve);
			actualizarTabla();
		}
	}

	public void actualizarTabla() {
		// Vamos a enviar el arrayList (personas) para poder pintarlo en mi tabla que
		// esta en la clase Listado
		mostrar.refrescarLista(medallista);

	}

}
