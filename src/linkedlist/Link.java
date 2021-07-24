package linkedlist;

public class Link {
	private int value;
	private Link next;
	private Link previous;
	
	public Link(int value) {
		this.value = value;
		this.next = null;
		this.previous = null ;
		
	}
	public Link getNext() {
		return this.next;
	}
	
	public void setNext(Link newLink) {
		this.next = newLink;
	}
	
	public Link getPrevious() {
		return this.previous;
	}
	
	public void setPrevious(Link newLink) {
		this.previous = newLink;
	}
	
	public int getValue() {
		return this.value;
	}
}
