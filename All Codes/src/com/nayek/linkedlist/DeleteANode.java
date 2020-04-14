package com.nayek.linkedlist;

public class DeleteANode {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

	}

	public static void displayList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("");
	}

	public static void deleteNode(Node head, int nodeIndex) {
		Node temp = head;
		int counter = 1;
		while (counter + 1 != nodeIndex) {
			counter++;
			temp = temp.next;
		}

		temp.next = temp.next.next;
		System.out.println("After deletion of " + nodeIndex + "th node :");
		displayList(head);
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

		displayList(head);
		deleteNode(head, 4);

	}

}
