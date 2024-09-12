package org.example.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OperacoesBasicas {

    public int soma(int primeiroValor, int segundoValor) {
        return primeiroValor + segundoValor;
    }

    public int subtracao(int primeiroValor, int segundoValor) {
        return primeiroValor - segundoValor;
    }

    public int multiplicacao(int primeiroValor, int segundoValor) {
        return primeiroValor * segundoValor;
    }

    public double divisao(double primeiroValor, double segundoValor) {
        return primeiroValor / segundoValor;
    }

    public double mediaAritmetica(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int somatorioNotas = 0;
        int quantidadeNotas = 0;

        try {
            System.out.println("Quantas notas serao informadas?");
            quantidadeNotas = Integer.parseInt(reader.readLine());

            System.out.println("Informe as notas: ");
            for(int i = 0; i < quantidadeNotas; i++){
                somatorioNotas += Integer.parseInt(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("A media final e: ");
        return somatorioNotas / quantidadeNotas;
    }

    public double mediaGeometrica() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantNumeros = 0;
        double produto = 1.0;
        double mediaGeometrica = 0.0;

        try {
            System.out.print("Informe quantidade de numeros: ");
            quantNumeros = Integer.parseInt(reader.readLine());

            System.out.println("Informe os numeros: ");
            for(int i = 0; i < quantNumeros; i++){
                int numeroLido = Integer.parseInt(reader.readLine());
                produto *= numeroLido;
            }

            mediaGeometrica = Math.pow(produto, 1.0 / quantNumeros);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print("A media geometrica e: ");
        return mediaGeometrica;
    }

//    public String confereAnagrama() {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Informe uma palavra: ");
//
//        try {
//            String[] palavra = new String[]{reader.readLine()};
//
//            for(int i = 0; i < palavra.length; i++){
//                System.out.println(Arrays.stream(palavra).reduce(i));
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        return "";
//    }

//    percorer lista de numero e buscar os dois maiores valores

//    fibonacci
}
