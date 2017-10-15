package com.oracle.LinkedList;

class Node{
	int data;
	public Node prev, next;
	public Node(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

public class DoubleLinklist {
	Node head;
	public void insertAtHead(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		
		Node current = head;
		current.prev = newNode;
		newNode.next = current;
		head = newNode;
		return;
	}
	
	public void printLinkList(){
		Node current = head;
		while(current != null){
			System.out.println("DATA: " +current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		DoubleLinklist dbl = new DoubleLinklist();
		dbl.insertAtHead(2);
		dbl.printLinkList();
		dbl.insertAtHead(4);
		dbl.printLinkList();
		//dbl.insertAtHead(6);
		//dbl.insertAtHead(8);
		dbl.printLinkList();
	}
}
