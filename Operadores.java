package calculadora;

public class Operadores {
	
	public void somar (double a, double b) {
		double resultado = a + b;
		System.out.println("a soma entre " + a + " e " + b + " � " + resultado);
	}
	
	public void subtrair(double a, double b) {
		double resultado = a - b;
		System.out.println("a subtra��o entre " + a + " e " + b + " � " + resultado);
	}
	
	public void multi(double a, double b) {
		double resultado = a * b;
		System.out.println("a multiplica��o entre " + a + " e " + b + " � " + resultado);
	}
	
	public void div(double a, double b) {
		double resultado = a / b;
		System.out.println("a divis�o entre " + a + " e " + b + " � " + resultado);
	}
}
