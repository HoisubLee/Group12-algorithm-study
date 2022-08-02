package algoWeek;

import java.util.Arrays;
import java.util.HashMap;

public class algo32 {
    public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        int count = 0;
        HashMap<Double,Integer> fail = new HashMap<Double,Integer>();

        Arrays.sort(stages);
        for (int i = 0; i < stages.length; i++) {
            for (int j = i; j < stages.length; j++) {
                if (i == stages[j] - 1) {
                    count++;
                }

            }
        }
        for (Double aDouble : fail.keySet()) {
            System.out.println(aDouble);
        }
        return answer;
    }
}
