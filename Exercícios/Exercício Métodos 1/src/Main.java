import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		// Calculadora
		Scanner scan = new Scanner(System.in);
		
		int a, b;
				
		System.out.println("Exercício calculadora");
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		Calculadora.soma(a, b);
		Calculadora.subtracao(a, b);
		Calculadora.multiplicacao(a, b);
		Calculadora.divisao(a, b);
		
		// Mensagem
		
		int hora;
		
		System.out.println("Digite o horário atual: ");
		hora = scan.nextInt();
		
		Mensagem.obterMensagem(hora);
		
		// Empréstimo
		
		double valor;
		int parcelas;
		System.out.println("Digite o valor do empréstimo: ");
		valor = scan.nextDouble();
		System.out.println("Digite o número de parcelas: ");
		parcelas = scan.nextInt();
		
		Emprestimo.calcular(valor, parcelas);

	}

}
