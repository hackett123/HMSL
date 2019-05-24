/**
 * Interface for our SkipList of generic type E which must extend comparable (as sorting is necessary).
 * Interface supports add, remove, and contains functionality as well as getters for some data about the structure.
 */
public interface SkipList<E extends Comparable<E>> {

    /**
     *
     * @param element : Generic type for type of element in list.
     * @return : true if element was not previously present, false else.
     */
    boolean addElement(E element);


    /**
     *
     * @param element : Generic type for type of element in list.
     * @return : true if element was in list and we successfully removed it, false else.
     */
    boolean removeElement(E element);


    /**
     *
     * @param element
     * @return : returns the node itself which contains the element, if it exists, null otherwise.
     */
    Node<E> containsElement(E element);


    /**
     *
     * @return the maximum height of each of the nodes' layers.
     */
    int getHeight();

    /**
     *
     * @return total number elements which have been added and not removed from the skip list.
     */
    int getElementCount();


    /**
     *
     * @return the average height across all elements in the skip list.
     */
    int getAverageHeight();

}
