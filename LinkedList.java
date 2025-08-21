package PERTEMUAN1;

import java.util.NoSuchElementException;

public class LinkedList {
    private ListNode head;
    private int size;

    public LinkedList() { 
        head = new ListNode();
        head.setNext(head); 
        head.setPrev(head);
        size = 0;
    }

    private ListNode addBefore(int x, ListNode node) {
        ListNode newNode = new ListNode(x);
        newNode.setNext(node);
        newNode.setPrev(node.getPrev());
        node.getPrev().setNext(newNode);
        node.setPrev(newNode);
        size++;
        return newNode;
    }

    private int remove(ListNode node) {
        if (!isEmpty()) {
        ListNode prev = node.getPrev();
        ListNode next = node.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        size--;
        return node.getValue();
        }
        throw new NoSuchElementException();
    }

    public void addFirst(int x) {
        addBefore(x, head.getNext());
    }

    public void addLast(int x) {
        addBefore(x, head);
    }

    public int removeFirst() {
        return remove(head.getNext());
    }

    public int removeLast() {
        return remove(head.getPrev());
    }

    public ListNode search(int key) {
        ListNode node = head.getNext();
        while (node != head) {
            if (node.getValue() == key) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String str = "";
        ListNode node = head.getNext();
        while (node != head) {
            str += node.getValue();
            str += " ";
            node = node.getNext();
        }
        return str;
    }

}
