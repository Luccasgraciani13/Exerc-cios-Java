package primeiraquestao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args)
	{

		int num1;
		int num2;
		int soma;
		int Subtracao;
		int multiplicacao;
		int divisao;
		int resto;
		
		Scanner leitor = new Scanner (System.in);
			System.out.println("Olá, digite dois números inteiros: ");
			
			System.out.println("Digite o primeiro número:");
			num1 = leitor.nextInt();
			
			System.out.println("Digite agora o segundo");
			num2 = leitor.nextInt();

		
	    soma = (num1+num2);
	    System.out.println("Soma igual a:" +soma);
	    
		Subtracao = (num1-num2);
		System.out.println("Subtração igual a:" +Subtracao);
		
 		multiplicacao = num1*num2;
 		System.out.println("Multiplicação igual a:" +multiplicacao);
 		
		divisao = num1/num2;
		System.out.println("Divisão igual a:" +divisao);
		
		resto = num1%num2;
		System.out.println("Resto igual a:" +resto);
		
		}
		
		
	

		


}
