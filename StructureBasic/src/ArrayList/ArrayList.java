package ArrayList;

import java.util.Arrays;

public class ArrayList<String extends Comparable<String>>{

	private String[] list;
	private static final int DEFAULString = 20;
	private int tamanho; // quanto está sendo ocupado, não é indice válido.
	//private int capacidade; // estudos
	
	public ArrayList() {
		this.list = ((String[]) new Comparable[DEFAULString]);
		this.tamanho = 0;

	} 
	 
	public ArrayList(int capacidade) {
		this.list = ((String[]) new Comparable[capacidade]);
		//this.capacidade = capacidade; // tamanho total do array
		this.tamanho = 0;
	}

	public boolean add(String object) {

		  
		assegureCapacidade(this.tamanho + 1);

		
		
		this.list[this.tamanho++] = object;
		return true; 
	}

	public void add(int index, String object) { 
		if(index < 0 && index >= this.tamanho) {
			throw new IndexOutOfBoundsException("Fora de escopo");
		}
		
		assegureCapacidade(this.tamanho + 1); 
		
		shiftDireita(index); 
		
		this.list[index] = object; // colocou primeiro no tamanho e depois acrescenteu +1, tamanho atual 1, mas o indice válido é 0
		this.tamanho++;
	}
	 
	public void set(int index, String object) {
		if(index <= 0 && index >= this.list.length) {
			throw new IndexOutOfBoundsException("Fora de escopo");
		} 
		
		this.list[index] = object;
	} 
	
	private void shiftDireita(int index) {
		if(index == this.list.length-1) {
			throw new IndexOutOfBoundsException("Escopo limite");
		}
		
		for(int i = this.tamanho; i > index; i--) {
			this.list[i] = this.list[i-1];
		}
	} 
	
	private void shiftParaDireita(int index) {
		if(index >= 0 || index < this.list.length) {
			for(int i = this.tamanho; i > index; i--) {
				this.list[i] = this.list[i-1];
			}
		}
	}
	
	private void shiftEsquerda(int index) {

		for(int i = index; i  < this.tamanho - 1; i++) {
				this.list[i] = this.list[i+1];
			
		}
	}
	
	private void shiftParaEsquerda(int index) {
		
		for(int i = index; i < this.tamanho - 1; i++) {
			this.list[i] = this.list[i+1]; 
		}
	}

	private void assegureCapacidade(int capacidadePretendida) {
		
		if(capacidadePretendida > this.list.length) {
			resize(Math.max(this.list.length*2, capacidadePretendida));
		}
		
	} 

	private void resize(int capacity) {
		String[] newList = ((String[]) new Comparable[capacity]);
		
		for(int i = 0; i < this.list.length; i++) {
			newList[i] = this.list[i];
		}
		
		this.list = newList;
	}
	
	public String remove(int index) {
		if(index < 0 && index >= this.tamanho) {
			throw new IndexOutOfBoundsException("Fora de escopo");
		}
		
		String object = get(index);
		
		shiftEsquerda(index); 
		
		
		this.tamanho--;
		return object;
	} 
	
	public boolean remove(String object) { 
		if(object == null) {
			return false;
		}
		
		for(int i = 0; i < this.tamanho; i++) {
			if(this.list[i].equals(object)) {
				remove(i);
				return true;
			}
		}
		
		return false;
		 
	}
	
	public String get(int index) {
		if(index < 0 && index >= this.tamanho) {
			throw new IndexOutOfBoundsException("Fora de escopo");
		}
		
		return this.list[index];
	}
	
	public int indexOf(String object) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.list[i].equals(object)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean contains(String  object) {
		return indexOf(object) != -1; 
	}


	public void tooString() {
		System.out.println( "ArrayList [list=" + Arrays.toString(list) + ", tamanho=" + tamanho  + "]");
	}
	
	
	
	
}
