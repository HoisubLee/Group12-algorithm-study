package algoWeek;

import java.util.*;

public class algo29 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> subArray = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                subArray.add(array[j]);
            }
            Collections.sort(subArray);
            answer[i] = subArray.get(commands[i][2] - 1);
            subArray.clear();
        }
        return answer;
    }
}
//copyOfRange
