package aula;
import java.util.Scanner;

public class aula {

	public static void main(String[] args) {
		String nome;
		
		System.out.println("Informe o seu nome");
		Scanner scan = new Scanner (System.in);
		nome = scan.nextLine();
		
		System.out.println("O nome informado foi " + nome);
		

	}

}
