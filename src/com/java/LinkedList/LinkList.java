package com.oracle.LinkedList;

class Node{
	int data;
	public Node next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	
	public int getData(){
		return data;
	}
	
	public Node getNext(){
		return next;
	}
}
public class LinkList {
	Node head;
	
	public void append(int data){
		if (head == null){
			head = new Node(data);
			return;
		}else{
			Node newNode=new Node(data);
			Node current = head;
			
			
			while (current.next != null) {
				current = current.next;
			}

			current.next = newNode;
		}
	}
	
	
	public void prepend(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head=newNode;
	}
	
	public void deleteWithValue(int data){
		if (head == null){
			return;
		}
		
		if (head.data == data){
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next != null){
			if (current.next.data == data){
				current.next = current.next.next;
			}
			current = current.next;
		}
		return;
		
	}
	
	public void insertAtLocation(int data, int location){
		if (head == null){
			head = new Node(data);
			return;
		} else {
			Node prev = head;
			Node newNode = new Node(data);
			int count =1;
			
			while(count < location -1){
				prev = prev.next;
				count++;
			}
			Node current = prev.next;
			newNode.next=current;
			prev.next=newNode;
			return;
		}
	}
	
	public int size(){
		Node current = head;
		int i=0;
		while (current != null){
			current = current.next;
			i++;
		}
		return i;
	}
	
	public void deleteFromEnd(){
		if (head ==null) return;
		
		Node current = head;
		int length= this.size();
		int i=1;
		while(i < length-1){
			current = current.next;
			i++;
		}
		current.next = null;
		return;
	}
	
	public void insertAtEnd(int data){
		if (head == null) return;
		
		Node newNode = new Node(data);
		Node current = head;
		
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
		newNode.next = null;
		return;
		
	}
	
	
	
	public String toString(){
        String retStr = "";
        Node current = head;
        while(current != null){
        	retStr = retStr + current.data + "\n";
            current = current.next;
        }

        return retStr;
    }
	
	public void reverse(){
		Node current = head;
		Node prev = null;
		Node next;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;
	}
	
	public static void main(String[] args) {
		LinkList ln = new LinkList();
		ln.append(2);
		//System.out.println(ln.toString());
		ln.append(4);
		ln.append(7);
		ln.append(10);
		System.out.println("Before Reverse:" +ln.toString());
		
		ln.reverse();
		
		System.out.println("REVERSE LIST:");
		System.out.println(ln.toString());
		ln.prepend(5);
		//System.out.println(ln.toString());
		
		//Delete a node with value
		ln.deleteWithValue(4);
		System.out.println(ln.toString());
		
		//ln.deleteWithValue(7);
		//System.out.println(ln.toString());
		
		ln.insertAtLocation(4, 4);
		int size = ln.size();
		System.out.println("size of linklist:"+size);
		System.out.println(ln.toString());
		
		ln.deleteFromEnd();
		System.out.println("LinkList after deletion: " + ln.toString());
		
		ln.insertAtEnd(21);
		System.out.println("after Insert at end:" + ln.toString());
		
	}
}
