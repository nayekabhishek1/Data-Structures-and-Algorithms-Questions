package com.nayek.linkedlist;

public class PrintLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void displayList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		Node head = new Node(10);
		Node second = new Node(40);
		Node third = new Node(9);
		Node fourth = new Node(23);
		Node fifth = new Node(99);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		PrintLinkedList pl = new PrintLinkedList();
		pl.displayList(head);

	}

}
