package aula;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		String nomeAluno;
		int n=4;
		float media=0;
		float vetor[]= {0,0,0,0};
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o nome do aluno");
		nomeAluno = scan.nextLine();
		System.out.println("Informe as suas 4 notas");
		
		
		for (int i=0; i<n; i++) {
			vetor[i] = scan.nextFloat();
			media+= vetor[i];
		}
		
		media = media/ n;
		//System.out.println(media);
		System.out.printf("%.2f", media);
		
	}

}
