package Queue;

public class Queue {

	private int head, tail;
	private int capacidade;
	private int size; // quanto está ocupando
	private int[] queue;
	
	public Queue(int capacidade) {
		this.size = 0;
		this.head = -1;
		this.tail = -1;
		this.capacidade = capacidade; // tamanho do array
		this.queue = new int[capacidade];
	} 
	 
	public boolean isEmpty() {
		return ((this.head == -1) && (this.tail == -1));
	}
	
	public boolean isFull() {
		return ((this.tail + 1) % capacidade) == this.head;
	}
	 
	public void add(int n) {
		if(isFull()) {
			throw new RuntimeException("QueueIsFullException");
		}
		
		if(isEmpty()) {
			this.head = 0;
			this.tail = 0;
			this.queue[tail] = n;
		}
		
		else {
            this.tail = (this.tail + 1) % this.capacidade;
            this.queue[tail] = n;
    }
		
		this.size++;
	}
	
    public int head() {
        if (this.isEmpty())
            throw new RuntimeException("QueuIsEmptyException");
        return this.queue[this.head];
    }    
	 
	public int remove() {
		if(isEmpty()) {
			throw new RuntimeException("QueueIsEmptyException");
		}
		
		int value = this.queue[head];
		
		if(this.tail == this.head) {
			this.tail = -1;
			this.head = -1;
			
		}else {
            this.head = ((this.head + 1) % capacidade);
        }
		
		this.size--;
		return value;
	}
	
	public int size() {
		return this.size;
	}
}
