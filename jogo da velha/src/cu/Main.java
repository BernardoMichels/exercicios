package cu;

import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
	
		   Scanner Leitor = new Scanner (System.in);
		  	   
		   System.out.println(Script.getA1());
		  		   
		   System.out.println("   A   B   C");
		   System.out.println("1  _"+Script.getA1()+"_|_"+Script.getB1()+"_|_"+Script.getC1()+"_");
           System.out.println("2  _"+Script.getA2()+"_|_"+Script.getB2()+"_|_"+Script.getC2()+"_");
           System.out.println("3  "+Script.getA3()+"   | "+Script.getB3()+"  | "+Script.getC3()+" ");
           
           System.out.println(" jogador 1, selecione um campo.");          
           System.out.println(" Jogador 1:");
           String jogador1 = Leitor.next();              
          
           System.out.println("   A   B   C");
		   System.out.println("1  _"+Script.getA1()+"_|_"+Script.getB1()+"_|_"+Script.getC1()+"_");
           System.out.println("2  _"+Script.getA2()+"_|_"+Script.getB2()+"_|_"+Script.getC2()+"_");
           System.out.println("3  "+Script.getA3()+"   | "+Script.getB3()+"  | "+Script.getC3()+" ");		  	    	
	 
           System.out.println(" jogador 2, selecione um campo.");          
           System.out.println(" Jogador 2:");
           String jogador2 = Leitor.next(); 
		
	}
	
}