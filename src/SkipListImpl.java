/**
 * Implementation of the SkipList interface.
 */
public class SkipListImpl<E extends Comparable<E>> implements SkipList<E> {

    /**
     * Package-private fields (visible for testing)
     */

    //head is the highest level sentinel node. It must always have a node to the right and never above or left.
    @VisibleForTesting
    Node<E> head;

    //just data
    @VisibleForTesting
    int numElements, highestHeight;


    /**
     * Constructor without arguments makes empty skip list.
     */
    SkipListImpl() {
        head = new Node<E>();
    }

    /**
     * Constructor which takes in an element.
     * @param head
     */
    SkipListImpl(E head) {

    }

    /**
     *{@inheritDoc}
     */
    @Override
    public boolean addElement(E element) {
        //TODO : Implement
        return false;
    }


    /**
     *{@inheritDoc}
     */
    @Override
    public boolean removeElement(E element) {
        //TODO : Implement
        return false;
    }


    /**
     *{@inheritDoc}
     */
    @Override
    public Node<E> containsElement(E element) {
        //TODO : Implement
        return null;
    }


    /**
     *{@inheritDoc}
     */
    @Override
    public int getHeight() {
        //TODO : Implement
        return 0;
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public int getElementCount() {
        //TODO : Implement
        return 0;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public int getAverageHeight() {
        //TODO : Implement
        return 0;
    }




}
