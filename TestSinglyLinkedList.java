package com.intr.datastructure;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		//  Auto-generated method stub
		LinkedList singlelyLinkedList = new SinglyLinkedList();
		
		singlelyLinkedList.add(10);
		singlelyLinkedList.add(20);
		singlelyLinkedList.add(30);
		singlelyLinkedList.add(40);
		singlelyLinkedList.add(50);	
		System.out.println("original list");
		singlelyLinkedList.printList();
		System.out.println("reveresed list");
		singlelyLinkedList.reverse();
		singlelyLinkedList.printList();
	}

}
