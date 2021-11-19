package calculadora;

public class Operadores {
	
	public void somar (double a, double b) {
		double resultado = a + b;
		System.out.println("a soma entre " + a + " e " + b + " é " + resultado);
	}
	
	public void subtrair(double a, double b) {
		double resultado = a - b;
		System.out.println("a subtração entre " + a + " e " + b + " é " + resultado);
	}
	
	public void multi(double a, double b) {
		double resultado = a * b;
		System.out.println("a multiplicação entre " + a + " e " + b + " é " + resultado);
	}
	
	public void div(double a, double b) {
		double resultado = a / b;
		System.out.println("a divisão entre " + a + " e " + b + " é " + resultado);
	}
}
