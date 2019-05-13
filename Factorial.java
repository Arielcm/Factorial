package factorial;

public class Factorial {

	public int CalculoFactorial(int valor) {
		if(valor>1) {
			int calculo=valor * CalculoFactorial(valor -1);
			return calculo;
		}
		return 1;
	}
}
