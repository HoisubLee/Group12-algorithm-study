package Programmers;

public class Pro12921 {
    // 소수 찾기
    //                          값 범위
    public static int solution(int n) {
        // 소수 갯수 반환
        int answer = n - 1;


        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= (int)Math.sqrt(i); j++) {
                if (i % j == 0) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}

//에라토스테네스의 체 를 이용해서 풀면
//속도가 확 줄어든다!
// 에라토스테네스의 체 라는 것은 자기 자신을 제외한 배수를 지우고
// 지워둔 배열에서 소수를 찾는 식이다.
