/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.teste_gus;

import java.text.MessageFormat;

/**
 *
 * @author MrZar
 */
public class Teste_gus {

    public static void main(String[] args) {   
    
    Pessoa pessoa = new Pessoa ();
    System.out.println(String.valueOf(pessoa.idade) + "-" + pessoa.peso + "-" + pessoa.nome); // String valeOf significa "mudar" para string o valor.
    System.out.println(MessageFormat.format("Pessoa 1: idade:{0} peso:{1} Nome:{2}", pessoa.idade, pessoa.peso, pessoa.nome)); //insterpolacao aqui
    System.out.println(MessageFormat.format("endereco:{0} Nome:{1}", Pessoa.endereco, Pessoa.nome)); // aqui tambem
   
    Pessoa outra_pessoa = new Pessoa();
    System.out.println(String.valueOf(outra_pessoa.idade) + "-" + outra_pessoa.peso + "-" + outra_pessoa.nome); // String valeOf significa "mudar" para string o valor.
    System.out.println(MessageFormat.format("Pessoa 2: idade:{0} peso:{1} Nome:{2}", outra_pessoa.idade, outra_pessoa.peso, outra_pessoa.nome)); //insterpolacao aqui
    System.out.println(MessageFormat.format("endereco:{0} Nome:{1}", Pessoa.endereco, Pessoa.nome)); //aqui tambem
    }
}
