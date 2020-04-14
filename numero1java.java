package src;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;


public class questao1 {

	public static void main(String[] args) {
		


    String nome,cidade;	
	String idade;
	

    InputStream leitor = (System.in);
	
	System.out.println("Digite seu nome e sua cidade: ");
	cidade = (Scanner) leitor.next();
	
	System.out.println("Digite seu nome e sua idade: ");
	idade = ((Iterator<String>) leitor).next();
	
	System.out.println("Boas vindas " +nome+ "e sua cidade é" +cidade);
	System.out.println("Você tem: " +idade+ "anos");
		
		
		
		
		
	}

}
