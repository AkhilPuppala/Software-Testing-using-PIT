package org.example;
import java.util.*;
class maxvalue {
    public int maxValueAfterReverse(int[] nums) {
        if (nums.length < 2)
            throw new IllegalArgumentException();
        else if (nums.length == 2)
            return Math.abs(nums[0] - nums[1]);


        //i=3, j=4, total=68
        // 2 3  4 5
        // 9,24,2,1
        int baseValue = 0;
        for (int i = 1; i < nums.length; i++) {
            baseValue += Math.abs(nums[i] - nums[i - 1]);
        }

        TreeSet<Integer> PsLargerThanQs = new TreeSet<>();
        TreeSet<Integer> PsSmallerThanQs = new TreeSet<>();
        TreeSet<Integer> QsLargerThanPs = new TreeSet<>();
        TreeSet<Integer> QsSmallerThanPs = new TreeSet<>();

        int Pi = nums.length - 1;
        int Qi = Pi - 1;
        int Yi = Qi - 1;
        int Xi = Yi - 1;

        int p = nums[Pi];
        int q = nums[Qi];

        if (q < p) {
            PsLargerThanQs.add(p);
            QsSmallerThanPs.add(q);
        } else {
            PsSmallerThanQs.add(p);
            QsLargerThanPs.add(q);
        }

        int bestResult = baseValue;

        while (Xi >= 0) {
            int x = nums[Xi];
            int y = nums[Yi];
            if (x < y) {
                // In q > p, find:
                // smallest q, try 2(x-q)
                // largest p, try 2(p-y)
                if (!QsLargerThanPs.isEmpty()) {
                    q = QsLargerThanPs.first();
                    bestResult = Math.max(bestResult, baseValue + 2 * (x - q));
                }

                if (!PsSmallerThanQs.isEmpty()) {
                    p = PsSmallerThanQs.last();
                    bestResult = Math.max(bestResult, baseValue + 2 * (p - y));
                }

                // In q < p, find
                // smallest p, try 2(x-p)
                // largest q, try 2(q-y)
                if (!PsLargerThanQs.isEmpty()) {
                    p = PsLargerThanQs.first();
                    bestResult = Math.max(bestResult, baseValue + 2 * (x - p));
                }

                if (!QsSmallerThanPs.isEmpty()) {
                    q = QsSmallerThanPs.last();
                    bestResult = Math.max(bestResult, baseValue + 2 * (q - y));
                }
            } else {
                // x > y:
                // In q > p, find:
                // smallest q, try 2(y-q)
                // largest p, try 2(p-x)
                if (!QsLargerThanPs.isEmpty()) {
                    q = QsLargerThanPs.first();
                    bestResult = Math.max(bestResult, baseValue + 2 * (y - q));
                }

                if (!PsSmallerThanQs.isEmpty()) {
                    p = PsSmallerThanQs.last();
                    bestResult = Math.max(bestResult, baseValue + 2 * (p - x));
                }

                // In q < p, find
                // smallest p, try 2(y-p)
                // largest q, try 2(q-x)
                if (!PsLargerThanQs.isEmpty()) {
                    p = PsLargerThanQs.first();
                    bestResult = Math.max(bestResult, baseValue + 2 * (y - p));
                }

                if (!QsSmallerThanPs.isEmpty()) {
                    q = QsSmallerThanPs.last();
                    bestResult = Math.max(bestResult, baseValue + 2 * (q - x));
                }
            }

            //  q < p
            if (nums[Yi] < nums[Yi + 1]) {
                PsLargerThanQs.add(nums[Yi + 1]);
                QsSmallerThanPs.add(nums[Yi]);
            } else {
                PsSmallerThanQs.add(nums[Yi + 1]);
                QsLargerThanPs.add(nums[Yi]);
            }

            Xi-=1;
            Yi-=1;
        }

        // two edge conditions remain rotating the head or the tail.
        // Let's just do them through a linear scan
        for (int i = 1; i < nums.length - 1; i++) {
            // We'll rotate [0...i]
            int candidateBest = baseValue - Math.abs(nums[i] - nums[i + 1]) + Math.abs(nums[0] - nums[i + 1]);
            bestResult = Math.max(bestResult, candidateBest);
        }

        for (int i = nums.length - 1; i > 0; i--) {
            // We'll rotate [i...length-1]
            int candidateBest = baseValue - Math.abs(nums[i - 1] - nums[i]) + Math.abs(nums[nums.length - 1] - nums[i - 1]);
            bestResult = Math.max(bestResult, candidateBest);
        }

        return bestResult;
    }
}
