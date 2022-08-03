package Programmers;

public class Pro12928 {
    // 약수의 합
    // 정수 n의 약수들의 합을 return
    public static int solution(int n) {
        int answer = 0;

        // 약수 중 제일 낮은 값이 2 이다.
        // 그래서 n/2까지만 계산해도 되고 마지막에 본 수의 값을 더하면 된다.
        for (int i = 0; i <= n/2; i++) {
            if (n % i == 0) {
                answer+=i;
            }
        }
        return answer+n;
    }
}

// 제곱근으로 풀 수도 있다.
// 나눠서 떨어지면 그 값과 몫을 answer에 더하고, 제곱근인경우는 그 값만 더하게 하면 된다.