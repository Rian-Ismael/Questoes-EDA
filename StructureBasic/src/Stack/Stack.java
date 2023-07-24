package Stack;

public class Stack {

	private int top;
	private int[] stack;
	
	private int capacidade; // capacidade da pilha
	
	public Stack(int capacidade) {
		this.top = -1;
		this.capacidade = capacidade;
		this.stack = new int[capacidade];
	}
	
	public boolean isEmpty() {
		return (this.top == -1);
	}
	
	public boolean isFull() {
		return (this.top == capacidade - 1);
	}
	
	public void push(int n) {
		if(isFull()) {
			throw new RuntimeException("FullStackException");
		} 
		
		this.top++;
		this.stack[this.top] = n;
		
		
	}
	
	public int pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("EmptyStackException");
        }
        
        int value = this.stack[top];
        this.top--;
        
        return value;
	}
	
	public int size() {
		return this.top+1;
	}
	
	public int peek() {
		return this.stack[top];
	}
	
}
