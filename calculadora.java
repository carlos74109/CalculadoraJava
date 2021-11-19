package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Operadores operacao = new Operadores();
		
		Scanner repeticao = new Scanner(System.in);
		
		String repetir = "sim";
		Scanner entrada = new Scanner(System.in);
		Scanner entradaOperador = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		while(repetir.equalsIgnoreCase("sim")) {
			System.out.println("Digite o primeiro número: ");
			double n1 = entrada.nextDouble();
			
			System.out.println("Digite o operador: ");
			String operador = entradaOperador.nextLine();
			
			System.out.println("Digite outro número");
			double n2 = entrada2.nextDouble();
			
			if(operador.equals("+")) {
				operacao.somar(n1, n2);
			}else if (operador.equals("-")) {
				operacao.subtrair(n1, n2);
			}else if (operador.equals("*")) {
				operacao.multi(n1, n2);
			}else if(operador.equals("/")) {
				operacao.div(n1, n2);
			}
			System.out.println("Dejesa continuar na calculadora? ");
			repetir = repeticao.nextLine();
			
			
		}
		repeticao.close();
		entrada.close();
		entradaOperador.close();
		entrada2.close();
		System.out.println("Aplicativo encerrado");
		
	}

}
