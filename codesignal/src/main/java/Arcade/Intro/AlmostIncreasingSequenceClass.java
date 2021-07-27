package Arcade.Intro;

public class AlmostIncreasingSequenceClass {

    public static boolean almostIncreasingSequence(int[] sequence) {
        int modCount = 0;
        int last = Integer.MIN_VALUE;
        int lastPrev = Integer.MIN_VALUE;

        for (int seq : sequence) {
            if (seq <= last) {
                modCount++;
                if (seq > lastPrev) {
                    last = seq;
                }
            } else {
                lastPrev = last;
                last = seq;
            }
        }
        return modCount <= 1;
// [1, 3, 2, 1] returns false.
// [1, 3, 2] returns true.
// [1, 2, 1, 2] returns false.
// [1, 4, 10, 4, 2] returns false;
// [10, 1, 2, 3, 4, 5] returns true;
    }
}
