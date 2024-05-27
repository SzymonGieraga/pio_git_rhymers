package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int EMPTY_STACK_VALUE = -1;
    public static final int LIMIT = 12;

    public static final int FULL_TAB = LIMIT - 1;
    public static final int EMPTY_TAB = -1;
    private final int[] numbers = new int[LIMIT];


    public int total = EMPTY_STACK_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == FULL_TAB;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_TAB;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_TAB;
        return numbers[total--];
    }

}
