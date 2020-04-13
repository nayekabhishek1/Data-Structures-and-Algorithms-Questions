package com.nayek.linkedlist;

public class MiddleOfLinkedList {

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

		MiddleOfLinkedList ll = new MiddleOfLinkedList();
		ll.displayList(head);
		System.out.println("The middle node is :" + ll.findMidNode(head));
	}

	private int findMidNode(Node head) {

		Node fast = head;
		Node slow = head;
		while (fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow.data;
	}

}
