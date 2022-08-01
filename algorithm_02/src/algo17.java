import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class algo17 {
    //로또 최고 순위와 최저순위
    public static int[] solution(int[] lottos, int[] win_nums) {
        // 숫자 정렬 후, 0값 갯수를 조회하고
        // 서로 숫자가 맞는지 확인하는 방식으로 풀이했다.
        int[] answer = new int[2];
        int erasedNum = 0;
        int collectNum = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        //lottos안에 0의 숫자 확인
        for (int i = 0; i < lottos.length; i++) {
            if ( lottos[i] == 0 ) {
                erasedNum++;
            } else {
                break;
            }
        }

        //win_nums 와 lottos 내용 확인.
        //빠르게 검색하기 위해 lottos는 마지막 0의 다음 숫자 부터 검사
        //맞는 숫자를 찾으면 continue 하게 했다.
        for (int i = 0; i < win_nums.length; i++) {
            for (int j = erasedNum; j < lottos.length; j++) {
                if(win_nums[i] == lottos[j]) {
                    collectNum++;
                    continue;
                }
            }
        }

        //7등과 6등이 같기 때문에 예외를 주었다.
        //이쁘게 만든거 같진 않다..
        if (collectNum == 0) {
            answer[1] = 6;
        } else {
            answer[1] = 7 - collectNum;
        }
        if (erasedNum == 6) {
            answer[0] = 1;
        } else {
            answer[0] = answer[1] - erasedNum;
        }
        return answer;
    }
}
