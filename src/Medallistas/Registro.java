package Medallistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Registro extends JPanel{
	private VentanaParcial ref;
	public ArrayList medallista;
	Medallista datos;
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
	
	JLabel nombre3 = new JLabel("                   ");
	nombre3.setForeground(Color.white);
	constraint = new GridBagConstraints();
	constraint.gridx = 1;
	constraint.gridy = 3;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(nombre3, constraint);
	
	JLabel nombre = new JLabel("Nombre   ");
	nombre.setForeground(Color.cyan);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 4;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(nombre, constraint);

	JTextField nom = new JTextField("");
	constraint = new GridBagConstraints();
	constraint.gridx = 1;
	constraint.gridy = 4;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(nom, constraint);
	
	JLabel apellido = new JLabel("Apellido   ");
	apellido.setForeground(Color.cyan);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 5;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(apellido, constraint);

	JTextField ape = new JTextField("");
	constraint = new GridBagConstraints();
	constraint.gridx = 1;
	constraint.gridy = 5;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(ape, constraint);
	
	JLabel tipo = new JLabel("Tipo   ");
	tipo.setForeground(Color.cyan);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 6;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(tipo, constraint);
	 
	JComboBox tipo1 = new JComboBox();
	tipo1.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar","Cedula","T.Identidad","RegistroCivil"}));
	tipo1.setSelectedIndex(0);
	constraint = new GridBagConstraints();
	constraint.gridx = 1; 
	constraint.gridy = 6;
	constraint.fill = GridBagConstraints.BOTH; 
	insets = new Insets(8, 10, 8, 10);
	constraint.insets = insets;
	add(tipo1, constraint);
	
	JLabel numero = new JLabel("Numero ");
	numero.setForeground(Color.cyan);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 7;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(numero, constraint);
	
	JTextField num = new JTextField("");
	constraint = new GridBagConstraints();
	constraint.gridx = 1;
	constraint.gridy = 7;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(num, constraint);
	
	JLabel edad = new JLabel("Edad ");
	edad.setForeground(Color.cyan);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 8;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(edad, constraint);
	
	JTextField ed = new JTextField("");
	constraint = new GridBagConstraints();
	constraint.gridx = 1;
	constraint.gridy = 8;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(ed, constraint);
	
	JLabel peso = new JLabel("Peso ");
	peso.setForeground(Color.cyan);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 9;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(peso, constraint);
	
	JTextField pe = new JTextField("");
	constraint = new GridBagConstraints();
	constraint.gridx = 1;
	constraint.gridy = 9;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(pe, constraint);
	
	JLabel altura = new JLabel("Altura ");
	altura.setForeground(Color.cyan);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 10;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(altura, constraint);
	
	JTextField al = new JTextField("");
	constraint = new GridBagConstraints();
	constraint.gridx = 1;
	constraint.gridy = 10;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(al, constraint);
	
	JLabel celular = new JLabel("Celular ");
	celular.setForeground(Color.CYAN);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 11;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(celular, constraint);
	
	JTextField cel = new JTextField("");
	constraint = new GridBagConstraints();
	constraint.gridx = 1;
	constraint.gridy = 11;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(cel, constraint);
	
	JLabel direccion = new JLabel("Direccion ");
	direccion.setForeground(Color.cyan);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 12;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(direccion, constraint);
	
	JTextField dir = new JTextField("");
	constraint = new GridBagConstraints();
	constraint.gridx = 1;
	constraint.gridy = 12;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(dir, constraint);
	
	JLabel puesto = new JLabel("Direccion ");
	puesto.setForeground(Color.CYAN);
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 13;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(puesto, constraint);
	
	JComboBox pues = new JComboBox();
	pues.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar","Puesto 1","Puesto 2","Puesto 3"}));
	pues.setSelectedIndex(0);
	constraint = new GridBagConstraints();
	constraint.gridx = 1; 
	constraint.gridy = 13;
	constraint.fill = GridBagConstraints.BOTH; 
	insets = new Insets(8, 10, 8, 10);
	constraint.insets = insets;
	add(pues, constraint);
	
	JButton agrusuario = new JButton("AGREGAR MEDALLISTA");
	constraint = new GridBagConstraints();
	constraint.gridx = 0;
	constraint.gridy = 14;
	constraint.fill = GridBagConstraints.BOTH;
	insets = new Insets(5, 10, 5, 10);
	constraint.insets = insets;
	add(agrusuario, constraint);
	
	agrusuario.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
	            String nombre=nom.getText();
	            String apellido=ape.getText();
	            String tipo=tipo1.getActionCommand();
	            int numero=Integer.parseInt(num.getText());
	            int celular=Integer.parseInt(cel.getText());
	            int edad=Integer.parseInt(ed.getText());
	            int peso=Integer.parseInt(pe.getText());
	            int altura=Integer.parseInt(al.getText());
	        	String direccion=dir.getText();
	        	String puesto=pues.getActionCommand();

	            
	            
	           if(nom.equals("")){
	               JOptionPane.showMessageDialog(null, "Campo nombre vacio");
	           }else if(ape.equals("")){
	                 JOptionPane.showMessageDialog(null, "Campo apellido vacio");
	           }else if(num.equals("")){
	                 JOptionPane.showMessageDialog(null, "Campo numero vacio");
	           }else if(cel.equals("")){
	                 JOptionPane.showMessageDialog(null, "Campo especie vacio");
	           }else if(ed.equals("")){
	                 JOptionPane.showMessageDialog(null, "Campo edad vacio");
	           }else if(pe.equals("")){
	                 JOptionPane.showMessageDialog(null, "Campo peso vacio");
	           }else if(al.equals("")){
	                 JOptionPane.showMessageDialog(null, "Campo altura vacio");
	           }else if(dir.equals("")){
	                 JOptionPane.showMessageDialog(null, "Campo direccion vacio");
	           }else{
	        	  datos = new Medallista(nombre,apellido,tipo,numero,celular,edad,peso,altura,direccion,puesto);
	        	   medallista.add(datos);
	        	   System.out.println(medallista);
	              // _ref.Listar(nombre, apellido, tipo, numero, celular, edad, peso, altura, direccion, puesto);
	               nom.setText("");
	               ape.setText("");
	               num.setText("");
	               cel.setText("");
	               ed.setText("");
	               pe.setText("");
	               al.setText("");
	               dir.setText("");
	               
	           }
	        } catch (NumberFormatException ek) {
	            JOptionPane.showMessageDialog(null,"dato numericos mal ingresados", "Error", JOptionPane.ERROR_MESSAGE);
	        }
		}
	}
	);
	
	}
	
	
}
