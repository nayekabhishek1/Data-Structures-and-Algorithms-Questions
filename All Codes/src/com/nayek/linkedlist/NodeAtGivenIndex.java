package com.nayek.linkedlist;

public class NodeAtGivenIndex {
	
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
		Node head = new Node(10);
		Node second = new Node(40);
		Node third = new Node(9);
		Node fourth = new Node(23);
		Node fifth = new Node(99);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		
		NodeAtGivenIndex ll = new NodeAtGivenIndex();
		int index =4;
		ll.displayList(head);
		System.out.println("The value of node at index "+index+" is: "+ll.findNodeByIndex(head,index));
	}


	private int findNodeByIndex(Node head,int index) {
		
		Node temp = head;
		int counter =1;
		while(temp.next!=null)
		{
			if(counter==index)
			{
				return temp.data;
			}
			counter++;
			temp=temp.next;
		}
		return -1;
	}

}
