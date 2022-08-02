package algoWeek;

public class algo09 {
    public static long solution(long n) {
        long answer = 0;
        double sqrt = 0.0;
        //제곱근을 구한다.
        sqrt = Math.sqrt(n);

        //int로 형변환을 하여 제곱근이 정수인지 아닌지 판단한다
        if (( sqrt - (int)sqrt ) == 0) {
            answer = (long) Math.pow(sqrt + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}
