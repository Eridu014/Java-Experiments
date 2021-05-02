/* this is a representation of a linked list. Maintaining pointer to first node in a linked list; pushing/popping from the front of the stack
*/

public class linkedStackOfStrings {
    private Node first = null;
    private class Node {
        String item;
        Node next;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void push(String item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }
    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }
}