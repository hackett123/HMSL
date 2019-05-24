/**
 * Node class for our skip list implementation.
 * Supports null elements and four-directional pointers.
 * @param <E>
 */
public class Node<E extends Comparable<E>> {
    Node<E> right;
    Node<E> left;
    Node<E> above;
    Node<E> below;
    E element;
    int height;

    //empty constructor means null type and is used for our -1 node
    Node() {
        this(null, null, null, null, null);
    }

    //nonempty constructor takes in all 4 nodes for simplicity here (and annoyance later)
    Node(Node<E> left, Node<E> right, Node<E> above, Node<E> below, E element) {
        if (left == null && element != null) {
            throw new IllegalArgumentException("Only sentinel nodes can have no left node.");
        }
        this.left = left;
        this.right = right;
        this.above = above;
        this.below = below;
        this.element = element;
        setHeight();
    }

    private void setHeight() {
        if (this.below == null) {
            this.height = 0;
        } else {
            this.height = this.below.getHeight() + 1;
        }
    }

    public Node<E> getRight() {
        return this.right;
    }

    public Node<E> getLeft() {
        return this.left;
    }

    public Node<E> getAbove() {
        return this.above;
    }

    public Node<E> getBelow() {
        return this.below;
    }

    public E getElement() {
        return this.element;
    }

    public int getHeight() {
        return this.height;
    }
}
