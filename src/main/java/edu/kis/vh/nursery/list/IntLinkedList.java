package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca stos oparty na połączonej liście jednokierunkowej.
 */
public class IntLinkedList {

    /**
     * Stała oznaczająca pusty stos.
     */
    public static final int EMPTY_TAB = -1;

    /**
     * Referencja do ostatniego węzła na stosie.
     */
    private Node last;

    /**
     * Liczba elementów w stosie.
     */
    private int i;

    /**
     * Dodaje element na szczyt stosu.
     *
     * @param i wartość do dodania
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true, jeśli stos jest pusty, w przeciwnym razie false
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return zawsze false, ponieważ stos oparty na liście nie może być pełny
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość z wierzchu stosu bez usuwania jej.
     *
     * @return wartość z wierzchu stosu lub EMPTY_TAB, jeśli stos jest pusty
     */
    public int top() {
        if (isEmpty())
            return EMPTY_TAB;
        return last.getValue();
    }

    /**
     * Usuwa i zwraca wartość z wierzchu stosu.
     *
     * @return wartość z wierzchu stosu lub EMPTY_TAB, jeśli stos jest pusty
     */
    public int pop() {
        if (isEmpty())
            return EMPTY_TAB;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Klasa reprezentująca węzeł w połączonej liście jednokierunkowej.
     */
    private static class Node {
        /**
         * Wartość przechowywana w węźle*/
        private final int value;
        /**
         * Referencja do poprzedniego węzła*/
        private Node prev;
        /**
         * Referencja do następnego węzła.
         */
        private Node next;
        /**
         * Konstruktor tworzący węzeł o podanej wartości.
         *
         * @param value wartość przechowywana w węźle
         */
        public Node(int value) {
            this.value = value;
        }
        /**
         * Zwraca wartość przechowywaną w węźle.
         *
         * @return wartość przechowywana w węźle
         */
        public int getValue() {
            return value;
        }
        /**
         * Zwraca poprzedni węzeł.
         *
         * @return poprzedni węzeł
         */
        public Node getPrev() {
            return prev;
        }
        /**
         * Ustawia poprzedni węzeł.
         *
         * @param prev poprzedni węzeł
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }
        /**
         * Zwraca następny węzeł.
         *
         * @return następny węzeł
         */
        public Node getNext() {
            return next;
        }
        /**
         * Ustawia następny węzeł.
         *
         * @param next następny węzeł
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
