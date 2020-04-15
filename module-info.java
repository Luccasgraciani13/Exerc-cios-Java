import java.util.Scanner;

public class exercicioagoravai {

	public static void main(String[] args) {
		
		String nome, cidade;
		Int idade;
		
		Scanner leitor = new Scanner ();
		
		System.out.println("Digite o seu nome");
		nome = leitor.next();
		
		System.out.println("Boas vindas," +nome);
	
		System.out.println("Digite a sua idade");
		idade = leitor.nextInt();
		
		System.out.println("Digite a sua cidade");
	    cidade = leitor.next();
	
	    System.out.println("Sua idade é:" +idade "Sua cidade é:" +cidade);
		
		
		
		

	}

}