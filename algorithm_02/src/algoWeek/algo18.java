package algoWeek;

import java.util.*;

public class algo18 {
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] student_1 = {1,2,3,4,5};
        int[] student_2 = {2,1,2,3,2,4,2,5};
        int[] student_3 = {3,3,1,1,2,2,4,4,5,5};
        List<Integer> list = new ArrayList<>();

        int[] collects = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == student_1[i % student_1.length]) {
                collects[0]++;
            }
        }
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == student_2[i % student_2.length]) {
                collects[1]++;
            }
        }
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == student_3[i % student_3.length]) {
                collects[2]++;
            }
        }

        int bestRecord = 0;
        for (int i = 0; i < collects.length -1; i++) {
            bestRecord = Math.max(bestRecord,Math.max(collects[i],collects[i+1]));
        }
        for (int i = 0; i < collects.length; i++) {
            if (bestRecord == collects[i]) {
                list.add(i+1);
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

//Stream객체
//map활용 collections.max