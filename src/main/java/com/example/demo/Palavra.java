package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Palavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Dividir a frase em palavras e armazenar no ArrayList
        String[] palavrasArray = frase.split(" ");
        for (String palavra : palavrasArray) {
            palavras.add(palavra);
        }

        // Remover palavras com menos de 4 caracteres
        Iterator<String> iterator = palavras.iterator();
        while (iterator.hasNext()) {
            String palavra = iterator.next();
            if (palavra.length() < 4) {
                iterator.remove();
            }
        }

        // Exibir a lista resultante
        System.out.println("Palavras com 4 ou mais caracteres: " + palavras);
    }
}