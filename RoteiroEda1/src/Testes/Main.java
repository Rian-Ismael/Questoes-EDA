package Testes;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import Roteiro.BubbleSort;
import Roteiro.InsertionSort;
import Roteiro.MergeSort;
import Roteiro.QuickSort;
import Roteiro.SelectionSort;
import Roteiro.Sorting;

public class Main {
		
	public static void main(String[] args) {
        int[] tamanhos = {10000, 11000, 12000, 13000, 14000, 15000, 16000, 17000, 18000, 19000, 20000, 21000, 22000, 23000, 24000, 25000, 26000, 27000, 28000, 29000, 30000, 31000, 32000, 33000, 34000, 35000, 36000, 37000, 38000, 39000, 40000};

        // cria um array com as implementações de algoritmo de ordenação
        Sorting[] algoritmos = {new SelectionSort(), new InsertionSort(), new QuickSort(), new MergeSort(), new BubbleSort()};

        time(tamanhos, algoritmos);
    }
	
	public static void time(int[] tamanhos, Sorting[] algoritmos) {
		System.out.println("alg time sample");
        for (int tamanho : tamanhos) {
            Integer[] vetor = geradorVetor(tamanho);


            for (Sorting algoritmo : algoritmos) {
                long tempoInicio = System.currentTimeMillis();
                algoritmo.sort(Arrays.copyOf(vetor, vetor.length));
                long tempoFim = System.currentTimeMillis();
                long tempoExecucao = tempoFim - tempoInicio;
                System.out.print(algoritmo.getClass().getSimpleName() + " " + tempoExecucao +  " " + tamanho + "\n");
            }

        }
	}

	private static Integer[] geradorVetor(int tamanho) {
	    Integer[] vetor = new Integer[tamanho];
	    Random gerador = new Random();
	    for(int i = 0; i < vetor.length; i++) {
	        vetor[i] = gerador.nextInt(20000, 40000);
	    }
	    return vetor;
	}
	}
