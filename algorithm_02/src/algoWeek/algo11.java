package algoWeek;

public class algo11 {
        public static int solution(int num) {
            int answer = 0;
            // 곱계산 중 int범위를 벗어난 경우를 대비하여 long으로 선언 훙 값 저장하도록 함
            long lnum = (long)num;

            // 처음 1로 값을 받으면 0 리턴
            if (lnum == 1) {
                return answer;
            }

            while (true) {
                // 500번 반복 시 -1 리턴
                if (answer == 500) {
                    return -1;
                }

                // 최종값이 1인경우 반복해제
                if (lnum == 1) {
                    break;
                }
                // 짝수인 경우 2를 나누고, 횟수 증가
                // 홀수인 경우 3을 곱하고 +1 , 횟수 증가
                else if (lnum % 2 == 0) {
                    lnum /= 2;
                    answer++;
//                    System.out.printf("current: %10d, answer: %d\n", lnum, answer);
                }
                else {
                    lnum = (lnum * 3) + 1;
                    answer++;
//                    System.out.printf("current: %10d, answer: %d\n", lnum, answer);
                }

            }
            return answer;
        }
}
