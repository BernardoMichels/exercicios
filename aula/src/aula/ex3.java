package aula;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	
		// usar b += 10; faz b = b + 10
		
		String nome1 = "mestre do universo";
		String nome2, temp;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("informe uma string");
		nome2 = scan.nextLine();
		
		temp = nome1;
		nome1 = nome2;
		nome2 = temp;
		
		System.out.println(nome1 + " " + nome2);
		
		

	}

}
