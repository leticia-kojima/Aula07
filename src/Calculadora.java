import java.util.Scanner;

public class Calculadora {
	
	//public static double resultado = 0;
	public static double valor1 = 0, valor2 = 0;
	public static double resultadoSoma, resultadoSub, resultadoDiv, resultadoMult;

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		
		while (opcao!=6) {
			
			exibirMenu();
			
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				processarDigitacao(leitor);
				
				break;
			case 2:
				processarSoma();
				
				break;
			case 3:
				processarSubtracao();
				break;
			case 4:
				processarDivisao();
				break;
			case 5:
				processarMultiplicacao();
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

	public static void processarDigitacao(Scanner leitor) {
		System.out.println("\n\nDigite o 1º valor:");
		valor1 = leitor.nextDouble();
		System.out.println("\n\nDigite o 2º valor:");
		valor2 = leitor.nextDouble();
		
		System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
	}

	public static void processarMultiplicacao() {
		System.out.println("\n\nRealizando a multiplicação entre " + valor1 + " e " + valor2);
		resultadoMult = multiplicar(valor1, valor2);
		imprimirResultado(resultadoMult);
	}

	public static void processarDivisao() {
		System.out.println("\n\nRealizando a divisão entre " + valor1 + " e " + valor2);
		resultadoDiv = dividir(valor1, valor2);
		imprimirResultado(resultadoDiv);
	}

	public static void processarSubtracao() {
		System.out.println("\n\nRealizando a subtração entre " + valor1 + " e " + valor2);
		resultadoSub = subtrair(valor1, valor2);
		imprimirResultado(resultadoSub);
	}
	
	//modificador de acesso -  static - tipoRetorno - nomeMetodo
	
	public static void processarSoma() {
		System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
		resultadoSoma = somar(valor1, valor2);
		imprimirResultado(resultadoSoma);
		
	}
	
	public static double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	public static double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	public static double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}
	
	public static double dividir(double denominador, double divisor) {
		if (divisor == 0) {
			return 0;
		}else {
			double resultado = denominador/divisor;
			return resultado;
		}

	}
	
	public static void imprimirResultado(double valorResultado) {
		if (valorResultado > 0 ) {
			System.out.println("O resultado é " + valorResultado + "!\n\n");			
		}else {
			System.out.println("Erro! Não foi possível efetuar o cálculo");
		}
				
	}
	
	public static void exibirMenu() {
		
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua opção!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtração");
		System.out.println("4 - Realizar divisão");
		System.out.println("5 - Realizar multiplicação");
		System.out.println("6 - Sair");
		
	}

}
