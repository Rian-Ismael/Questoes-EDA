package BuscaBinaria;

public class firstRecursivo {

    // RETORNA ÍNDICE DA PRIMEIRA OCORRÊNCIA DE UM NÚMERO
    public static int firstOccurrence(int[] array, int x, int left, int right) {
        int result = -1;
        
        if (left <= right) {
            int middle = (left + right) / 2;
            
            if (middle != 0 && array[middle - 1] == x) {
                result = firstOccurrence(array, x, left, middle - 1);
                
            } else if (array[middle] == x) {
                result = middle;
                
            } else if (array[middle] < x) {
                result = firstOccurrence(array, x, middle + 1, right);
                
            } else { // array[middle] > x
                result = firstOccurrence(array, x, left, middle - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 0, 1, 1, 1, 1, 2, 3, 4 };

        int res = firstOccurrence(array, 1, 0, array.length - 1);
        System.out.println(res); // 1

        res = firstOccurrence(array, 4, 0, array.length - 1);
        System.out.println(res); // 7

        res = firstOccurrence(array, 3, 0, array.length - 1);
        System.out.println(res); // 6

        res = firstOccurrence(array, 0, 0, array.length - 1);
        System.out.println(res); // 0

        res = firstOccurrence(array, 50, 0, array.length - 1);
        System.out.println(res); // -1

        res = firstOccurrence(array, -50, 0, array.length - 1);
        System.out.println(res); // -1
    }
}
