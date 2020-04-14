package com.nayek.linkedlist;

public class NthNodeFromEnd {

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

	public int findNthNodeFromEnd(Node head, int val) {
		int counter = 0;
		Node temp = head;
		Node temp2 = head;
		// this while loop to get the length of the list
		while (temp != null) {
			counter++;
			temp = temp.next;
		}

		int nodeIndex = (counter - val) + 1;
		int tempCounter = 1;
		// this while loop to actually get to the target node
		while (temp2.next != null) {
			if (nodeIndex == tempCounter) {
				return temp2.data;
			}
			tempCounter++;
			temp2 = temp2.next;
		}

		return -1;
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

		NthNodeFromEnd ll = new NthNodeFromEnd();
		ll.displayList(head);
		int val = 2;
		System.out.println(ll.findNthNodeFromEnd(head, val));
	}

}
