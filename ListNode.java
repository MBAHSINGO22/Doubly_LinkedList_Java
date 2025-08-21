
package PERTEMUAN1;

public class ListNode {
    private int element;
    private ListNode next;
    private ListNode prev;

    public ListNode(int element, ListNode next, ListNode prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public ListNode(int element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }

    public ListNode() {
        this.next = null;
        this.prev = null;
    }

    public int getValue() {
        return element;
    }

    public ListNode getNext() {
        return next;
    }

    public void setValue(int element) {
        this.element = element;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode getPrev() {
        return prev;
    }

    public String toString() {
        return String.valueOf(element);
    }
}
