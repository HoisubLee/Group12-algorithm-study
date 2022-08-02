package algoWeek;

public class algo07 {
    public static int[] solution(long n) {
        int[] answer = {};

        int length = (int)(Math.log10(n)+1);
        // 각 자릿수 값을 배열로 저장하기 위해 iArray 선언
        // 내림차순을 사용하기 위해 Integer타입으로 정의했다.
        answer = new int[length];

        // 10의 나머지값을 구하여 저장하고
        // 주어진 값을 10 나눠 다음 자릿수를 구할 수 있도록 했다.
        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}
