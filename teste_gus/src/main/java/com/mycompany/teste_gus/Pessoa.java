/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste_gus;

import java.util.Random;

/**
 *
 * @author MrZar
 */
public class Pessoa {
    
   double peso = new Random().nextDouble(100);
   int idade = new Random().nextInt(100);
   static String nome = "Bernardo";
   static String endereco = "Australia"; //Coisas estaticas vao sempre ter o mesmo valor independente da instacia
}