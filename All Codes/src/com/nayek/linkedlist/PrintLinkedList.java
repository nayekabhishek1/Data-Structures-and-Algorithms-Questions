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
	}

	public static void main(String[] args) {

		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		PrintLinkedList pl = new PrintLinkedList();
		pl.displayList(head);

	}

}
