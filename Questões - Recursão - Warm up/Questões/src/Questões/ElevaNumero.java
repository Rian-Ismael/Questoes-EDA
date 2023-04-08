
package Questões;

public class ElevaNumero {

	public static int pot(int n, int a) {
		return potRecursivo(n, a, 0);
	}
	
	public static int potRecursivo(int n, int a, int indice) {
		int result = 1;
		if(indice == a) {
			
		} else {
			result = n * potRecursivo(n, a, indice+1);
		}
		
		return result;
	}
}
