package cafeteria;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Cafe latte = new Cafe (1, "Latte", 1.50);
		Cafe flatwhite = new Cafe (2, "flatwhite", 2.50);
		Cafe lagrima = new Cafe (3, "lagrima", 1.30);
		Cafe expreso = new Cafe (4, "expreso", 1.0);
		
		LinkedList<Cafe> cafes = new LinkedList<>();
		cafes.add(latte);
		cafes.add(flatwhite);
		cafes.add(lagrima);
		cafes.add(expreso);
		
		
		}
	
	
	
	public static void Menu(Encargado encargado) {
		String e;
		JOptionPane.showMessageDialog(null, "Bienvenido a la cafeteria");
		e=JOptionPane.showInputDialog("Debera validar su condicion de empleado");
		if (Ingresoencargado(encargado)) {
			// Menufinal()
		}
			
		
	}
	
	public static boolean Ingresoencargado(Encargado encargado) {
		String n;
		int id, cont;
		n=JOptionPane.showInputDialog("Ingrese su nombre");
		Encargado enc = new Encargado(n, 1, 2);
		id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id"));
		cont=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña"));
		
		if (id==enc.getId()) {
			if (cont==enc.getContraseña()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	
	
	
}
