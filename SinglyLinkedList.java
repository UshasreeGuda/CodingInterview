package com.intr.datastructure;

public class SinglyLinkedList implements LinkedList {

	private Node head, last;

	private int data;

	@Override
	public void add(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		if (head == null && last == null) {
			head = last = newNode;
		} else {
			last.setNext(newNode);
			last = newNode;
		}
	}

	@Override
	public void printList() {
		// Auto-generated method stub
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.getData() + " ");
				temp = temp.getNext();
			}
		}
	}

	@Override
	public Node reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
        return head;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
