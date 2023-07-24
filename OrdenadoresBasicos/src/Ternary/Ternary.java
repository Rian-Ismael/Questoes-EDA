package Ternary;

import java.util.Arrays;

/**
 * @author Cláudio Campelo
 * 
 * Classe ordena um tipo de array ternário. Este array ternário armazena apenas 3 elementos diferentes,
 * de mesmo tipo, onde cada um deles pode aparecer em qualquer quantidade q, tal que q > 0.
 * 
 * Entrada = {1,0,2,0,0,0,2,0,1} | Saída {0,0,0,0,1,1,2,2}
 * Entrada = {5,5,4,20,20,5,4,4,4} | Saída {4,4,4,4,5,5,5,20,20}
 * 
 * O algoritmo implementado deve seguir as especificações/restricoes abaixo:
 * 
 * 1. Deve ser O(n);
 * 2. Deve ser um algoritmo de ordenacao por comparacao (uso de <, <=, >, >=, ==)
 * 3. Deve ser in-place, ou seja, não pode usar estruturas auxiliares de nenhum tipo ou tamanho;
 * 
 * ATENÇÃO: não é preciso tratar entradas inválidas (não serão testadas).
 *  
 * Uma solução O(n) para este problema seria inspirada no counting sort. Bastaria utilizar 3 variáveis para serem
 * utilizadas como contadores para cada um dos 3 diferentes elementos (essas variáveis seriam atualizadas em uma única passagem
 * pelo array). Para finalizar, bastaria passar novamente pelo array atualizando os elementos com base nos contadores. 
 * Note que esta solução poderia ser dita como in-place apenas porque foram utilizadas 3 variáveis ao invés de um array 
 * auxiliar de tamanho 3. 
 * 
 * No entanto, sua solução *** NÃO PODE SER *** como esta acima (baseada em contadores de frequência). 
 * 
 */
//public interface TernaryArraySorting<T extends Comparable<T>> {

   // void sort(T[] ternaryArray);

//}
 

public class Ternary {
    public static int partition(int[] array, int left, int right) {
        int max = maximum(array, left, right);
        swap(array, left, max);
        int pivot = array[left];
        int i = left;
        for (int j = left + 1; j <= right; j++) {
            if (array[j] < pivot) {
                i += 1;
                swap(array, i, j);
            }
        }
        swap(array, left, i);
        return i;
    }

    public static int maximum(int[] array, int left, int right) {
        int indexMax = left;
        for (int i = left + 1; i <= right; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static void swap(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 10, 30, 30, 30, 20, 10, 20, 20, 20, 30, 30, 10 };
        int i = partition(array, 0, array.length - 1);
        System.out.println(i + " " + Arrays.toString(array));
        i = partition(array, 0, i - 1);
        System.out.println(i + " " + Arrays.toString(array));
    }
}
