package factorial;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		int numero=1;
		try {
		do {
		numero =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero entero positivo para conocer su Factorial\nPresione 0 para Salir "));
		if(numero!=0) {
		int result = factorial.CalculoFactorial(numero);
		JOptionPane.showMessageDialog(null, "El Factorial de "+numero+" es : "+result);
		}
		}while(numero!=0);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresaste una opcion no valida");
		}
	}

}
