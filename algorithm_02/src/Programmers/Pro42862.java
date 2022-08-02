package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro42862 {
    // 체육복
    //                          총원 , 잃어버린 사람, 여분있는 사람
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        int sameNum = 0;
        // 중복된 값 있는지 찾기
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0 ; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    // 중복된 값 부분은 0으로 변경!
                    // ex) lost     1 2 3
                    // ex) reserve  1   3 4
                    // ex) 0 2 0
                    // ex) 0 0 4
                    reserve[i] = 0;
                    lost[j] = 0;
                    sameNum++;
                    break;
                }
            }
        }

        // 정렬해서 중복된 값을 앞으로 땡김
        // ex) 0 0 2
        // ex) 0 0 4
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 자기 것 챙긴 것 추가
        answer += sameNum;

        for (int i = sameNum; i < lost.length; i++) {
            for (int j = sameNum; j < reserve.length; j++) {
                if (lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1) {
                    answer++;
                    reserve[j] = 0; //옷 뺏김..ㅎ
                    break;
                }
            }
        }

        return answer;
    }
}

//그리디 문제임 - 거스름돈
//https://www.youtube.com/watch?v=Fbw7A4CS_-A