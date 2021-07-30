package linkedlist;

public class LinkedList {
	private Link head = null;
	private Link tail = null;
	
	public void add(int value) {
		Link newLink = new Link(value);
		tail.setNext(newLink);
		newLink.setPrevious(tail);
		newLink.setNext(null);
		tail = newLink;
			
		}
	
	public Boolean isEmpty(LinkedList list) {
		if (head == null) {
			assert (tail == null);
			return true;
		}
		
	    else {
	    	return false;	
		}
		
		
	
		
		
		
	}

}
