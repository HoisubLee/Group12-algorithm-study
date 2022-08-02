package algoWeek;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;

public class algo14 {
    public static int solution(int[][] sizes) {
        // [n][2] 배열형태로 전달받음 {w,h}
        // sizes[][]가 가지고있는 값 중 가장 큰 값을 h로 정렬 후
        // w의 최대값, h의 최대값을 곱하여 전달하는 방식으로 풀이했다.
        int answer = 0;
        int length = sizes.length;
        int big_w = 0;
        int big_h = 0;

        //size[][]의 값을 정렬 한다.
        for (int i = 0; i < length; i++) {
            Arrays.sort(sizes[i]);
//            System.out.println("{"+sizes[i][0]+", "+sizes[i][1]+"}");
        }

        //w값중 가장 큰 값을 찾는다.
        for (int i = 0; i < length; i++) {
            if (sizes[i][0] > big_w ) {
                big_w = sizes[i][0];
            }
        }
//        System.out.println("-----------------------------");
//        System.out.println(big_w);

        //h값 중 가장 큰 값을 찾는다.
        for (int i = 0; i < length; i++) {
            if (sizes[i][1] > big_h ) {
                big_h = sizes[i][1];
            }
        }
//        System.out.println("-----------------------------");
//        System.out.println(big_h);

        // 둘을 곱하여 전달한다.
        answer = big_h * big_w;

        return answer;
    }
    public static int solution2 (int[][] sizes) {
        int answer = 0;
        //긴변중에 가장 긴변
        //짧은변중에 가장 긴변
        int biggerSideMax = 0;
        int smallerSideMax = 0;

        for (int[] size : sizes) {
            if (size[0] > size[1]) {
                if (biggerSideMax < size[0]) {
                    biggerSideMax = size[0];
                }
                if (smallerSideMax < size[1]) {
                    smallerSideMax = size[1];
                }
            }
            else {
                if (biggerSideMax < size[1]) {
                    biggerSideMax = size[1];
                }
                if (smallerSideMax < size[0]) {
                    smallerSideMax = size[0];
                }
            }
        }
        return biggerSideMax * smallerSideMax;
    }

    public static int solution3 (int[][] sizes) {
        int biggerSideMax = 0;
        int smallerSideMax = 0;

        for (int[] size : sizes) {
            int curentBiggerSize = Math.max(size[0], size[1]);
            int curentSmallerSize = Math.min(size[0], size[1]);

            if (biggerSideMax < curentBiggerSize) biggerSideMax = curentBiggerSize;
            if (smallerSideMax < curentBiggerSize) smallerSideMax = curentSmallerSize;
        }

        return biggerSideMax * smallerSideMax;
    }
}
