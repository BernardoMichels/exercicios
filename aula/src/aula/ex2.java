package aula;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		int numero, numero_MULT, i;
		
		System.out.println("Informe o numero que a tabuara ira gerar");
		Scanner scan = new Scanner(System.in);
		
		numero = scan.nextInt();
		
		for (i=1; i<11; i++) {
			
			numero_MULT = numero*i;
			System.out.println(numero_MULT);
			
		}
		
	}

}
