package com.mycompany.mavenproject5;
import java.util.Scanner;
public class Mavenproject5 {

    public static void main(String[] args) {
        
        int[] vet = new int[]{2, 2, 3, 4, 5, 7, 7, 8, 8, 9};
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        for (int i = 0; i < vet.length; i++) 
        {
            if (i < 5)
            {
                if (i % 2 == 0) 
                {
                    vet1[i] = vet[i];
                } 
                else 
                {
                    vet2[i] = vet[i];
                }
            } 
            else 
            {
                int j = i - 5;
                if (i % 2 == 0) 
                {
                    vet1[j] = vet[i];
                } 
                else 
                {
                    vet2[j] = vet[i];
                }
            }
        }
        for (int i = 0; i < vet1.length; i++) 
        {
            System.out.println("Vet 1: " + vet1[i]);
            System.out.println("Vet 2: " + vet2[i]);
        }
    }
}
