public class LinkedListsTest{
	Node head;
	
	public void append(int data) {//add a node to the end of the list
		//if there are no nodes
		if(head == null) {
			head = new Node(data);
		}
		
		//get current node
		Node currentNode = head;
		while(currentNode.next != null) {//keep looping till we reach the end of the list
			currentNode = currentNode.next;
		}
		//create a new node to append new data
		currentNode.next = new Node(data);
	}
	
	public void prepend(int data) {
		Node newHead = new Node(data);//create new head variable
		newHead.next = head;
		head = newHead; // change the head pointer
	}
	
	public void deleteNode(int data) {
		Node currentNode = head;
		
		//special case - if deleting head value
		if(head.data == data) {
			head = head.next;
		}
		
		while(currentNode != null) { //make sure we don't fall off the end of the list
			if(currentNode.next.data == data) {
				currentNode.next = currentNode.next.next;
				break;
			}
			currentNode = currentNode.next; //else move onto the next element
		}
	}
	
	public void addNode(int data, int pos, Node head) {
		Node newNode = new Node(data);
		Node currentNode = head;
		Node temp = new Node(currentNode.data);

		for(int i =0; i<=pos; i++) {
			currentNode = currentNode.next;//2
		}
		
		currentNode = newNode;
		currentNode.next = temp;
		
	}
	
    public static void main(String[] args) {
    	Node head = new Node(2); //0
    	Node nodeB = new Node(4);//1
    	Node nodeC = new Node(6); //2
    	
    	head.next = nodeB;
    	nodeB.next = nodeC;
    	
    	LinkedListsTest t = new LinkedListsTest();
    	t.addNode(8, 2, head);
    	
    }

}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}