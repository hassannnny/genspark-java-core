package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class MeanMedian implements Assignment {
    public String solution(int a, int b, int c) {
        // ↓↓↓↓ your code goes here ↓↓↓↓



        float mean = ((a + b + c) / 3.0f);

        int median = a;

        //Median Calculation -- works great!
        if ((a >= c && a <= b) || (a >= b && a <= c)) {

            median = a;

        }
        else if ((b >= a && b <= c) || (b >= c && b <= a)) {

            median = b;

        }
        else {
            median = c;
        }



        String sMean = String.valueOf(mean);
        String sMedian = String.valueOf(median);

        String ans = sMean + " " + sMedian;

        return ans;
    }
}