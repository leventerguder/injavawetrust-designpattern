package bridge;

//A concrete implementor. 
//This implementation is a classic LinkedList using nodes
//**NOT thread safe**
public class SinglyLinkedList<T> implements LinkedList<T> {

    private class Node {
        private Object data;
        private Node next;

        private Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node top;
    private Node last;

    @Override
    public void addFirst(T element) {
        if (top == null) {
            last = top = new Node(element, null);
        } else {
            top = new Node(element, top);
        }
        size++;
    }

    @Override
    public T removeFirst() {
        if (top == null) {
            return null;
        }
        @SuppressWarnings("unchecked")
        T temp = (T) top.data;
        if (top.next != null) {
            top = top.next;
        } else {
            top = null;
            last = null;
        }
        size--;
        return temp;
    }

    @Override
    public void addLast(T element) {
        if (last == null) {
            last = top = new Node(element, null);
        } else {
            last.next = new Node(element, null);
            last = last.next;
        }
        size++;
    }

    @Override
    public T removeLast() {
        if (last == null) {
            return null;
        }
        if (top == last) {
            @SuppressWarnings("unchecked")
            T temp = (T) top.data;
            top = last = null;
            size--;
            return temp;
        }
        //since we don't have a back pointer
        Node temp = top;
        while (temp.next != last) {
            temp = temp.next;
        }
        @SuppressWarnings("unchecked")
        T result = (T) last.data;
        last = temp;
        last.next = null;
        size--;
        return result;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String result = "[";
        Node temp = top;
        while (temp != null) {
            result += temp.data + (temp.next == null ? "" : ", ");
            temp = temp.next;
        }
        result += "]";
        return result;
    }

}
