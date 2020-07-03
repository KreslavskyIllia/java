public class TwoDirectionalList implements DirectionalList{
    private Node2 first;

    @Override
    public void add(String val) {
        if (first == null) {
            first = new Node2(val, null, null);
            return;
        }
        add(val, first);
    }
    private void add(String val, Node2 current) {
        if (current.getNext() == null) {
            current.setNext(new Node2(val, null, current));
        } else {
            add(val, current.getNext());
        }
    }

    @Override
    public boolean remove(String val) {
        if (first.getVal().equals(val)) {
            if (first.getNext() == null) {
                first = null;
            } else {
                first = first.getNext();
                first.setPrev(null);
            }
            return true;
        }
        return remove (val, first, first.getNext());
    }
    private boolean remove(String val, Node2 previous, Node2 current) {
        if (current == null) {
            return false;
        }
        if (current.getVal().equals(val)) {
            previous.setNext(current.getNext());
            current.getNext().setPrev(previous);
            return true;
        }
        return remove(val, current, current.getNext());
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
        Node2 current = first;
        while (current.getNext() != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public class Node2 {
        private String val;
        private Node2 next;
        private Node2 prev;

        public Node2(String val, Node2 next, Node2 prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
        public String getVal() {
            return val;
        }
        public Node2 getNext() {
            return next;
        }
        public void setNext(Node2 next) {
            this.next = next;
        }
        public Node2 getPrev() {
            return prev;
        }
        public void setPrev(Node2 prev) {
            this.prev = prev;
        }
    }
}
