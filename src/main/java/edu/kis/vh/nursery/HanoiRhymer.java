package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {


    public static final int ZERO_REJECTED = 0;
    private int totalRejected = ZERO_REJECTED;


    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
