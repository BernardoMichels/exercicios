package per;

import java.util.Scanner; 

public class Main {
	public static void main(String [] args) {
		
		Scanner Leitor = new Scanner (System.in);
		
		System.out.println(" meu nome eh Bernardo?");
		String pergunta = Leitor.next ();
		
		if (pergunta.contains ("sim")) {
		System.out.println("Resposta correta");
		
		}else if (pergunta.contains ("nao")) {
		System.out.println("Claramente meu nome eh Bernardo.");
		
		}else 
			System.out.println("a unica opcao eh sim meu chapa.");	{
	}
  }
}