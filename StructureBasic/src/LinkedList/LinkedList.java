 package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList<T extends Comparable<T>> {
	
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return this.head == null;
	}
	
	public void addFirst(T obj2) {
		Node obj = new Node(obj2);
		
		if(isEmpty()) {
			this.head = obj;
			this.tail = obj;
		} else {
			obj.next = this.head;
			this.head.prev = obj;
			this.head = obj;
		}
		
	}
	
	public void addLast(T obj2) {
		Node obj = new Node(obj2);
		if(isEmpty()) {
			this.head = obj;
			this.tail = obj;
		} else {
			this.tail.next = obj;
			obj.prev = this.tail;
			this.tail = obj;
		}
	
	}
	
	public void add(int index, T object) {
		Node obj = new Node(object);
		
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		if(index == 0) {
			addFirst(obj.object);
				
		} else if(index == size - 1) {
			addLast(obj.object);
			
		} else {
			Node aux = this.head; 

			// a, b, d, c
			// 0  1  2  3
			for(int i = 0; i < index - 1; i++) {
				aux = aux.next;
			}
			
			// A B C D


			
			
			obj.next = aux.next;
			obj.prev = aux;
			aux.next.prev = obj;
			aux.next = obj;
			
			
			
			//obj.next = aux.next;
			//aux.next = obj;
			//obj.next.prev = obj;
			//obj.prev = aux;
		}
		
		// newNode.next = aux.next;
		// newNode.prev = aux; 
		// newNode.prev.next = newNode;
		// aux.next.prev = newNode;
		
		size++;
	}
	
	public T get(int index) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node aux = this.head;
		
		for(int i = 0; i < index; i++) {
			aux = aux.next;
		}
		
		return aux.object;
	}
	
	public T getRecursive(int index) {
		return getRC(0, index, this.head.next);
		
	}
	
	private T getRC(int i, int index, LinkedList<T>.Node node) {
		if(index < 0 || index > this.size) {
			return null;
		} 

		if(i == index) {
			return (T) node;
			
		} else if(i != index) {
			
			return getRC(i+1, index, node.next);
		
		} else {
			return null;
		}
	}

	public int indexOf(T object) {
		Node aux = this.head;
	
		int index = 0; 
		
		while(aux != null) {
			
            if(aux.object.equals(object)) {
                return index;
            }
            index++;
            aux = aux.next;
        }
        
        return index;
    }
	
	public int indexOfRecursive(T object) {
		return indexOfRC(0, object, this.head);
	}

	private int indexOfRC(int i, T object, LinkedList<T>.Node node) {
		if(node.object.equals(object)) {
			return i;
		} else {
			return indexOfRC(i+1, object, node.next);
		}
	}

	public boolean contains(T object) {
		return indexOf(object) != -1;
	} 
	
	
	public boolean containsRecursive(T object) {
		return containsRC(object, this.head);
	}
	
	private boolean containsRC(T object, LinkedList<T>.Node node) {
		
		if(node != null) {
			if(node.object.equals(object)) {
				return true;
			} 
			
			else {
				return containsRC(object, node.next);
			}
		}
		
		return false;
	}

	public T getFirst() {
		if(isEmpty()) return null;
		
		return (T) this.head.object;
	}
	
	public T getLast() {
		if(isEmpty()) return null;
		
		return (T) this.tail.object;
	}
	
	public T removeFirst() {
		
		T obj = this.head.object;
		
		if(isEmpty()) {
			throw new NoSuchElementException();
			
		} else if (this.head.next == null) {
			this.head = null;
			this.tail = null;
			
		} else {
			this.head = this.head.next;
			this.head.prev = null;
		}
		
		size--;
		
		return (T) obj;
	}
	
	public T removeLast() {
		
		T object = this.tail.object;
		
		if(isEmpty()) {
			throw new NoSuchElementException();
			
		} else if(this.head.next == null) {
			this.head = null;
			this.tail = null;
			
		} else {
			this.tail = this.tail.prev;
			this.tail.next = null;
		}
		
		size--; 
		 
		return (T) object;
	}
	
	public T remove(int index) { 
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
					
		} else if (index == 0) {
			return removeFirst();
			
		} else if(index == size - 1) {
			return removeLast();
		} 
			
		Node aux = this.head;
		
		for(int i = 0; i < index; i++) {
			aux = aux.next;
		} 
		
		// A  B  C
		// 0  1  2
		
		aux.prev.next = aux.next;
		aux.next.prev = aux.prev;
		size--;
		
		return (T) aux.object;
		
		
		// aux.prev.next = aux.next
		// aux.next.prev = aux.prev 
	}
	
	public boolean remove(T object) {
		
		Node aux = this.head;
		
		for(int i = 0; i < size; i++){
			if(aux.object.equals(object)) {
				if(i == 0) {
					removeFirst();
					
				} else if(i == size - 1) {
					removeLast();
					
				} else {
					aux.prev.next = aux.next;
					aux.next.prev = aux.prev;
				}
				size--;
				return true;
			}
			aux = aux.next;
		}
		
		return false;
		
	}

	public int size() {
		return this.size;
	}


	

	public class Node {
		
		T object;
		Node next;
		Node prev;
		
		public Node(T obj2) {
			this.object = obj2;
			this.next = null;
			this.prev = null;
		}
		
	}
}