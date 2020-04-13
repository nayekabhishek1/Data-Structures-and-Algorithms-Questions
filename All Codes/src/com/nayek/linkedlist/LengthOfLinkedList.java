package com.nayek.linkedlist;

public class LengthOfLinkedList {

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

	public int length(Node head) {
		Node temp = head;
		int counter = 1;
		while (temp.next!= null) {
			counter++;
			temp = temp.next;
		}
		return counter;
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

		LengthOfLinkedList ll = new LengthOfLinkedList();
		System.out.println("Size of linked list= " + ll.length(head));
		ll.displayList(head);
	}
}
