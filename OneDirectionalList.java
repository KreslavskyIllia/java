public class OneDirectionalList implements DirectionalList{
    private Node first;

    @Override
    public void add(String val) {
        if (first == null) {
            first = new Node(val, null);
            return;
        }
        add(val,first);
    }

    @Override
    public boolean remove(String val) {
        if (first.getVal().equals(val)) {
            if (first.getNext() == null) {
                first = null;
            } else {
                first = first.getNext();
            }
            return true;
        }
        Node current = first.getNext();
        Node prev = first;

        while (current != null) {
            if (current.getVal().equals(val)) {
                prev.setNext(current.getNext());
                return true;
            } else {
                prev = current;
                current = current.getNext();
            }
        }
        return false;
    }

    private void add(String val, Node current) {
        if (current.getNext() == null) {
            current.setNext(new Node(val, null));
        } else {
            add(val, current.getNext());
        }
    }

    @Override
    public Object getFirst() {
        return first;
    }

    @Override
    public int size() {
        if (first == null) {
            return 0;
        }
        int size = 1;
        Node current = first;
        while (current.getNext() != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public class Node {
        private String val;
        private Node next;

        public Node(String val, Node next) {
            this.val = val;
            this.next = next;
        }
        public String getVal() {
            return val;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
